//ensyu6_6のパッケージ宣言
package ensyu6_6;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_6
 * 概要:入力値の要素数を持つint型配列に点数を入力し最大値、最小値、合計値、平均値を求める
 * 作成者:ukai
 * 作成日:2023/04/14
 */
public class Ensyu6_6 {
	/*
	 * 関数名:main
	 * 概要:入力値の要素数を持つint型配列に点数を入力し最大値、最小値、合計値、平均値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/14
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//人数とカウント用の変数を宣言
		int peopleNumber=0,peopleCount=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何人の点数を入力しますか:");
			//インスタンスから入力された値を受け取る
			peopleNumber=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(peopleNumber<=0);
		
		//int型配列を宣言
		int[] scoreArray=new int[peopleNumber];
		//メッセージを表示
		System.out.println(peopleNumber+"人の点数を入力せよ。");
		//人数カウント数が入力された人数を超えたらループ抜け
		for(peopleCount=0;peopleCount<peopleNumber;peopleCount++) {
			//後判定ループ文
			do {
				//点数の入力を促す
				System.out.print(peopleCount+"番の点数:");
				//インスタンスから入力された値を受け取る
				scoreArray[peopleCount]=(int)scanInteger.nextDouble();
				//101以上が入力されたとき
				if(scoreArray[peopleCount]>=101) {
					//人数カウントをデクリメント
					peopleCount--;
				}
			//正の数が入力されたらループ抜け
			}while(scoreArray[peopleCount]<0);
		}
		//合計値を格納する変数を宣言
		int totalValue=0;
		//最大値を格納する変数に配列の最初の値を代入
		int maximumValue=scoreArray[0];
		//最大値と合計値を求めるループ文
		//カウントが要素数を超えたらループ抜け
		for(peopleCount=0;peopleCount<peopleNumber;peopleCount++) {
			//配列の値を合計値を格納する変数に足し込む
			totalValue=totalValue+scoreArray[peopleCount];
			//配列の値が最大値を格納する変数の値より大きい場合
			if(scoreArray[peopleCount]>maximumValue) {
				//配列の値を最大値を格納する変数に代入
				maximumValue=scoreArray[peopleCount];
			}
		}
		//最小値を求めるループ文
		//最小値を格納する変数に配列の最初の値を代入
		int minimumValue=scoreArray[0];
		//カウントが要素数を超えたらループ抜け
		for(peopleCount=0;peopleCount<peopleNumber;peopleCount++) {
			//配列の値が最小値を格納する変数の値より大きい場合
			if(scoreArray[peopleCount]<minimumValue) {
				//配列の値を最小値を格納する変数に代入
				minimumValue=scoreArray[peopleCount];
			}
		}
		//最大値を表示
		System.out.println("最大値は"+maximumValue+"です。");
		//最小値を表示
		System.out.println("最小値は"+minimumValue+"です。");
		//合計値を表示
		System.out.println("合計値は"+totalValue+"です。");
		//平均値を代入
		System.out.println("平均値は"+(totalValue/peopleNumber)+"です。");
	}
}
