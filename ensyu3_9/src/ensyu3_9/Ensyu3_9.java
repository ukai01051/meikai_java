//ensyu3_9のパッケージ宣言
package ensyu3_9;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_9
 * 概要:標準入力から受け取った2つの実数値を比較し大きいほうを表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_9 {
	/*
	 * 関数名:main
	 * 概要:標準入力から受け取った2つの実数値を比較し大きいほうを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerDouble=new Scanner(System.in);
		//1つ目の実数の入力を促す
		System.out.print("実数値1:");
		//インスタンスから入力された値を受け取る
		double firstNumber=scannerDouble.nextDouble();
		//2つ目の実数の入力を促す
		System.out.print("実数値2:");
		//インスタンスから入力された値を受け取る
		double secondNumber=scannerDouble.nextDouble();
		//2つの実数を比較して大きいほうの値をmaximumValueに代入
		double maximumValue = firstNumber > secondNumber ? firstNumber : secondNumber;
		//maximumValueを表示
		System.out.println("大きいほうの値は"+maximumValue+"です。");
	}

}
