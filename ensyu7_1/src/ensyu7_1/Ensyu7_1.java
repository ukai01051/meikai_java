package ensyu7_1;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_1
 * 概要:受け取った引数の正負・0を判断して値を返すsignOfメソッドを作成
 * 作成者:ukai
 * 作成日:2023/04/18
 */
public class Ensyu7_1 {
	/*
	 * 関数名:signOf
	 * 概要:受け取った引数の正負・0を判断して値を返すメソッド
	 * 引数:int型変数argumentValue 引数を受け取る
	 * 戻り値:int型変数returnValue 戻り値を格納する
	 * 作成者:ukai
	 * 作成日:2023/04/18
	 */
	static int signOf(int argumentValue) {
		//戻り値を格納する変数を宣言
		int returnValue=0;
		//引数の値が負の数の場合
		if(argumentValue<0) {
			//戻り値を格納する変数に-1を代入
			returnValue=-1;
		//引数の値が正の数の場合
		}else if(argumentValue>0) {
			//戻り値を格納する変数に1を代入
			returnValue=1;
		//引き数の値が0の場合
		}else {
			//戻り値を格納する変数に0を代入
			returnValue=0;
		}
		//戻り値を返す
		return returnValue;
	}
	/*
	 * 関数名:main
	 * 概要:整数を入力させsighOfメソッドを呼び出しその戻り値に応じてメッセージを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/18
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue=0;
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		inputValue=scanInteger.nextInt();
		//signOfメソッドを呼び出し戻り値を判断
		switch(signOf(inputValue)) {
			//戻り値が-1の場合
			case -1:System.out.println("その値は負です。");break;
			//戻り値が1の場合
			case 1:System.out.println("その値は正です。");break;
			//戻り値が0の場合
			default :System.out.println("その値は0です。");break;
		}
	}
}
