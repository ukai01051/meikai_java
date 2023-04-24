package ensyu7_13;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_13
 * 概要:
 * 作成者:ukai
 * 作成日:2023/04/20
 */
public class Ensyu7_13 {
	//ビット数を格納する変数を宣言
	static int BITS_NUMBER=32;
	/*
	 * 関数名:printBits
	 * 概要:受け取った数値をビット表記する
	 * 引数:受け取った数値格納するint型変数[bitValue]
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/20
	 */
	static void printBits(int bitValue) {
		//カウントが0を下回ったらループ抜け
		for(int i=BITS_NUMBER-1;i>=0;i--) {
			//1/0を表示
			System.out.print(((bitValue>>>i&1)==1)?'1':'0');
		}
		//改行を出力
		System.out.println("\n");
	}
	/*
	 * 関数名:set ※教本の表記
	 * 概要:受け取った値をもとにxのposビット目の値を1にした値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos] ※教本の表記
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:ukai
	 * 作成日:2023/04/20
	 */
	static int set(int x,int pos) {
		//1をposビット左シフトした値とxの論理和を戻り値に代入
		int returnValue=(1<<pos) | x;
		//戻り値を返す
		return returnValue;
	}
	/*
	 * 関数名:reset ※教本の表記
	 * 概要:受け取った値をもとにxのposビット目の値を0にした値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos] ※教本の表記
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:ukai
	 * 作成日:2023/04/20
	 */
	static int reset(int x,int pos) {
		
		//1をposビット左シフトした値を反転させた値とxの論理積を戻り値に代入
		int returnValue=(~(1<<pos)) & x;
		//戻り値を返す
		return returnValue;
	}
	/*
	 * 関数名:inverse ※教本の表記
	 * 概要:受け取った値をもとにxのposビット目の値を反転した値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos] ※教本の表記
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:ukai
	 * 作成日:2023/04/20
	 */
	static int inverse(int x,int pos) {
		//1をposビット左シフトした値とxの排他的論理和を戻り値に代入
		int returnValue=(1<<pos) ^ x;
		//戻り値を返す
		return returnValue;
	}	
	/*
	 * 関数名:main
	 * 概要:整数値と操作するビットを入力させset,reset,inverseメソッドを呼び出して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/20
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
		//ビット数の入力を促す
		System.out.print("操作するビット(最下位から0,1,2...):");
		//インスタンスから入力された値を受け取る
		int bitsCount=scanInteger.nextInt();
		
		//メソッドを呼び出して戻り値を表示
		System.out.println(inputValue+"の"+bitsCount+"ビット目を1にした値は"+set(inputValue,bitsCount));
		//printBitsメソッドを呼び出す
		printBits(set(inputValue,bitsCount));
		//メソッドを呼び出して戻り値を表示
		System.out.println(inputValue+"の"+bitsCount+"ビット目を0にした値は"+reset(inputValue,bitsCount));
		//printBitsメソッドを呼び出す
		printBits(reset(inputValue,bitsCount));
		//メソッドを呼び出して戻り値を表示
		System.out.println(inputValue+"の"+bitsCount+"ビット目を反転した値は"+inverse(inputValue,bitsCount));
		//printBitsメソッドを呼び出す
		printBits(inverse(inputValue,bitsCount));	
	}
}
