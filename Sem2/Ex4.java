package Sem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
public class Ex4 {
    public static void main(String[] args) throws Exception {
        String str = "TEST\n".repeat(100);
        writeToFile(str, "test.txt");
    }

    public static void writeToFile(String content, String fileName) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            System.out.println("Строка успешно записана в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл " + fileName);
        }
    }
}
