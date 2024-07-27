package Sem2;
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd
// выход: abcd
public class Ex2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        StringBuilder res = getResString(str);
        System.out.println(res.toString());
    }

    private static StringBuilder getResString(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                res.append(str.charAt(i));
            }
        }
        return res;
    }
}
