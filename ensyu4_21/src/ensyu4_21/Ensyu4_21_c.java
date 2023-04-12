//ensyu4_21のパッケージ宣言
package ensyu4_21;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_21_c
 * 概要:右上が直角の三角形を表示
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_21_c {
	/*
	 * 関数名:main
	 * 概要:右上が直角の三角形を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in		
		Scanner scannerInteger=new Scanner(System.in);
		//表示する三角形の趣旨を説明
		System.out.println("右上直角の三角形を表示します。");
		//入力値を代入する変数を宣言
		int inputValue;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("段数は:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInteger.nextInt();
			
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);
		
		//改行と＊表示の変数を宣言
		int heightValue, widthValue;
		
		//改行回数が入力値を超えたらループ抜け
		for(heightValue=0;heightValue<inputValue;heightValue++) {
			
			//＊表示回数が改行回数を超えたらループ抜け
			for(widthValue=0;widthValue<heightValue;widthValue++) {
				//空白を表示
				System.out.print(" ");
			}
			//改行回数が入力値を超えたらループ抜け
			for(widthValue=inputValue;widthValue>heightValue;widthValue--) {
				//*表示
				System.out.print("*");
			}
			//改行を表示
			System.out.println();
		}
	}

}