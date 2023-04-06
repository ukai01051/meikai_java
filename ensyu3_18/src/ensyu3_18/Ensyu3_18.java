//ensyu3_18のパッケージ宣言
package ensyu3_18;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_18
 * 概要:月によって表示させる季節を場合分けする
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_18 {
	/*
	 * 関数名:main
	 * 概要:月によって表示させる季節を場合分けする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInt= new Scanner(System.in);
		//月の入力を促す
		System.out.println("月を入力してください。");
		//インスタンスから値を受け取る
		int monthValue = scanInt.nextInt();
		//入力された値によって場合分け
		switch(monthValue) {
		//3,4,5の場合を表示
		case 3,4,5 :System.out.println("季節は春です。");
		//プログラム終了
		break;
		//6,7,8の場合夏を表示
		case 6,7,8 :System.out.println("季節は夏です。");
		//プログラム終了
		break;
		//9,10,11の場合秋を表示
		case 9,10,11 :System.out.println("季節は秋です。");
		//プログラム終了
		break;
		//12,1,2の場合冬を表示
		case 12,1,2 :System.out.println("季節は冬です。");
		//プログラム終了
		break;
		
		}

	}

}
