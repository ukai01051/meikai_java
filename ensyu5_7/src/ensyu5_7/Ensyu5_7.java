//ensyu5_7のパッケージ宣言
package ensyu5_7;
/*
 * クラス名:Ensyu5_7
 * 概要:float型変数を0.0～1.0の間0.001ずつ増やした値とその二乗を表示
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu5_7 {
	/*
	 * 関数名:main
	 * 概要:float型変数を0.0～1.0の間0.001ずつ増やした値とその二乗を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//合計値を格納するfloat型変数を宣言
		float floatTotal=0.0F;
		
		//表題を表示
		System.out.println("float\t\t\t\tfloatの2乗\n--------------------------------");
		//0.001ずつインクリメントしカウントが1.0を超えたらループ抜け
		for(float floatCount=0.0F;floatCount<=1.0F;floatCount+=0.001F ) {
			//float側とint側の合計値をそれぞれ表示
			System.out.printf(String.format("%.10f",floatCount)+"\t\t"+String.format("%.10f",(floatCount*floatCount))+"\n");
			//0.001ずつ合計値に足し込む
			floatTotal+=floatCount;
		}
	}
}
