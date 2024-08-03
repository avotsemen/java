package Sem5;

import java.util.HashMap;
import java.util.Map;

public class Ex0 {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(123456, "Иванов");
        users.put(321456, "Васильев");
        users.put(234561, "Петрова");
        users.put(234432, "Иванов");
        users.put(654321, "Петрова");
        users.put(345678, "Иванов");

        System.out.println("Сотрудники с фамилией Иванов: ");
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            if ("Иванов".equals(entry.getValue())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
