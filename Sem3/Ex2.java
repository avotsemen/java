package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Заполнить список названиями планет Солнечной 
// системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его 
// повторений в списке 
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество планет:");
        int n = scanner.nextInt();

        List<String> planets = new ArrayList<>();
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        List<String> rndPlanets = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int) (Math.random() * planets.size())));
        }
        System.out.println(rndPlanets);
        Collections.sort(rndPlanets);
        System.out.println(rndPlanets);
        int cnt = 1;
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                cnt++;
            } else {
                System.out.println("Планета: " + rndPlanets.get(i - 1) + ", количество повторений: " + cnt);
                cnt = 1;
            }
        }
        System.out.println("Планета: " + rndPlanets.get(rndPlanets.size()-1) + ", количество повторений: " + cnt);

        for (int i = 1; i < rndPlanets.size(); i++) {
            if (rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                rndPlanets.remove(i-1);
            }
        }
        
        System.out.println(rndPlanets);

        scanner.close();

    }

}
