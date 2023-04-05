//ensyu2_2のパッケージ宣言
package ensyu2_2;
/*
 * クラス名:
 * 概要:3つの整数をint型変数に代入し合計と平均を求める
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_2 {
	/*
	 * 関数名:main
	 * 概要:3つの整数をint型変数に代入し合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//1つめのint型変数を宣言し値を代入
		int firstNumber=63;
		//2つめのint型変数を宣言し値を代入
		int secondNumber=18;
		//3つめのint型変数を宣言し値を代入
		int thirdNumber=53;
			
		//1つめの変数の値を表示
		System.out.println("firstNumberの値は"+firstNumber+"です。");
		//2つめの変数の値を表示
		System.out.println("secondNumberの値は"+secondNumber+"です。");
		//３つ目の変数の値を表示
		System.out.println("thirdNumberの値は"+thirdNumber+"です。");
		//3つの変数の和を表示
		System.out.println("合計は"+(firstNumber+secondNumber+thirdNumber)+"です。");
		//3つの変数の平均を表示
		System.out.println("平均は"+(firstNumber+secondNumber+thirdNumber)/3+"です。");
				

	}

}
