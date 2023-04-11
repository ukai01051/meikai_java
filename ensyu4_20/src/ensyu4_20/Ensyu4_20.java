//ensyu4_20のパッケージ宣言
package ensyu4_20;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_20
 * 概要:入力値n段の正方形を表示する
 * 作成者:ukai
 * 作成日:2023/04/10
 */
public class Ensyu4_20 {
	/*
	 * 関数名:main
	 * 概要:入力値n段の正方形を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInteger=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("nの値:");
		//インスタンスから入力された値を受け取る
		int inputValue=scannerInteger.nextInt();
		
		//カウントが入力値を超えたらループ抜け
		for(int heightValue=1;heightValue<=inputValue;heightValue++) {
			//カウントが入力値を超えたらループ抜け
			for(int widthValue=1;widthValue<=inputValue;widthValue++) {
				//入力値分の*を横に表示
				System.out.print("*");
			}
			//入力値分の改行を表示
			System.out.println();
		}
		//0以下が入力された場合
		if(inputValue<=0) {
			//メッセージを表示
			System.out.println("0以下が入力されました。");
		}
	}

}
