//ensyu6_2のパッケージ宣言
package ensyu6_2;
/*
 * クラス名:Ensyu6_2
 * 概要:要素数5のint型の配列に5,4,3,2,1の値を順に代入して表示
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu6_2 {
	/*
	 * 関数名:main
	 * 概要:要素数5のint型の配列に5,4,3,2,1の値を順に代入して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//要素数5のint型配列を宣言
		int[] integerArray=new int[5];
		//代入用の変数を宣言
		int substitutionValue=5;
		//カウントをインクリメントしながらカウントが5になったらループ抜け
		for(int countValue=0;countValue<5;countValue++) {
			//配列に代入用の変数の値を1つ1つ代入
			integerArray[countValue]=substitutionValue;
			//配列の値を表示
			System.out.println(integerArray[countValue]);
			//代入用の変数の値をデクリメント
			substitutionValue--;
		}
	}

}
