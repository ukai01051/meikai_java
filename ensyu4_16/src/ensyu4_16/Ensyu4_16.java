//ensyu4_16のパッケージ宣言
package ensyu4_16;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_16
 * 概要:入力値分だけ＊を表示 5個表示ごとに改行を出力
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_16 {
	/*
	 * 関数名:main
	 * 概要:入力値分だけ＊を表示 5個表示ごとに改行を出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInteger=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("何個*を表示しますか:");
		//インスタンスから入力された値を受け取る
		int inputValue=scannerInteger.nextInt();
		//カウントが入力値を超えたらループ抜け
		for(int countValue=1;countValue<=inputValue;countValue++) {
			//＊を表示
			System.out.print("*");
			//＊を5個表示ごと
			if(countValue%5==0) {
				//改行を出力
				System.out.println();
			}
		}
	}

}
