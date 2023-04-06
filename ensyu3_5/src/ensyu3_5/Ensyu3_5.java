//ensyu3_5
package ensyu3_5;
//
import java.util.Scanner;
/*
 * クラス名:Ensyu3_5
 * 概要:入力された値が5で割り切れるかを表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_5 {
	/*
	 * 関数名:main
	 * 概要:入力された値が5で割り切れるかを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//負の数が入力された場合
		if(firstNumber<0) {
			//負の数であることを表示
			System.out.println("正でない値が入力されました。");
		//5で割り切れる値の場合
		}else if(firstNumber%5==0) {
			//割り切れることを表示
			System.out.println("その値は5で割り切れます。");
		//5で割り切れない値の場合
		}else {
			//割り切れないことを表示
			System.out.println("その値は5で割り切れません。");
		}
	}

}
