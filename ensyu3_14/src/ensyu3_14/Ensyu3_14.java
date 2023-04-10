//ensyu3_14のパッケージ宣言
package ensyu3_14;
//標準出力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_14
 * 概要:入力した2つの整数値を表示し等しい場合にはメッセージを表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_14 {
	/*
	 * 関数名:main
	 * 概要:入力した2つの整数値を表示し等しい場合にはメッセージを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//1つ目の整数の入力を促す
		System.out.print("変数a:");
		//インスタンスから入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//2つ目の整数の入力を促す
		System.out.print("変数b:");
		//インスタンスから入力された値を受け取る
		int secondNumber=scannerInt.nextInt();

		//1つ目に入力された数のほうが大きかった場合
		if(firstNumber>secondNumber) {
			//ソート用の変数を宣言して1つ目の整数の値を入力
			int sortValue=firstNumber;
			//2つ目に入力された値をfirstNumberに代入
			firstNumber=secondNumber;
			//2つの整数の入れ替えが完了
			secondNumber=firstNumber;
		}
		//変数aを表示
		System.out.println("変数aは"+firstNumber+"です。");
		//変数bを表示
		System.out.println("変数bは"+secondNumber+"です。");
		//2つの整数が等しい場合
		if(firstNumber==secondNumber)
			//2つの整数の値が同じであると表示
			System.out.println("2つの値は同じです。");
	}
}