import java.util.Stack;

public class P13_solution2 {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
//		for(int i = 1; i <= 5; i++){
//			stack.push(i);
//		}
		
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		
		Utils.printStack(stack);
		
		pushMin(stack);
		
		Utils.printStack(stack);
	}

	
	public static void pushMin(Stack<Integer> stack){
		Stack<Integer> help = new Stack<>();
		while (!stack.empty()) {
			int cur = stack.pop();
			while (!help.empty() && help.peek() < cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while (!help.empty()) {
			stack.push(help.pop());
		}
	}
}
