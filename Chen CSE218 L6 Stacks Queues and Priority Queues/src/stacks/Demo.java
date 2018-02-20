package stacks;

public class Demo {

	public static void main(String[] args) {
		StackX theStack = new StackX(4);
		while(!theStack.isFull()) {
			theStack.push(20);
			theStack.push(30);
			theStack.push(40);
			theStack.push(50);
		}
		
		while(!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}
		
		
	}

}
