//ensyu6_1のパッケージ宣言
package ensyu6_1;
/*
 * クラス名:Ensyu6_1
 * 概要:要素数5のdouble型の配列を生成し全要素を表示
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu6_1 {
	/*
	 * 関数名:main
	 * 概要:要素数5のdouble型の配列を生成し全要素を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//double型の配列を宣言
		double[] doubleArray= new double[5];
		//配列に値を代入
		doubleArray[0]=452.2;
		//配列に値を代入
		doubleArray[1]=11.3;
		//配列に値を代入
		doubleArray[2]=2.8;
		//配列に値を代入
		doubleArray[3]=63.7;
		//配列に値を代入
		doubleArray[4]=42.7;
				
		//カウントをインクリメントしながらカウントが5になったらループ抜け
		for(int countValue=0;countValue<5;countValue++) {
			//配列の値を表示
			System.out.println(doubleArray[countValue]);
		}
	}
}
