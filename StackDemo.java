package classworkitujava;

class Stack {
	int[] item;
	int top;
	int default_capcity = 10;

	Stack() {
		top = -1;
		item = new int[default_capcity];
	}

	Stack(int capacity) {
		top = -1;
		item = new int[capacity];
	}

	void push(int x) {
		if (isFull())
			System.out.println("Stack is full. Cannot Push");
		else {
			top++;
			item[top] = x;
			System.out.println(x + " is pushed to stack");
		}
	}

	boolean isFull() {
		if (top == item.length - 1)
			return true;
		else
			return false;
	}

	int pop() {
		int x = -99;
		if (isEmpty())
			System.out.println("Stack is empty. Cannot Pop");
		else {
			x = item[top];
			top--;
			System.out.println(x + " is poped out of stack");
		}
		return x;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
	
	void printStack(){
		System.out.println("Printing Stack: ");
		for(int i=top; i>=0; i--){
			System.out.println(item[i]);
		}
	}

}

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(100);
		s.push(300);
		s.push(400);
		s.printStack();
		int y= s.pop();
		s.printStack();
		s.pop();
		s.pop();
		s.pop();
		
	}
}
