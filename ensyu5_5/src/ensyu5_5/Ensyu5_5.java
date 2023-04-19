//ensyu5_5のパッケージ宣言
package ensyu5_5;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu5_5
 * 概要:３つの整数の合計と実数の平均を表示
 * 作成者:ukai
 * 作成日:2023/04/12
 */
public class Ensyu5_5 {
	/*
	 * 関数名:main
	 * 概要:３つの整数の合計と実数の平均を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言 
		int firstNumber=0,secondNumber=0,thirdNumber=0;
		
			//整数の入力を促す
			System.out.print("整数値1:");
			//インスタンスから入力された値を受け取る
			firstNumber=scanInteger.nextInt();
		
			//整数の入力を促す
			System.out.print("整数値2:");
			//インスタンスから入力された値を受け取る
			secondNumber=scanInteger.nextInt();
		
			//整数の入力を促す
			System.out.print("整数値3:");
			//インスタンスから入力された値を受け取る
			thirdNumber=scanInteger.nextInt();
		
		//合計値を表示
		System.out.println("合計は"+(firstNumber+secondNumber+thirdNumber)+"です。");
		//合計値をdouble型にキャスト
		double totalValue=(double)(firstNumber+secondNumber+thirdNumber);
		//平均値を表示
		System.out.println("平均は"+totalValue/3+"です。");
	}
}
