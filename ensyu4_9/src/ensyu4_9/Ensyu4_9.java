//ensyu4_9のパッケージ宣言
package ensyu4_9;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:1～入力された値までの積を表示
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_9 {
	/*
	 * 関数名:main
	 * 概要:1～入力された値までの積を表示
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
		//インスタンスから入力された値を受け取る
		int inputValue=scannerInt.nextInt();
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
