//ensyu4_24のパッケージ宣言
package ensyu4_24;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_24
 * 概要:入力値が素数か判断して表示
 * 作成者:ukai
 * 作成日:2023/04/11
 */
public class Ensyu4_24 {
	/*
	 * 関数名:main
	 * 概要:入力値が素数か判断して表示
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
		int inputValue;
		//概要説明を表示
		System.out.println("素数の判定をします。");
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("正の整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<=1);
		
		//カウント用変数を宣言
		int countValue=0;
		//カウントが入力値を超えたらループ抜け
		for(countValue=2;countValue<inputValue;countValue++) {
			//カウントで入力値を割り切れた場合
			if(inputValue%countValue==0) {
				//素数でないことを表示
				System.out.println(inputValue+"は素数ではありません。");
				//ループ抜け
				break;
			}
		}	
		//入力値が最後まで割り切れなかった場合
		if(countValue==inputValue) {
			//素数であることを表示
			System.out.println(inputValue+"は素数です。");
		}
		
	}

}
