package ensyu4_26;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_26
 * 概要:加算数分だけ整数を加算し負の数を除く合計と平均を表示
 * 作成者:ukai
 * 作成日:2023/04/11
 */
public class Ensyu4_26 {
	/*
	 * 関数名:main
	 * 概要:加算数分だけ整数を加算し負の数を除く合計と平均を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//加算する説明を表示
		System.out.println("整数を加算します。");
		//入力値と加算数を代入する変数を宣言
		int inputValue=0,addNumber=0;
		//カウントと合計値と負の数の個数を格納する変数を宣言して初期化
		int countValue=0,minusCount=0,totalValue=0;
		
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何個加算しますか:");
			//インスタンスから入力された値を受け取る
			addNumber=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(addNumber<=0);
		
		//カウントが加算数を超えたらループ抜け
		for(countValue=0;countValue<addNumber;countValue++) {
			
			//整数の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();
			//整数が負の数の場合
			if(inputValue<0) {
				//加算しないメッセージを表示
				System.out.println("負の数は加算しません。");
				//負の数の個数をカウント
				minusCount=minusCount+1;
				//以降の実行がスキップ
				continue;
			}
			//入力された整数を合計値に足しこむ
			totalValue+=inputValue;
		}
		//合計値を表示
		System.out.println("合計は"+totalValue+"です。");
		//平均値を表示
		System.out.println("平均は"+totalValue/(countValue-minusCount)+"です。");
	}
}