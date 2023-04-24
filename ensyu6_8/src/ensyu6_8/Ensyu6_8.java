//ensyu6_8
package ensyu6_8;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_8
 * 概要:入力値の要素数を持つdouble型配列に点数を入力し最大値、最小値、合計値、平均値を求める
 * 作成者:ukai
 * 作成日:2023/04/14
 */
public class Ensyu6_8 {
	/*
	 * 関数名:main
	 * 概要:入力値の要素数を持つdouble型配列に点数を入力し最大値、最小値、合計値、平均値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/14
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//要素数とカウント用の変数を宣言
		int elmentCount=0,countValue=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(elmentCount<=0);
		
		//double型配列を宣言
		double[] doubleArray=new double[elmentCount];
		//カウント数が要素数を超えたらループ抜け
		for(countValue=0;countValue<elmentCount;countValue++) {
			//後判定ループ文
			do {
				//実数値の入力を促す
				System.out.print("doubleArray["+countValue+"]=");
				//インスタンスから入力された値を受け取る
				doubleArray[countValue]=scanInteger.nextDouble();
				//101以上が入力されたとき
					if(doubleArray[countValue]>=101) {
					//人数カウントをデクリメント
					countValue--;
				}
			//０以上の値が入力されたらループ抜け
			}while(doubleArray[countValue]<0);
		}
		//合計値を格納する変数を宣言
		double totalValue=0;
		//最大値を格納する変数に配列の最初の値を代入
		double maximumValue=doubleArray[0];
		
		//最大値と合計値を求めるループ文
		//拡張forで配列を走査
		for(double scanValue:doubleArray) {
			//配列の値を合計値を格納する変数に足し込む
			totalValue=totalValue+scanValue;
			//配列の値が最大値を格納する変数の値より大きい場合
			if(scanValue>maximumValue) {
				//配列の値を最大値を格納する変数に代入
				maximumValue=scanValue;
			}
		}
		//最小値を求めるループ文
		//最小値を格納する変数に配列の最初の値を代入
		double minimumValue=doubleArray[0];
		
		//拡張forで配列を走査
		for(double scanValue:doubleArray) {
			//配列の値が最小値を格納する変数の値より大きい場合
			if(scanValue<minimumValue) {
				//配列の値を最小値を格納する変数に代入
				minimumValue=scanValue;
			}
		}
		//最大値を表示
		System.out.println("最大値は"+maximumValue+"です。");
		//最小値を表示
		System.out.println("最小値は"+minimumValue+"です。");
		//合計値を表示
		System.out.println("合計値は"+totalValue+"です。");
		
		//平均値を代入
		System.out.println("平均値は"+(totalValue/elmentCount)+"です。");
	}
}
