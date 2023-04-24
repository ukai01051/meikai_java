//ensyu6_3のパッケージ宣言
package ensyu6_3;
/*
 * クラス名:Ensyu6_3
 * 概要:要素数5のdouble型の配列に1.1,2.2,3.3,4.4,5.5の値を順に代入して表示
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu6_3 {
	/*
	 * 関数名:main
	 * 概要:要素数5のdouble型の配列に1.1,2.2,3.3,4.4,5.5の値を順に代入して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//要素数5のint型配列を宣言
		double[] doubleArray=new double[5];
		//代入用の変数を宣言
		int substitutionValue=1;
		//カウントをインクリメントしながらカウントが5になったらループ抜け
		for(int countValue=0;countValue<5;countValue++) {
			//配列に代入用の変数の値を1つ1つ代入
			doubleArray[countValue]=substitutionValue*1.1*10/10;
			//配列の値を表示
			System.out.println(doubleArray[countValue]);
			//代入用の変数の値をデクリメント
			substitutionValue++;
		}
	}
}