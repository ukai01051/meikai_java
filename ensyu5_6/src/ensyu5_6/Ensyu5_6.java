//ensyu5_6のパッケージ宣言
package ensyu5_6;
/*
 * クラス名:Ensyu5_6
 * 概要:float型変数を0.0～1.0の間0.001ずつ増やしたものと
 * 		int型の変数を0～1000の間インクリメントした値を1000で割った値を並べて表示
 * 作成者:ukai
 * 作成日:2023/04/12
 */
public class Ensyu5_6 {
	/*
	 * 関数名:main
	 * 概要:float型変数を0.0～1.0の間0.001ずつ増やしたものと
	 * 		int型の変数を0～1000の間インクリメントした値を1000で割った値を並べて表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/12
	 */
	public static void main(String[] args) {
		//float側の合計を格納するfloat型の変数を宣言
		float floatTotal=0.000F;
		//表題を表示
		System.out.println("float\t\t\t\tint\n----------------------------------");
		//int側のカウント用変数の値が1000を超えたらループ抜け
		for(int integerCount=0;integerCount<=1000;integerCount++ ) {
			//int側のカウント用変数を1000で割り商をキャストしてint側の合計用の変数に格納
			float integerTotal=(float)integerCount/1000;
			//float側とint側の合計値をそれぞれ表示
			System.out.printf(String.format("%.10f",floatTotal)+"\t\t"+String.format("%.10f",integerTotal)+"\n");
			//float側の合計値をインクリメント
			floatTotal=floatTotal+0.001F;
		}
	}
}
