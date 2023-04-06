//ensyu2_5のパッケージ宣言
package ensyu2_5;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:
 * 概要:2つの実数値を標準入力から受け取りその和と平均を出力する
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_5 {
	/*
	 * 関数名:main
	 * 概要:2つの実数値を標準入力から受け取りその和と平均を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数とする
		Scanner scannerDouble = new Scanner(System.in);
		//1つ目の数値の入力を促す
		System.out.print("firstNumberの値:");
		//1回目の標準入力から受け取った値を1つ目のdouble型変数firstNumberに代入
		double firstNumber=scannerDouble.nextDouble();
		//2つ目の数値の入力を促す
		System.out.print("secondNumberの値:");
		//2回目の標準入力から受け取った値を2つ目のdouble型変数secondNumberに代入
		double secondNumber=scannerDouble.nextDouble();
		//2つの実数値の合計を出力		
		System.out.println("合計は"+(firstNumber+secondNumber)+"です。");
		//2つの実数値の平均を出力
		System.out.println("平均は"+(firstNumber+secondNumber)/2+"です。");
		
	}

}
