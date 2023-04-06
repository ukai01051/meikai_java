//ensyu3_16のパッケージ宣言
package ensyu3_16;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_16
 * 概要:入力された3つの整数を昇順にソートして表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_16 {
	/*
	 * 関数名:main
	 * 概要:入力された3つの整数を昇順にソートして表示
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
		//3つ目の整数の入力を促す
		System.out.print("変数c:");
		//インスタンスから入力された値を受け取る
		int thirdNumber=scannerInt.nextInt();
		
		//ソート用の変数を宣言
		int sortValue;
		//aに入力した数値がbに入力した数値より大きい場合
		if(firstNumber>secondNumber) {
			//ソート用の変数にaに入力した値を移動
			sortValue=firstNumber;
			//bに入力した値をfirstNumberに代入
			firstNumber=secondNumber;
			//aとbに入力した値を交換
			secondNumber=sortValue;
		//secondNumberがcに入力した数値より大きい場合
		}if(secondNumber>thirdNumber) {
			//ソート用の変数にsecondNumberの値を移動
			sortValue=secondNumber;
			//cに入力した値をsecondNumberに代入
			secondNumber=thirdNumber;
			//secondNumberとcに入力した値を交換
			thirdNumber=sortValue;
		//firstNumber
		}if(firstNumber>secondNumber) {
			//ソート用の変数にfirstNumberの値を移動
			sortValue=firstNumber;
			//secondNumberをfirstNumberに代入
			firstNumber=secondNumber;
			//firstNumberとsecondNumberの値を交換
			secondNumber=sortValue;
		//
		}
		//ソートする趣旨を表示
		System.out.println("a≦bとなるようにソートしました。");
		//降順に表示
		System.out.println("変数aは"+firstNumber+"です。");
		//降順に表示
		System.out.println("変数bは"+secondNumber+"です。");
		//降順に表示
		System.out.println("変数bは"+thirdNumber+"です。");
				
	}

	

}
