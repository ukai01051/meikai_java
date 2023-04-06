//ensyu3_3
package ensyu3_3;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:
 * 概要:入力された値の正負,0を表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_3 {
	/*
	 * 関数名:main
	 * 概要:入力された値の正負,0を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値:");
		//入力された値をインスタンスから受け取る
		int firstNumber=scannerInt.nextInt();
		
		//入力された値が正の数の場合
		if(firstNumber>0) {
			//正の数であることを表示
			System.out.println("その値は正です。");
		//入力された値が負の数の場合
		}else if(firstNumber<0) {
			//負の数であることを表示
			System.out.println("その値は負です。");
		//入力された値が0の場合
		}else if(firstNumber==0) {
			//0であることを表示
			System.out.println("その値は0です。");
		}
	}

}
