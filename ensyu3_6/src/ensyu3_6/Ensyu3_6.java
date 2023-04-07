//ensyu3_6のパッケージ宣言
package ensyu3_6;
//標準入力のインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_6
 * 概要:入力された正の整数値が10の倍数であるか表示するプログラム
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_6 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数値が10の倍数であるか表示するプログラム
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
		//10の倍数の場合
		}else if(firstNumber%10==0) {
			//10の倍数であることを表示
			System.out.println("その値は10の倍数です。");
		//10の倍数以外の場合
		}else {
			//10の倍数でないことを表示
			System.out.println("その値は10の倍数ではありません。");
		}
	}

}
