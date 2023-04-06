//ensyu2_6のパッケージ宣言
package ensyu2_6;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:ensyu2_6
 * 概要:標準入力から底辺と高さを受け取り面積を表示する
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_6 {
	/*
	 * 関数名:main
	 * 概要:標準入力から底辺と高さを受け取り面積を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数とする
		Scanner scannerInt = new Scanner(System.in);
		//何を求めるのか説明
		System.out.println("三角形の面積を求めます。");
		//底辺の入力を促す
		System.out.print("底辺:");
		//入力された底辺の値をtriangleBaseに代入
		int triangleBase = scannerInt.nextInt();
		//高さの入力を促す
		System.out.print("高さ:");
		//入力された高さの値をtriangleHeightに代入
		int triangleHeight = scannerInt.nextInt();
		//入力された底辺と高さをもとに三角形の面積を表示
		System.out.println("面積は"+(triangleBase*triangleHeight)/2+"です。");
	}

}
