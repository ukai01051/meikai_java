package ensyu2_4;

import java.util.Scanner;
/*
* クラス名:Ensyu2_4
* 概要:標準入力から受け取った整数値を出力
* 作成者:ukai
* 作成日:2023/04/05
*/
public class Ensyu2_4{
	/*
	 * 関数名:main
	 * 概要:標準入力から受け取った整数値を出力
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
		//入力された値をint型変数firstNumberに代入
		int firstNumber = scannerInt.nextInt();
		//入力値に10を加えた数を表示するためfirstNumber+10を表示
		System.out.println("10を加えた数は"+(firstNumber+10)+"です。");
		//入力値を10減じた数を表示するためfirstNuber-10を表示
		System.out.println("10を減じた数は"+(firstNumber-10)+"です。");
	}

}
