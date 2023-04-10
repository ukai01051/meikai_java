//ensyu4_14のパッケージ宣言
package ensyu4_14;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_14
 * 概要:1から入力した値までの和を求めて表示
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_14 {
	/*
	 * 関数名:main
	 * 概要:1から入力した値までの和を求めて表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//整数の入力を促す
		System.out.println("1からnまでの和を求めます。");
		//入力用変数inputNumber
		int inputNumber=0;
		
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("nの値:");
			//インスタンスから入力された値を受け取る
			inputNumber=scannerInt.nextInt();
		//入力値が正の数でループ抜け	
		}while(inputNumber<=0);
		
		//合計値用変数を宣言して初期化
		int totalValue=0;
		
		//カウント数値が入力値より大きければループ抜け
		for (int countValue=1;countValue<=inputNumber;countValue++) {
			//インクリメントしているカウント数値と合計の積を合計用の変数に代入
			totalValue=totalValue+countValue;
			//1からnまでの数値を表示
			System.out.print(countValue);
			//カウントが入力値nでない場合
			if(countValue!=inputNumber) {
				//+を表示
				System.out.print("+");
			//カウントが入力値nである場合
			}else {
				//=を表示
				System.out.print("=");
			}
		//1から入力値までの和を表示
		}System.out.println(totalValue);
	}
}