package Sem4;

import java.util.ArrayDeque;
import java.util.Stack;

public class Ex3 {
public static void main(String[] args) {
    String[] str = {"a", "b", "c", "d", "e"};
    Stack<String> stack = new Stack<>();

    for (int i = 0; i < str.length; i++) {
        stack.push(str[i]);
    }

    while (!stack.isEmpty()) {
        System.out.print(stack.pop() + " ");
    }
    System.out.println();

    ArrayDeque<String> arrDeq = new ArrayDeque<>();
    for (int i = 0; i < str.length; i++) {
        arrDeq.offer(str[i]);
            
    }

    while (!arrDeq.isEmpty()) {
        System.out.printf(arrDeq.poll() + " ");
    }

    // Stack operations:
    // push(E e) - добавляет элемент в верху стека
    // pop() - удаляет и возвращает верхний элемент стека
    // peek() - возвращает верхний элемент стека без удаления
    // isEmpty() - возвращает true, если стек пуст, иначе false
    // size() - возвращает количество элементов в стеке
 
}
}
