package Collections_17;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	static void showPush(Stack<Integer> st, int element) {
		st.push(element);
		System.out.println("push ( " + element + " )");
		System.out.println("Stack: " + st);
	}

	static void showPop(Stack<Integer> st) {
		System.out.println("pop -> ");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();

		System.out.println("stack: " + st);
		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);
		showPop(st);
		showPop(st);
		showPop(st);

		try {
			showPop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}
