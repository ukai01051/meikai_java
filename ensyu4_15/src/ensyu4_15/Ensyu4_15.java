//ensyu4_15のパッケージ宣言
package ensyu4_15;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_15
 * 概要:身長の範囲と毎cmを指定して身長と標準体重を表示
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_15 {
	/*
	 * 関数名:main
	 * 概要:身長の範囲と毎cmを指定して身長と標準体重を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInteger=new Scanner(System.in);
		//スタート身長,ゴール身長,毎cm用の変数を宣言
		int startValue,lastValue,everyValue;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmから:");
			//インスタンスから入力された値を受け取る
			startValue=scannerInteger.nextInt();
		//正の値が入力されたらループ抜け
		}while(startValue<0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmまで:");
			//インスタンスから入力された値を受け取る
			lastValue=scannerInteger.nextInt();
		//正の値が入力されたらループ抜け
		}while(lastValue<0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmごと:");
			//インスタンスから入力された値を受け取る
			everyValue=scannerInteger.nextInt();
		//	正の値が入力されたらループ抜け
		}while(everyValue<0);
		
		//表題を表示
		System.out.println("身長  標準体重");
		//スタート身長の値を代入したカウント用変数にeveryValueをインクリメント
		//カウント用変数がゴール身長の値を超えたらループ抜け
		for(int countValue=startValue;countValue<=lastValue;countValue=countValue+everyValue) {
			//身長と標準体重を入力
			System.out.println(countValue+"    "+(countValue-100)*0.9);
		}

	}

}
