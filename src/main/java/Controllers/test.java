/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author FPTSHOP
 */
public class test {

    static Map<String, Integer> staticalList = new HashMap<>();

    public static void main(String[] args) {
        List<String> idList = new ArrayList<>();
        idList.add("huy");
        idList.add("Ha");
        
        List<String> copy = idList.stream().map(x->x).collect(Collectors.toList());
        copy.set(0, "Dang");
        copy.stream().forEach(System.out::println);
    }

    public static <T extends Number> boolean checkIfNumberEqualZero(T number) {
        BigDecimal numToBigDecimal = new BigDecimal(number+"");
        if (numToBigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("This number cannot equal zero!");
            return false;
        }
        return true;
    }

    public static void testSetting() {
        staticalList.put("huy", 1);
        staticalList.put("huy", 2);
        staticalList.put("ha", 5);

        List<Integer> list = new ArrayList<>(staticalList.values());
        for (Map.Entry<String, Integer> entry : staticalList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        list.stream().forEach(x -> System.out.print(x + " "));
    }
}
