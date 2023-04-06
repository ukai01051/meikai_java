//ensyu2_7のパッケージ宣言
package ensyu2_7;
//乱数生成のためのインポート文
import java.util.Random;
/*
 * クラス名:Ensyu2_7
 * 概要:3つの乱数を生成して表示
 * 作成者:ukai
 * 作成日:2023/04/05
 */
public class Ensyu2_7 {
	/*
	 * 関数名:main
	 * 概要:3つの乱数を生成して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスの引数なしのインスタンスを作成
		Random randomGeneration = new Random();
		//1～9の乱数を生成変数に代入
		int firstRandom=randomGeneration.nextInt(9)+1;
		//-1～-9の乱数を生成変数に代入
		int secondRandom=randomGeneration.nextInt(9)-9;
		//10～99の乱数を生成して変数に代入
		int thirdRandom=randomGeneration.nextInt(90)+10;
		//1～9の乱数を表示
		System.out.println(firstRandom);
		//-1～-9の乱数を表示
		System.out.println(secondRandom);
		//10～99の乱数を表示
		System.out.println(thirdRandom);
				
	}

}
