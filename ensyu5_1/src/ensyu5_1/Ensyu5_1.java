//ensyu5_1のパッケージ宣言
package ensyu5_1;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu5_1	
 * 概要:入力値を８進数と１６進数で表示する
 * 作成者:ukai
 * 作成日:2023/04/12
 */
public class Ensyu5_1 {
	/*
	 * 関数名:main
	 * 概要:入力値を８進数と１６進数で表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/12
	 */
	public static void main(String[] args) {

		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		//後判定ループ文
		do {
			//メッセージを表示
			System.out.println("入力された値を8進数と16進数で表示します。");
			//整数の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<0);

		//8進数で入力値を表示
		System.out.printf("8進数では%oです。\n",inputValue);
		//16進数で入力値を表示
		System.out.printf("16進数では%xです。",inputValue);	
	}
}
