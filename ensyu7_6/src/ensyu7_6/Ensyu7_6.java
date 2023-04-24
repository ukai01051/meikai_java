package ensyu7_6;
//標準入力のためのインポート文
		import java.util.Scanner;
/*
 * クラス名:Ensyu7_6
 * 概要:入力された値に応じて季節を表示
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_6 {
	/*
	 * 関数名:printSeason ※教本の表記
	 * 概要:受け取った値に応じて季節を表示
	 * 引数:入力された月の値を受け取るint型変数[n] ※教本の表記
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static void printSeason(int n) {
		//受け取った値を場合分けする
		switch(n) {
			//3,4,5の場合春を表示
			case 3,4,5	:System.out.println("春");break;
			//6,7,8の場合夏を表示
			case 6,7,8	:System.out.println("夏");break;
			//9,10,11の場合秋を表示
			case 9,10,11:System.out.println("秋");break;
			//12,1,2の場合冬を表示
			case 12,1,2	:System.out.println("冬");break;
			//それ以外は何も表示せず終了
			default:break;
		}
	}
	/*
	 * 関数名:main
	 * 概要:月の値を入力させprintSeasonメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		//整数の入力を促す
		System.out.print("季節を表示します。\n月:");
		//インスタンスから入力された値を受け取る
		inputValue=scanInteger.nextInt();
		//printSeasonメソッドを呼び出す
		printSeason(inputValue);
	}

}
