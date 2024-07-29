package Sem3;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<ArrayList<String>> bookKatalog = new ArrayList<>();
        int rows = 10;
        int cols = 10;
        addHeader(bookKatalog, "Проза", new String[] { "1", "2", "3", "4", "5" });
        addHeader(bookKatalog, "Сказка", new String[] { "1", "2", "3", "4", "5" });

        System.out.println(bookKatalog);

        for (ArrayList<String> janr : bookKatalog) {
            System.out.println("Жанр: " + janr.get(0));
            System.out.println("Список книг:");
            for (int i = 1; i < janr.size(); i++) {
                System.out.printf(janr.get(i) + " ");
            }
            System.out.println();
        }

    }

    public static void addHeader(List<ArrayList<String>> bookKatalog, String janr, String[] book) {
        ArrayList<String> list = new ArrayList<>();
        list.add(janr);
        for (int i = 0; i < book.length; i++) {
            list.add(book[i]);
        }
        bookKatalog.add(list);
    }
}
