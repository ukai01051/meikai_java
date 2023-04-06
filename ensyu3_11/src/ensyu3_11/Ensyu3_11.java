//ensyu3_11のパッケージ宣言
package ensyu3_11;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu3_11
 * 概要:2つの整数の差が10以下か11以上であるか表示
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_11 {
	/*
	 * 関数名:main
	 * 概要:2つの整数の差が10以下か11以上であるか表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//1つ目の整数の入力を促す
		System.out.print("整数値1:");
		//インスタンスから入力された値を受け取る
		int firstNumber=scannerInt.nextInt();
		//2つ目の整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから入力された値を受け取る
		int secondNumber=scannerInt.nextInt();
		//2つの整数で大きいほうの値をmaximumValueに代入
		int maximumValue = firstNumber > secondNumber ? firstNumber : secondNumber;
		//2つの整数を小さいほうの値をminimumValueに代入
		int minimumValue= firstNumber < secondNumber ? firstNumber : secondNumber;
		//2つの整数の差が10以下の場合
		if(maximumValue-minimumValue<11) {
			//差が10以下であることを表示
			System.out.println("それらの差は10以下です。");
		//2つの整数の差が11以上であることを表示
		}else if(maximumValue-minimumValue>=11) {
			//差が11以上であることを表示
			System.out.println("それらの差は11以上です。");
		}

	}

}
