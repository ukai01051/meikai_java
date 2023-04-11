//ensyu4_9のパッケージ宣言
package ensyu4_9;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:1～入力値までの積を表示
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_9 {
	/*
	 * 関数名:main
	 * 概要:1～入力値までの積を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		
		//入力値を代入する変数を宣言
		int inputValue;
		//概要説明を表示
		System.out.println("1からnまでの積を表示します。");
		
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("nの値:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInt.nextInt();
			//
			if(inputValue>12) {
				//
				System.out.println("nが13以上だと正常に表示できません。");
			}
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);

		//カウント用変数countValueを宣言して初期化
		int countValue=1;
		//合計用変数totalValueを宣言して初期化
		int totalValue=1;
		//カウント用変数の値が入力値を上回ったらループ抜け
		while(inputValue>=countValue) {
			//1～入力値の積を合計用変数に代入
			totalValue=countValue*totalValue;
			//カウント用変数をインクリメント
			countValue++;
		//1～入力値の積を表示
		}System.out.println("1から"+inputValue+"までの積は"+totalValue+"です。");
	}

}
