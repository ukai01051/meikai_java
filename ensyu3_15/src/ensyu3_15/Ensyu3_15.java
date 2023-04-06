//ensyu3_15
package ensyu3_15;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:入力した2つの整数値を降順にソートし表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_15 {
	/*
	 * 関数名:main
	 * 概要:入力した2つの整数値を降順にソートし表示
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
		//aに入力した数値がbに入力した数値より小さい場合
		if(firstNumber<secondNumber) {
			//ソート用の変数を宣言してaに入力した変数を移動
			int sortValue=firstNumber;
			//bに入力した変数をfirstNumberに代入
			firstNumber=secondNumber;
			//aとbに入力した値を交換しソート完了
			secondNumber=sortValue;
		}
		//ソートする趣旨を表示
		System.out.println("a≧bとなるようにソートしました。");
		//降順に表示
		System.out.println("変数aは"+firstNumber+"です。");
		//降順に表示j
		System.out.println("変数bは"+secondNumber+"です。");
	}

}
