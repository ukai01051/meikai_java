//ensyu3_2のパッケージ宣言
package ensyu3_2;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_2
 * 概要:入力された2つの整数値の後者が前者の約数であるかを表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_2 {
	/*
	 * 関数名:main
	 * 概要:入力された2つの整数値の後者が前者の約数であるかを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力System.inを引数とする
		Scanner scannerInt = new Scanner(System.in);
		//1つ目の整数の入力を促す
		System.out.print("整数値1:");
		//インスタンスから入力された値を受け取る
		int firstNumber = scannerInt.nextInt();
		//2つ目の整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから入力された値を受け取る
		int secondNumber = scannerInt.nextInt();
				
		//2つ目の整数が１つ目の整数の約数である場合
		if(firstNumber%secondNumber==0) {
			//約数であることを表示
			System.out.println(secondNumber+"は"+firstNumber+"の約数です。");
		//2つ目の整数が１つ目の整数の約数でない場合
		}else if(firstNumber%secondNumber!=0) {
			//約数でないことを表示
			System.out.println(secondNumber+"は"+firstNumber+"の約数ではありません。");
		//入力された値が0の場合
		}
	}

}
