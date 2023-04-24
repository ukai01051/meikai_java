package ensyu7_10;
//乱数生成のためのインポート文
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_10
 * 概要:3つの乱数を生成し4つのパターンの問題をランダムに出題する
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_10 {
	//Scannerクラスのインスタンスを作成
	//引数:標準入力System.in
	static Scanner scanInteger=new Scanner(System.in);

	/*
	 * 関数名:confirmRetry  ※教本の表記
	 * 概要:繰り返すか入力させそれに応じてtrue/falseを返す
	 * 引数:なし
	 * 戻り値:true/falseを返すか判断するint型変数[cont] ※教本の表記
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static boolean confirmRetry() {
		//繰り返すかの判断用の変数を宣言
		int cont=0;
		//後判定ループ文
		do {
			//メッセージを表示
			System.out.println("もう一度？<Yes...1/No...0>");
			//インスタンスから入力された値を受け取る
			cont=scanInteger.nextInt();
		//0か1が入力されたらループ抜け
		}while(cont != 0&& cont !=1);
		//contが1ならtrue/0ならfalseを返す
		return cont==1;
	}
	
	/*
	 * 関数名:dividePattern
	 * 概要:3つの乱数とパターン用の乱数をもとに問題を表示
	 * 		答えと一致するまで入力させる
	 * 引数:受け取った3つの乱数を格納するint型変数[x][y][z] ※教本の表記
	 * 		パターンを制御する乱数を格納するint型変数[patternValue]
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static void dividePattern(int x,int y,int z,int patternValue) {
		//回答を格納する変数を宣言
		int firstNumber=0,secondNumber=0,thirdNumber=0,fourthNumber=0;
		//問題のパターン用の乱数で場合分け
		switch(patternValue) {
			//場合分けの乱数が0の場合
			case 0: do {
						System.out.print(x+"+"+y+"+"+z+"=");
						//インスタンスから入力された値を受け取る
						firstNumber=scanInteger.nextInt();
						//入力値と問題の答えが異なる場合
						if(firstNumber!=x+y+z) {
							//メッセージを表示
							System.out.println("違います。");
						}
					//入力値と問題の答えが一致したらループ抜け
					}while(firstNumber!=x+y+z);
					//switch文抜け
					break;
			//場合分けの乱数が1の場合
			case 1: do {
						System.out.print(x+"+"+y+"-"+z+"=");
						//インスタンスから入力された値を受け取る
						secondNumber=scanInteger.nextInt();
						//入力値と問題の答えが異なる場合
						if(secondNumber!=x+y-z) {
							//メッセージを表示
							System.out.println("違います。");
						}
					//入力値と問題の答えが一致したらループ抜け
					}while(secondNumber!=x+y-z);
					//switch文抜け
					break;
			//場合分けの乱数が2の場合
			case 2: do {
						System.out.print(x+"-"+y+"+"+z+"=");
						//インスタンスから入力された値を受け取る
						thirdNumber=scanInteger.nextInt();
						//入力値と問題の答えが異なる場合
						if(thirdNumber!=x-y+z) {
							//メッセージを表示
							System.out.println("違います。");
						}
					//入力値と問題の答えが一致したらループ抜け
					}while(thirdNumber!=x-y+z);
					//switch文抜け
					break;
			//場合分けの乱数が3の場合
			case 3: do {
						System.out.print(x+"-"+y+"-"+z+"=");
						//インスタンスから入力された値を受け取る
						fourthNumber=scanInteger.nextInt();
						//入力値と問題の答えが異なる場合
						if(fourthNumber!=x-y-z) {
							//メッセージを表示
							System.out.println("違います。");
						}
					//入力値と問題の答えが一致したらループ抜け
					}while(fourthNumber!=x-y-z);
					//switch文抜け
					break;
		}
	}
	
	/*
	 * 関数名:main
	 * 概要:3つの乱数と問題のパターン用の乱数を生成しdividePatternメソッドを呼び出す
	 * 		正解した場合confirmRetryメソッドを呼び出して繰り返すか判断
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//乱数生成の範囲を格納する変数を宣言
		int RANDOM_RANGE=900;
		//問題のパターン数を格納する変数を宣言
		int PATTERN_NUMBER=4;
		//後判定ループ文
		do {
			//3桁の数を生成して代入
			int firstNumber=randomGeneration.nextInt(RANDOM_RANGE)+100;
			//3桁の数を生成して代入
			int secondNumber=randomGeneration.nextInt(RANDOM_RANGE)+100;
			//3桁の数を生成して代入
			int thirdNumber=randomGeneration.nextInt(RANDOM_RANGE)+100;
			//問題のパターン用の乱数を生成
			int patternValue=randomGeneration.nextInt(PATTERN_NUMBER);
			//dividePatternメソッドを呼び出す
			dividePattern(firstNumber,secondNumber,thirdNumber,patternValue);
		//confirmRetryメソッドを呼び出して繰り返しを判断
		}while(confirmRetry());
	}
}
