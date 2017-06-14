import java.util.Stack;

public class P13 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		Utils.printStack(stack);
		
		Stack<Integer> help = new Stack<>();
		
		while (!stack.empty()) {
			pushMin(help, stack.pop());
		}
		
		Utils.printStack(help);
		
	}
	
	public static void pushMin(Stack<Integer> stack, int num){
		if(stack.isEmpty()){
			stack.push(num);
		}else {
			int cur = stack.peek();
			if(cur >= num){
				stack.push(num);
			}else {
				cur = stack.pop();
				pushMin(stack, num);
				stack.push(cur);
			}
		}
	}
}
