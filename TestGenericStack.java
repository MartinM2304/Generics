package generics;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
		
			GenericStack<String> stack1 = new GenericStack<>();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter five strings");
			for(int i =0; i < 5; i++) {
				stack1.push(s.nextLine());
			}
				for(int i = 0; i < 5; i++) { 
					System.out.println(stack1.pop());
				}
			
			//stack1.push("London");
			//stack1.push("Paris");
			//stack1.push("Berlin");
			//System.out.println(stack1.peek());
			//System.out.println(stack1.pop());
			//System.out.println(stack1.peek());
			
			//GenericStack<Integer> stack2 = new GenericStack<>();
			//stack2.push(1); 
			//stack2.push(2);
			//stack2.push(3);
		
	}
	

}
