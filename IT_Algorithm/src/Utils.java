import java.util.Iterator;
import java.util.Stack;

public class Utils {
	public static void printStack(Stack<Integer> stack){
		
		System.out.println("Current Stack");
		
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
