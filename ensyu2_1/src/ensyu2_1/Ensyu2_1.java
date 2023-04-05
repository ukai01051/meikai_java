//ensyu2_1のパッケージ宣言
package ensyu2_1;
/*
 * クラス名:Ensyu2_1
 * 概要:実数値を二つの変数に代入し合計と平均を求める
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_1 {
	/*
	 * 関数名:main
	 * 概要:実数値を二つの変数に代入し合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//1つめの変数を宣言し少数部を持つ実数値を代入
		double firstNumber=63.3;
		//2つめの変数を宣言し少数部を持つ実数値を代入
		double secondNumber=18.8;
		
		//1つめの変数の値を表示
		System.out.println("firstNumberの値は"+firstNumber+"です。");
		//2つめの変数の値を表示
		System.out.println("secondNumberの値は"+secondNumber+"です。");
		//２つの変数の和を表示
		System.out.println("合計は"+(firstNumber+secondNumber)+"です。");
		//２つの変数の平均を表示
		System.out.println("平均は"+(firstNumber+secondNumber)/2+"です。");
		
	}

}
