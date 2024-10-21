package Sem6.HomeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        String[][] laptops = {
                { "Dell", "8", "256", "Windows", "Black" },
                { "Apple", "16", "512", "macOS", "Silver" },
                { "HP", "8", "512", "Windows", "Gray" },
                { "Asus", "16", "1024", "Linux", "Black" },
                { "Lenovo", "4", "128", "Windows", "White" }
        };

        
        Scanner scanner = new Scanner(System.in);
        Map<String, String> filters = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criterion = scanner.nextInt();
        scanner.nextLine(); 

        switch (criterion) {
            case 1 -> {
                System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                String minRam = scanner.nextLine();
                filters.put("ram", minRam);
            }
            case 2 -> {
                System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                String minStorage = scanner.nextLine();
                filters.put("storage", minStorage);
            }
            case 3 -> {
                System.out.print("Введите операционную систему: ");
                String os = scanner.nextLine();
                filters.put("os", os);
            }
            case 4 -> {
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                filters.put("color", color);
            }
            default -> System.out.println("Некорректный критерий.");
        }

        
        List<String[]> filteredLaptops = new ArrayList<>(Arrays.asList(laptops));

        for (String[] laptop : laptops) {
            if (filters.containsKey("ram") && Integer.parseInt(laptop[1]) < Integer.parseInt(filters.get("ram"))) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("storage")
                    && Integer.parseInt(laptop[2]) < Integer.parseInt(filters.get("storage"))) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("os") && !laptop[3].equalsIgnoreCase(filters.get("os"))) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("color") && !laptop[4].equalsIgnoreCase(filters.get("color"))) {
                filteredLaptops.remove(laptop);
            }
        }

        if (filteredLaptops.isEmpty()) {
            System.out.println("Нет ноутбуков, соответствующих критериям.");
        } else {
            for (String[] laptop : filteredLaptops) {
                System.out.println(Arrays.toString(laptop));
            }
        }
    }
}
