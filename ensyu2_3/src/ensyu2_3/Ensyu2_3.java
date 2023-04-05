//ensyu2_3のパッケージ宣言
package ensyu2_3;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu2_3
 * 概要:標準入力から受け取った整数値を出力
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_3 {
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
		//入力された値を表示するためfirstNumberを表示
		System.out.println(firstNumber+"と入力しましたね。");
	}

}
