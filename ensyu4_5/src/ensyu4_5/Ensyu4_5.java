//ensyu4_5のパッケージ宣言
package ensyu4_5;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_5
 * 概要:正の整数値を0までカウントダウンする
 *      デクリメントを変数--から変数--に変え結果を確認
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_5 {
	/*
	 * 関数名:main
	 * 概要:正の整数値を0までカウントダウンする
	 *      デクリメントを変数--から変数--に変え結果を確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInt=new Scanner(System.in);
		
		//カウントダウンする趣旨を表示
		System.out.println("カウントダウンします。");
		//カウントダウン用の変数を宣言
		int countValue;
		
		//後判定ループ文
		do {
			//整数値の入力を促す
			System.out.print("正の整数値:");
			//インスタンスから入力された値を受け取る
			countValue=scanInt.nextInt();
		//入力値が正の整数の場合ループ抜け
		}while(countValue<=0);
		
		//カウントダウン用の変数が0になったらループ抜け
		while(countValue>=0) {
			//カウントダウンを表示してデクリメント
			System.out.println(--countValue);
		}	
	}
}
