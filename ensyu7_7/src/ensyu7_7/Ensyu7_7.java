package ensyu7_7;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_7
 * 概要:putCharsメソッドを用いて左下直角の三角形を表示
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_7 {
	/*
	 * 関数名:putStars ※教本の表記
	 * 概要:putCharsを呼び出す
	 * 引数:受け取った段数を格納するint型変数[n] ※教本の表記
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static void putStars(int n) {
		putChars('*',n);
	}
	/*
	 * 関数名:putChars ※教本の表記
	 * 概要:受け取ったchar型の引数を表示
	 * 引数:受け取った文字を格納するchar型変数[c] ※教本の表記
	 * 		受け取った段数を格納するint型変数[n] ※教本の表記
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static void putChars(char c,int n) {
		//受け取ったint型変数の値をデクリメントしながら値が0より大きい場合
		while(n-- >0) {
			//char型の引数を表示
			System.out.print(c);
		}
	}
	/*
	 * 関数名:main
	 * 概要:段数を入力させputCharメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		//メッセージを表示
		System.out.println("左下直角三角形を表示します。");
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("段数は:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);
		//カウントが入力値と等しくなればループ抜け
		for(int countValue=1;countValue<=inputValue;countValue++) {
			//putCharsメソッドを呼び出す
			putStars(countValue);
			//改行を出力
			System.out.println();
		}
	}
}
