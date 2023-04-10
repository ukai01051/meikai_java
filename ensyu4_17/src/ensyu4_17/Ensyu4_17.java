//ensyu4_17のパッケージ宣言
package ensyu4_17;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_17
 * 概要:入力値の整数の約数とその個数を表示
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_17 {
	/*
	 * 関数名:main
	 * 概要:入力値の整数の約数とその個数を表示
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
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		int inputValue=scannerInteger.nextInt();
		//約数の個数を表示するための変数を宣言して初期化
		int outputValue=0;
		
		//カウントが入力値を超えたらループ抜け
		for(int countValue=1;countValue<=inputValue;countValue++) {
			//カウント用変数の値が入力値の約数である場合
			if(inputValue%countValue==0) {
				//約数の値を表示
				System.out.println(countValue);
				//変数の個数をインクリメント
				outputValue++;
			}
		
		}
		//変数の個数を表示
		System.out.println("約数は"+outputValue+"個です。");
	}

}
