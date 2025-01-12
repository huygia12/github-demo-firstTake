package dao.impl;

import dao.ShiftDAO;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import model.entities.Employee;
import model.entities.Shift;
import model.entities.ShiftEmployee;
import model.entities.Store;
import model.enums.ShiftState;

public class ShiftDAOImpl implements ShiftDAO {

    @Override
    public Shift addShift(Store store, EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Shift newShift = Shift.builder().store(store).state(ShiftState.STAGED).build();
            em.persist(newShift);
            transaction.commit();
            return newShift;
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public boolean openShift(Shift shift, List<Employee> employees, EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        try {
            employees.forEach(e -> {
                ShiftEmployee shiftEmployee = ShiftEmployee
                        .builder()
                        .employeeName(e.getFullname())
                        .employee(e)
                        .shift(shift)
                        .build();
                shift.getEmployees().add(shiftEmployee);
            });

            shift.setOpenAt(LocalDateTime.now());
            shift.setState(ShiftState.OPENED);

            transaction.begin();
            em.merge(shift);
            transaction.commit();
            return true;
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public boolean closeShift(Shift shift, EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        try {
            shift.setEndAt(LocalDateTime.now());
            shift.setState(ShiftState.CLOSED);

            transaction.begin();
            em.merge(shift);
            transaction.commit();
            return true;
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public boolean updateShift(Shift shift, List<Employee> employees, EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        try {
            shift.getEmployees().forEach(shiftEmployee -> {
                em.remove(shiftEmployee);
            });
            shift.getEmployees().clear();
            employees.forEach(e -> {
                ShiftEmployee shiftEmployee = ShiftEmployee
                        .builder()
                        .employeeName(e.getFullname())
                        .employee(e)
                        .shift(shift)
                        .build();
                shift.getEmployees().add(shiftEmployee);
            });

            transaction.begin();
            em.merge(shift);
            transaction.commit();
            return true;
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public Shift getShift(Long shiftId, EntityManager em) {
        Shift s = em.find(Shift.class, shiftId);
        return s;
    }

    @Override
    public Shift getLatestShift(Long storeId, EntityManager em) {
        System.out.println("storeid " + storeId);
        try {
            String jpql = "SELECT s FROM Shift s WHERE storeId = :storeId ORDER BY s.createdAt DESC";
            TypedQuery<Shift> query = em.createQuery(
                    jpql, Shift.class
            );
            query.setParameter("storeId", storeId);

            query.setMaxResults(1);
            return query.getSingleResult();
        } catch (NoResultException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }
}
