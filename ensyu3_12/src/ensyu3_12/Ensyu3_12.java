//ensyu3_12のパッケージ宣言
package ensyu3_12;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_12
 * 概要:入力された3つの整数値を比較し最小値を表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_12 {
	/*
	 * 関数名:main
	 * 概要:入力された3つの整数値を比較し最小値を表示
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
		//1つ目と2つ目の整数の値を比較し小さいほうの値をminimumValueに代入
		int minimumValue = firstNumber < secondNumber ? firstNumber : secondNumber;
		//minimumValueに代入した整数と3つ目の整数を比較し小さいほうをminimumValueに代入
		minimumValue= minimumValue < thirdNumber ? minimumValue : thirdNumber;
		//最小値minimumValueを表示
		System.out.println("最小値は"+minimumValue+"です。");
	}

}
