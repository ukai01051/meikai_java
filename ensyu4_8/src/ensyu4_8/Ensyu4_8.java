//ensyu4_8のパッケージ宣言
package ensyu4_8;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_8
 * 概要:入力された整数の桁数を表示
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_8 {
	/*
	 * 関数名:main
	 * 概要:入力された整数の桁数を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力値を受け取ってinputNumberに代入
		int inputNumber=scannerInt.nextInt();
		//カウント用の変数countValueを宣言して初期化
		int countValue=0;
		//入力値用の変数の値が0になったらループ抜け
		while(inputNumber>0) {
			//入力値の変数の値を10で割った商を代入
			inputNumber=inputNumber/10;
			//カウント用の変数をインクリメント
			countValue++;
		}
		//桁数を表示
		System.out.println("その値は"+countValue+"桁です。");
	}

}
