//ensyu3_8のパッケージ宣言
package ensyu3_8;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_8
 * 概要:得点に応じて評価を表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_8 {
	/*
	 * 関数名:main
	 * 概要:得点に応じて評価を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//点数の入力を促す
		System.out.print("点数:");
		//インスタンスから入力された値を受け取る
		int scoreValue=scannerInt.nextInt();
		//点数が0～59の場合
		if(0<=scoreValue && scoreValue<60) {
			//不可を表示
			System.out.println("不可");
		//点数が60～69の場合
		}else if(60<=scoreValue && scoreValue<70) {
			//可を表示
			System.out.println("可");
		//点数が70～79の場合
		}else if(70<=scoreValue && scoreValue<80) {
			//良を表示
			System.out.println("良");
		//点数が80～100の場合
		}else if(80<=scoreValue && scoreValue<=100) {
			//優を表示
			System.out.println("優");
		}
	}

}
