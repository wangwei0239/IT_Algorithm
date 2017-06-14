import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wangwei
 *
 */
public class P8 {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		reverse(stack);
		
		while (!stack.empty()) {
			System.out.println("Num:"+stack.pop());
		}
	}
	
	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.empty()){
			return result;
		}else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if(stack.empty()){
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	public static int getLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.isEmpty()){
			return result;
		}else {
			int last = getLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	
	
//------------------not right 1---------------------
	
//	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		for(int i = 1; i <= 5; i++){
//			stack.push(i);
//		}
//			
//		Queue<Integer>  queue = new LinkedList<>();
//		
//		reverse(stack,queue);
//		
//		while (!stack.empty()) {
//			System.out.println("Num:"+stack.pop());
//		}
//		
//	}
//	
//	public static void reverse(Stack<Integer> stack, Queue<Integer> queue){
//		if(!stack.empty()){
//			int i = stack.pop();
//			queue.offer(i);
//			reverse(stack,queue);
//			stack.push(queue.poll());
//		}
//	}
}
