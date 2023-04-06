//ensyu3_14のパッケージ宣言
package ensyu3_14;
//標準出力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:入力した2つの整数値を昇順にソートし等しい場合にはメッセージを表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_14 {
	/*
	 * 関数名:main
	 * 概要:入力した2つの整数値を昇順にソートし等しい場合にはメッセージを表示する
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
		//aに入力した数値がbに入力した数値より大きい場合
		if(firstNumber>secondNumber) {
			//ソート用の変数を宣言してaに入力した変数を移動
			int sortValue=firstNumber;
			//bに入力した変数をfirstNumberに代入
			firstNumber=secondNumber;
			//aとbに入力した値を交換しソート完了
			secondNumber=sortValue;
		//2つの整数が違う場合
		}if(firstNumber!=secondNumber) 
			//ソートする趣旨を表示
			System.out.println("a≦bとなるようにソートしました。");
		//昇順に表示
		System.out.println("変数aは"+firstNumber+"です。");
		//昇順に表示j
		System.out.println("変数bは"+secondNumber+"です。");
		//2つの整数が等しい場合
		if(firstNumber==secondNumber)
			//2つの整数の値が同じであると表示
			System.out.println("2つの値は同じです。");
	}
}