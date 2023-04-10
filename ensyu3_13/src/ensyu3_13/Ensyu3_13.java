//ensyu3_13のパッケージ宣言
package ensyu3_13;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:入力された3つの整数の中央値を表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_13 {
	/*
	 * 関数名:main
	 * 概要:入力された3つの整数の中央値を表示
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
		System.out.print("整数値1:");
		//インスタンスから入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//2つ目の整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから入力された値を受け取る
		int secondNumber=scannerInt.nextInt();
		//3つ目の整数の入力を促す
		System.out.print("整数値3:");
		//インスタンスから入力された値を受け取る
		int thirdNumber=scannerInt.nextInt();
		//1つ目と2つ目の整数の値を比較し大きいほうの値をmaximumValueに代入
		int maximumValue = firstNumber > secondNumber ? firstNumber : secondNumber;
		//maximumValueに代入した整数と3つ目の整数を比較し大きいほうをmaximumValueに代入
		maximumValue = maximumValue > thirdNumber ? maximumValue : thirdNumber;
		
		//fistNumberが最大値の場合
		if(firstNumber==maximumValue) {
			//最大値firstNumberを除いた2の整数を比較して大きいほうを表示
			System.out.println(secondNumber >= thirdNumber ? secondNumber : thirdNumber);
		//secondNumberが最大値の場合
		} else if (secondNumber==maximumValue) {
			//最大値secondNumberを除いた2の整数を比較して大きいほうを表示
			System.out.println(firstNumber >= thirdNumber ? firstNumber : thirdNumber);
		//thirdNumberが最大値の場合
		}else if (thirdNumber==maximumValue) {
			//最大値thirdNumberを除いた2の整数を比較して大きいほうを表示
			System.out.println(firstNumber >= secondNumber ? firstNumber : secondNumber);
		}
	}
}
