//ensyu2_9のパッケージ宣言
package ensyu2_9;
//乱数生成のためのインポート文
import java.util.Random;
/*
 * クラス名:Ensyu2_9
 * 概要:少数部を持つ実数値の乱数を3つ生成して表示
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_9 {
	/*
	 * 関数名:main
	 * 概要:少数部を持つ実数値の乱数を3つ生成して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスの引数なしのインスタンスを生成
		Random randomGeneration = new Random();
		//0.0～1.0の乱数を生成してdouble型変数に代入
		double firstNumber = randomGeneration.nextDouble(1.0);
		//0.0～10.0の乱数を生成してdouble型変数に代入
		double secondNumber = randomGeneration.nextDouble(10.0);
		//-1.0～1.0の乱数を生成してdouble型変数に代入
		double thirdNumber = randomGeneration.nextDouble(2.0)-1.0;
		//0.0～1.0の乱数を表示
		System.out.println(firstNumber);
		//0.0～10.0の乱数を表示
		System.out.println(secondNumber);
		//-1.0～1.0の乱数を表示
		System.out.println(thirdNumber);
		
	}

}
