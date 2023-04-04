package ensyu2_5;
import java.util.Scanner;

public class Ensyu2_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("xの値:");
		double x=scan.nextDouble();
		
		System.out.print("yの値:");
		double y=scan.nextDouble();
		
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
	}

}
