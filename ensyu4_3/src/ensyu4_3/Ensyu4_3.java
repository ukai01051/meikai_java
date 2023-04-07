//ensyu4_3のパッケージ宣言
package ensyu4_3;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_3
 * 概要:
 * 作成者:ukai作成日:2023/04/07
 */
public class Ensyu4_3 {
	/*
	 * 関数名:main概要:引数:戻り値:作成者:ukai作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値1:");
		//インスタンスから入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから入力された値を受け取る
		int secondNumber=scannerInt.nextInt();
		//出力用の変数を宣言して初期化
		int outputValue=0;
		//値が大きい整数用の変数を宣言して初期化
		int maximumValue=0;
		//最初に入力された整数のほうが小さい場合
		if (firstNumber<secondNumber) {
			//1つ目に入力された整数値を表示
			System.out.print(firstNumber);
			//出力用の変数に1つ目に入力された値を代入
			outputValue=firstNumber;
			//値が大きい用の変数に2つ目に入力された値を代入
			maximumValue=secondNumber;
		//最初に入力された整数のほうが大きい場合
		}else if(firstNumber>secondNumber) {
			//2つ目に入力された整数値を表示
			System.out.print(secondNumber);
			//出力用の変数に2つ目に入力された値を代入
			outputValue=secondNumber;
			//値が大きい用の変数に1つ目に入力された値を代入
			maximumValue=firstNumber;
		//後判定ループ文
		}do {
			//2つの整数値が同じ場合
			if(firstNumber==secondNumber)
				//無限ループ回避のためループ抜け
				break;
			//出力用の変数の値に＋1
			outputValue =outputValue+1;
			//出力用変数の値を表示
			System.out.print(" "+outputValue);
		//出力用変数の値が大きいほうの整数値と等しくなったらループ抜け
		}while(outputValue!=maximumValue);
	}

}
