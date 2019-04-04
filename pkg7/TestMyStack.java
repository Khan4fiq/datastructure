
package week.pkg7;

import java.util.Scanner;

public class TestMyStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        MyStack<Character> stack = new MyStack<>();
        
        stack.push('a');        
        stack.push('b');        
        stack.push('c');
        System.out.println(stack);
        System.out.println("Choose a character: ");
        char x = input.next().charAt(0);
        System.out.println(stack.search(x));



    }
    
}
