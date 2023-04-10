//ensyu4_11のパッケージ宣言
package ensyu4_11;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_11
 * 概要:入力された正の整数値を0までカウントダウンする
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_11 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数値を0までカウントダウンする
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
		System.out.println("カウントダウンします。");
		//出力用変数outputNumber
		int outputNumber;
		//入力用変数inputNumber
		int inputNumber;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された値を受け取る
			inputNumber=scannerInt.nextInt();
		//入力値が正の数でループ抜け	
		}while(inputNumber<=0);
		//入力値が0になるまでデクリメント
		for(outputNumber=inputNumber;outputNumber>-1;outputNumber--) {
			//出力用変数の値を表示
			System.out.println(outputNumber);
		}
	}
}