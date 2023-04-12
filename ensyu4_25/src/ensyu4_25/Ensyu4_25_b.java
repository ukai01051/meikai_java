//ensyu4_25
package ensyu4_25;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_25_b
 * 概要:加算数を入力し加算し終わるか合計値が1000を超えるまで加算し合計と平均を表示する
 * 作成者:ukai
 * 作成日:2023/04/11
 */
public class Ensyu4_25_b {
	/*
	 * 関数名:main
	 * 概要:加算数を入力し加算し終わるか合計値が1000を超えるまで加算し合計と平均を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInteger=new Scanner(System.in);
		//加算する説明を表示
		System.out.println("整数を加算します。");
		//入力値と加算数を代入する変数を宣言
		int inputValue=0,addNumber=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何個加算しますか:");
			//インスタンスから入力された加算数を受け取る
			addNumber=scannerInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(addNumber<=0);
		
		//カウントと合計値を格納する変数を宣言
		int countValue=0,totalValue=0;
		//平均値を格納する変数を宣言
		double averageValue=0;
		//カウントが加算数を超えたらループ抜け
		for(countValue=1;countValue<=addNumber;countValue++) {

			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("整数：");
				//インスタンスから入力された値を受け取る
				inputValue=scannerInteger.nextInt();
				
			//正の数が入力されたらループ抜け
			}while(inputValue<0);
			
			//合計値が1000を超えた場合
			if(totalValue+inputValue>1000 || inputValue>=1000) {
				//メッセージを表示
				System.out.println("合計が1000を超えました。\n最後の数値は無視します。");
				//ループ抜け
				break;
			}
			//入力された整数を合計値に足しこむ
			totalValue+=inputValue;
		}
		//合計値を表示
		System.out.println("合計は"+totalValue+"です。");
		//平均を求めてdouble型変数に代入
		averageValue=totalValue/countValue;
		//平均値を表示
		System.out.println("平均は"+averageValue+"です。");
		
	}

}
