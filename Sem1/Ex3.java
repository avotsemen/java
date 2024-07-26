package Sem1;

public class Ex3 {
    public static void main(String[] args) {
        // Дана строка, поменять местами ее половины
        String str = "qwe5asd";
        String result = str.substring(str.length() / 2) +
                str.substring(0, str.length() / 2);
        System.out.println("result= " + result);
    }
}
