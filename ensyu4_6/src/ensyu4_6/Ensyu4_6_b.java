//ensyu4_6_bのパッケージ宣言
package ensyu4_6;
//標準入力のためのインポート文
import java.util.Scanner;
/* 
 * クラス名:Ensyu4_6
 * 概要:入力値から受け取った分だけ＊を表示
 *      入力値が1未満の時改行を表示しない
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_6_b {
	/*
	 * 関数名:main
	 * 概要:入力値から受け取った分だけ＊を表示
	 *      入力値が1未満の時改行を表示しない
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
		System.out.print("何個＊を表示しますか:");
		//インスタンスから入力された値を受け取る
		int inputNumber=scannerInt.nextInt();
		//出力用の変数を宣言して初期化
		int outputNumber=1;
		//前判定ループ文
		//出力した値と入力値が等しくなったらループ抜け
		while(outputNumber<=inputNumber) {
			//*を表示
			System.out.print('*');
			//出力用の変数をインクリメント
			outputNumber++;
		}
		//入力値が1以上の場合
		if(inputNumber>=1)
			//改行を出力
			System.out.println();
	}
}
