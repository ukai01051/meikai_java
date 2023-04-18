//ensyu5_2のパッケージ宣言
package ensyu5_2;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu5_2
 * 概要:float型とdouble型の変数に値を読み込み表示する
 * 作成者:ukai
 * 作成日:2023/04/12
 */
public class Ensyu5_2 {
	/*
	 * 関数名:main
	 * 概要:float型とdouble型の変数に値を読み込み表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanReal=new Scanner(System.in);
		//float型変数を宣言
		float firstNumber=0;
		//double型変数を宣言
		double secondNumber=0;
		
		//概要説明を表示し実数数の入力を促す
		System.out.print("変数firstNumberはfloat型で、変数secondNumberはdouble型です。\nfirstNumber:");
		//インスタンスから入力された値を受け取る
		firstNumber=scanReal.nextFloat();
		//実数値の入力を促す
		System.out.print("secondNumber:");
		//インスタンスから入力された値を受け取る
		secondNumber=scanReal.nextDouble();
		//float型変数に格納された値を表示
		System.out.println("firstNumber="+firstNumber);
		//double型変数に格納された値を表示
		System.out.println("secondNumber="+secondNumber);
		

	}

}
