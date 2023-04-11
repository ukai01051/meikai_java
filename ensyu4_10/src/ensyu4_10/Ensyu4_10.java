//ensyu4_10のパッケージ宣言
package ensyu4_10;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu_
 * 概要:入力された値の数だけ＊を表示
 * 入力値が1未満の場合は改行を表示しない
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_10 {
	/*
	 * 関数名:main
	 * 概要:入力された値の数だけ＊を表示
	 *      入力値が1未満の場合は改行を表示しない
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
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何個*を表示しますか:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInt.nextInt();
		}
		//正の数が入力されたらループ抜け
		while(inputValue<=0);

		
		//カウント用変数が入力値を超えたらループ抜け
		for(int countValue=0;countValue<inputValue;countValue++) {
			//*を表示
			System.out.print('*');
		}
		//入力値が1以上の場合
		if(inputValue>=1) {
			//改行を出力
			System.out.println();
		}
	}
}
