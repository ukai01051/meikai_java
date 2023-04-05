//ensyu2_8のパッケージ宣言
package ensyu2_8;
//乱数生成のためのインポート文
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu2_8
 * 概要:入力された値の±5の範囲の乱数を生成する
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_8 {
	/*
	 * 関数名:main
	 * 概要:入力された値の±5の範囲の乱数を生成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数とする
		Scanner scannerInt = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値:");
		//標準入力された値をインスタンスから受け取る
		int inputNumber = scannerInt.nextInt();
		//Randomクラスの引数なしのインスタンスを作成
		Random randomGeneration = new Random();
		//-5～5の乱数を生成する
		int randomNumber = randomGeneration.nextInt(11)-5;
		//入力された値の±5の乱数を表示する
		System.out.println("その値の±5の乱数を生成しました。それは"+(inputNumber+randomNumber)+"です。");
	}

}
