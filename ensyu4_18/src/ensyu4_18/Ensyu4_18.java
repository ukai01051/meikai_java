//ensyu4_18のパッケージ宣言
package ensyu4_18;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_18
 * 概要:1から入力値までの2乗を表示
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_18 {
	/*
	 * 関数名:main
	 * 概要:1から入力値までの2乗を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		
		//入力値を代入する変数を宣言
		int inputValue;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("nの値:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);

		
		//カウントが入力値を超えたらループ抜け
		for(int countValue=1;countValue<=inputValue;countValue++) {
				//1からnまでの二乗を表示
				System.out.println(countValue+"の2乗は"+countValue*countValue);
		}
	}

}
