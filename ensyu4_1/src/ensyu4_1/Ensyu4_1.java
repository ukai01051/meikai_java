//ensyu4_1のインポート文
package ensyu4_1;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_1
 * 概要:入力された整数の正負,0を判断して表示を繰り返し行うプログラム
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_1 {
	/*
	 * 関数名:main
	 * 概要:入力された整数の正負,0を判断して表示を繰り返し行うプログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInt = new Scanner(System.in);
		//繰り返し用の関数を作成
		int retryValue;
		//後判定ループ
		do {
			//整数値の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された数値を受け取る
			int inputValue = scanInt.nextInt();
			//整数値が正の数の場合
			if(inputValue>0) {
				//正の数であることを表示
				System.out.println("その値は正です。");
			//整数値が負の数の場合
			}else if(inputValue<0) {
				//負の数であることを表示
				System.out.println("その値は負です。");
			//整数値が0の場合
			}else {
				//0であることを表示
				System.out.println("その値は0です。");
			}
			//繰り返し行うか選択を促す
			System.out.println("もう一度？ 1...Yes/0...No:");
			//インスタンスから入力された数値を受け取る
			retryValue=scanInt.nextInt();
		//繰り返し用の関数に応じて繰り返すか判断
		} while (retryValue==1);
	}
}
