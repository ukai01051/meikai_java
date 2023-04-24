//ensyu6_10のパッケージ宣言
package ensyu6_10;
//乱数生成のためのインポート文
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_10
 * 概要:要素数が入力値のint型配列を生成して全要素を1～10の乱数で埋めつくす
 * 作成者:ukai
 * 作成日:2023/04/14
 */
public class Ensyu6_10 {
	/*
	 * 関数名:main
	 * 概要:要素数が入力値のint型配列を生成して全要素を1～10の乱数で埋めつくす
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/14
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//要素数とカウント用の変数を宣言
		int countValue=0,elmentCount=0;
		//乱数生成の範囲指定用変数を宣言
		int RANDOM_RANGE=10;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(elmentCount<=0);
		
		//int型配列を宣言
		int[] integerArray=new int[elmentCount];
		//配列名を表示
		System.out.print("integerValue={ ");
		//カウントが要素数と等しくなればループ抜け
		for(countValue=elmentCount-1;countValue>=0;countValue--) {	
			//配列に1～10の乱数を生成して代入
			integerArray[countValue]=randomGeneration.nextInt(RANDOM_RANGE)+1;
			//値を代入した2回目以降に隣の配列の値と一致した場合
			if(countValue<elmentCount-2&&integerArray[countValue]==integerArray[countValue+1]) {
				//カウント数をインクリメント
				countValue++;
			}
		}
		//カウント数が要素数と等しくなったらループ抜け
		for(countValue=0;countValue<elmentCount;countValue++) {
			//配列の内容を表示
			System.out.print(integerArray[countValue]+" ");
		}
		// }を表示
		System.out.println("}");
	}
}
