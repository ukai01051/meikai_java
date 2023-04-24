package ensyu7_4;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_4
 * 概要:1～入力値の和をsumUpメソッドで求めて表示
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_4 {
	/*
	 * 関数名:
	 * 概要:1～受け取った数値までの和を求めて返す
	 * 引数:型変数
	 * 戻り値:型変数
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static int sumUp(int n) {
		//合計値を格納する変数を宣言
		int totalValue=0;
		//カウントが入力値を超えたらループ抜け
		for(int countValue=1;countValue<=n;countValue++) {
			//合計値にカウントを足し込む
			totalValue=totalValue+countValue;
		}
		//合計値を返す
		return totalValue;
	}

	/*
	 * 関数名:main
	 * 概要:1から入力値までの和を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	public static void main(String[] args) {
		//
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		//メッセージを表示
		System.out.println("1から入力値までの前整数の和を表示します。");
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<1);
		//入力値が1の場合
		if(inputValue==1) {
			//メッセージを表示
			System.out.println("1です。");
		//入力値が1以外の場合
		}else {
			//合計値を求めるsumUpメソッドを呼び出し合計値を表示
			System.out.println("1から"+inputValue+"までの和は"+sumUp(inputValue)+"です。");
		}
	}
}
