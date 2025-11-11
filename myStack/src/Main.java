import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for (int i = 0; i < 1100; i++) {
            stack.push(i);
        }

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.top());
        stack.pop();
        System.out.println("After pop, top = " + stack.top());
    }
}