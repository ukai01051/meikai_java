//ensyu3_10のパッケージ宣言
package ensyu3_10;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_10
 * 概要:2つの入力された整数の差を求める
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_10 {
	/*
	 * 関数名:main
	 * 概要:2つの入力された整数の差を求める
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
		//2つの整数で大きいほうの値をmaximumValueに代入
		int maximumValue = firstNumber > secondNumber ? firstNumber : secondNumber;
		//2つの整数を小さいほうの値をminimumValueに代入
		int minimumValue= firstNumber < secondNumber ? firstNumber : secondNumber;
		//2つの整数の差を求める
		System.out.println("それらの差は"+(maximumValue-minimumValue)+"です。");
	}
}