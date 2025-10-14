package java_dsa.collection.stack;

import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(34);
        stack.addLast(32);
        stack.addFirst(2);
        stack.push(89);
        stack.removeFirst();
        stack.removeLast();
        System.out.println(stack.contains(2));
        System.out.println( stack.peek());
        System.out.println(stack.get(2));
        System.out.println(stack.set(5,15));
        System.out.println(stack.size());
        System.out.println(stack.stream().count());
        System.out.println(stack.hashCode());
        System.out.println(stack.spliterator().characteristics());
        System.out.println(stack);
    }
}
