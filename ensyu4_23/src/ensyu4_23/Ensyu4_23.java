//ensyu4_23のパッケージ宣言
package ensyu4_23;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_23
 * 概要:入力された数値の段の数字ピラミッドを作成して表示
 * 作成者:ukai
 * 作成日:2023/04/11
 */
public class Ensyu4_23 {
	/*
	 * 関数名:main
	 * 概要:入力された数値の段の数字ピラミッドを作成して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/11
	 */
	public static void main(String[] args) {
		
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		
		//概要説明を表示
		System.out.println("n段の数字ピラミッドを作成します。");
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("nの値:");
				//インスタンスから入力された値を受け取る
				inputValue=scannerInteger.nextInt();
				//正の数が入力されたらループ抜け
			}while(inputValue<=0);
		
		
		//改行回数が入力値を超えたらループ抜け
		for(int heightValue=1;heightValue<=inputValue;heightValue++) {
			
			//*表示が入力値と改行回数の差を超えたらループ抜け
			for(int widthValue=1;widthValue<=inputValue-heightValue;widthValue++) {
				//空白を表示
				System.out.print(" ");
			}
			//＊表示が改行回数を超えたらループ抜け
			for(int widthValue=1;widthValue<=(heightValue-1)*2+1;widthValue++) {
				//*表示
				System.out.print(heightValue%10);
			}
			//改行を表示
			System.out.println();
		}
	}
}
