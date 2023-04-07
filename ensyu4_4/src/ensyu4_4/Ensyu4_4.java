//ensyu4_4のパッケージ宣言
package ensyu4_4;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_4
 * 概要:正の整数値を入力させカウントダウンを表示する
 *      最終的にカウントダウン用の変数が-1であることを確認する
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_4 {
	/*
	 * 関数名:main
	 * 概要:正の整数値を入力させカウントダウンを表示する
	 *      最終的にカウントダウン用の変数が-1であることを確認する
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
		
		//前判定ループ文
		//カウントダウン用変数の値が0になったらループ抜け
		while(countValue>=0) {
			//カウントダウン用変数の値を表示
			System.out.println(countValue);
			//カウントダウン用変数の値をデクリメント
			countValue--;
		//countValueの値が-1であることを表示して確認
		}System.out.println("countValueの値:"+countValue);
	}
}
