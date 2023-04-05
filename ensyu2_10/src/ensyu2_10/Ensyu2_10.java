//ensyu2_10のパッケージ宣言
package ensyu2_10;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu2_10
 * 概要:名字と名前を分けて入力させ合わせて表示する
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_10 {
	/*
	 * 関数名:main
	 * 概要:名字と名前を分けて入力させ合わせて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数として扱う
		Scanner scannerString = new Scanner(System.in);
		//名字の入力を促す
		System.out.print("姓:");
		//入力された名字をインスタンスから受け取る
		String lastName =scannerString.next();
		//名前の入力を促す
		System.out.print("名:");
		//入力された名前をインスタンスから受け取る
		String firstName =scannerString.next();
		//名字と名前を合わせて表示する
		System.out.println("こんにちは"+lastName+firstName+"さん。");
	}

}
