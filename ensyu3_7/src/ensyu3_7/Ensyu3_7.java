//ensyu3_7のパッケージ宣言
package ensyu3_7;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_7
 * 概要:入力された正の整数を3で割った余りを表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_7 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数を3で割った余りを表示
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
		//3で割り切れる場合
		}else if(firstNumber%3==0) {
			//3で割り切れることを表示
			System.out.println("その値は3で割り切れます。");
		//3で割った余りが2の場合
		}else if(firstNumber%3==2) {
			//3で割った余りが2であることを表示
			System.out.println("その値を3で割った余りは2です。");
		//3で割った余りが1の場合
		}else if(firstNumber%3==1) {
			//3で割った余りが1であることを表示
			System.out.println("その値を3で割った余りは1です。");
		}
	}

}
