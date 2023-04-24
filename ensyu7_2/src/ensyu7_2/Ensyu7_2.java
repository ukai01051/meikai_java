package ensyu7_2;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_2
 * 概要:入力させた3つの整数の最小値をメソッドで求めて表示
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_2 {
	/*
	 * 関数名:min
	 * 概要:受け取った3つの値の最小値を返す
	 * 引数:入力された3つの値を格納するint型変数[a][b][c]
	 * 戻り値:最小値を格納するint型変数[minimumValue]
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	static int min(int a,int b,int c) {
		//最小値を格納する変数を宣言してaを代入
		int minimumValue=a;
		//最小値よりbが小さい場合
		if(minimumValue>b) {
			//最小値をbとする
			minimumValue=b;
		}
		//最小値よりcが小さい場合
		if(minimumValue>c) {
			//最小値をcとする
			minimumValue=c;
		}
		//最小値を格納する変数を返す
		return minimumValue;
	}
	/*
	 * 関数名:main
	 * 概要:入力させた3つの整数を引数としminメソッドを呼び出し戻り値を表示
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
		int a=0,b=0,c=0;
		//メッセージを表示
		System.out.println("最小値を求めます。");
		
		//整数の入力を促す
		System.out.print("整数値a:");
		//インスタンスから入力された値を受け取る
		a=scanInteger.nextInt();
		//整数の入力を促す
		System.out.print("整数値b:");
		//インスタンスから入力された値を受け取る
		b=scanInteger.nextInt();
		//整数の入力を促す
		System.out.print("整数値c:");
		//インスタンスから入力された値を受け取る
		c=scanInteger.nextInt();
		//最小値を求めるminメソッドを呼び出して最小値を表示
		System.out.println("最小値は"+min(a,b,c)+"です。");
	}
}
