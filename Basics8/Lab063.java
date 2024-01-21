package src.Basics8;

import java.util.Collections;
import java.util.Stack;

public class Lab063 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("S");
        s.push("A");
        s.push("V");
        System.out.println(s);               // will display all list or stack

        System.out.println(s.pop());         // will display removed element
        System.out.println(s.peek());        // will display top element after removing V


        Collections.sort(s);
        System.out.println(s);


    }
}
