//ensyu3_1のパッケージ宣言
package ensyu3_1;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_1
 * 概要:入力された値の絶対値を表示
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu3_1 {
	/*
	 * 関数名:main
	 * 概要:入力された値の絶対値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数とする
		Scanner scannerInt = new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		int inputNumber = scannerInt.nextInt();
		//入力された値が正の数の場合
		if(inputNumber>0) {
			//入力された値のまま表示
			System.out.println("その絶対値は"+inputNumber+"です。");
		//入力された値が負の数の場合
		}else if(inputNumber<0) {
			//入力された値に-をつけて表示
			System.out.println("その絶対値は"+(-inputNumber)+"です。");
		//入力された値が0の場合
		}else {
			//0であることを示す文を表示
			System.out.println("その絶対値は0です。");
		}
	}

}
