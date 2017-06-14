
public class Hanoi {
	public static void move(char from, char depend, char to, int level){
		if(level == 1){
			printMove(from, to, level);
		}else {
			move(from, to, depend, level-1);
			printMove(from, to, level);
			move(depend, from, to, level-1);
		}
	}
	
	public static void printMove(char from, char to, int level){
		System.out.println("从"+from+"移动盘子"+level+"号到"+to);
	}
	
	public static void main(String[] args) {
		int level = 3;
		move('A', 'B', 'C', level);
	}
}
