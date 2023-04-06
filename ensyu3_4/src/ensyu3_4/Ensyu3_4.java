//ensyu3_4のパッケージ宣言
package ensyu3_4;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_4
 * 概要:標準入力から受け取った2つの数値の大小関係を表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_4 {
	/*
	 * 関数名:main
	 * 概要:標準入力から受け取った2つの数値の大小関係を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInt=new Scanner(System.in);
		//1つ目の整数の入力を促す
		System.out.print("整数値1:");
		//インスタンスから1つ目の入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//2つ目の整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから2つ目の入力された値を受け取る
		int secondNumber=scannerInt.nextInt();
		
		//1つ目に入力された値のほうが大きい場合
		if(firstNumber>secondNumber) {
			//1つ目の値を表示
			System.out.println(firstNumber+"のほうが大きいです。");
		//2つ目に入力された値のほうが大きい場合
		}else if(firstNumber<secondNumber) {
			//2つ目の値を表示
			System.out.println(secondNumber+"のほうが大きいです。");
		//数値が同値な場合
		}else if(firstNumber==secondNumber){
			//同値であることを表示
			System.out.println(firstNumber+"と"+secondNumber+"は同じ値です。");
		}
	}

}
