package ensyu6_15;
//乱数生成のためのインポート文
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_14
 * 概要:1～7の乱数を生成して対応した曜日の英語表現を入力させる英単語学習プログラム
 * 作成者:ukai
 * 作成日:2023/04/17
 */
public class Ensyu6_15 {
	/*
	 * 関数名:main
	 * 概要:1～7の乱数を生成して対応した曜日の英語表現を入力させる英単語学習プログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/17
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInput=new Scanner(System.in);
		//曜日数を格納する変数を宣言
		final int WEEK_RANGE=7;
		//曜日の英語表現が格納された配列を宣言
		String[] weekArray={
			"monday","tuesday","wednesday","thursday","friday","saturday","sunday"
		};
		//表記用に曜日が格納された配列を宣言
		String[] labelsWeek= {
				"月","火","水","木","金","土","日"
		};
		
		//問題を提示
		System.out.println("英語の曜日名を小文字で入力してください。");
		//リトライ用と連続を避けるための変数を宣言
		int retryValue=0,previousValue=0;
		//後判定ループ文
		do {
			//0～6の乱数を生成して曜日を格納する変数を代入
			int weekValue=randomGeneration.nextInt(WEEK_RANGE);
			////曜日の乱数生成が連続して同じ値の場合
			if(weekValue==previousValue) {
				//ループ文の初めに戻る
				continue;
			}
			//曜日の入力を促す
			System.out.print(labelsWeek[weekValue]+"曜日:");
			//インスタンスから入力された文字列を受け取る
			String weekSpell=scanInput.next();
			//入力された曜日名が間違っている場合
			while(!(weekSpell.equals(weekArray[weekValue]))) {
				//メッセージを表示
				System.out.println("違います。");
				//月名の入力を促す
				System.out.print(labelsWeek[weekValue]+"曜日:");
				//インスタンスから入力された文字列を受け取る
				weekSpell=scanInput.next();
			}
			//入力された曜日名が正しい場合
			if((weekSpell.equals(weekArray[weekValue]))) {
				//連続を避けるための変数に正解した曜日の値を代入
				previousValue=weekValue;
				//メッセージを表示
				System.out.print("正解です。 もう一度？ 1...Yes/1以外...No:");
			}
			//インスタンスから入力された値を受け取る
			retryValue=scanInput.nextInt();
		//1以外が入力されたらループ抜け
		}while(retryValue==1);
	}
}