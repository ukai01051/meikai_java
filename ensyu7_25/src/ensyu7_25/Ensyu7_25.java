package ensyu7_25;
//標準入力のためのインポート文
import java.util.Scanner;
/*
* クラス名:Ensyu7_25
* 概要:配列aから要素a[idx]を先頭とするn個の要素を削除した配列を表示
* 作成者:ukai
* 作成日:2023/04/21
*/
public class Ensyu7_25 {
	//Scannerクラスのインスタンスを作成
	//引数:標準入力System.in
	static Scanner scanInteger=new Scanner(System.in);
	/*
	 * 関数名:arrayRmvOfN
	 * 概要:配列aから要素a[idx]を削除した配列を返すメソッド
	 * 引数:配列を受け取るint型配列[a[]] 削除するインデックスを格納するint型変数[idx] ※教本の表記
	 *		削除する要素の数を受け取るint型変数[n] ※教本の表記
	 * 戻り値:配列aから要素a[idx]を削除したint型配列[returnArray]
	 * 作成者:ukai
	 * 作成日:2023/04/21
	 */
	static int[] arrayRmvOfN(int[] a,int idx,int n) {
		//配列aの要素数と同じ要素数の配列を宣言
		int[] returnArray=new int[a.length-n];
		//カウントがidxと等しくなったらループ抜け
		for(int i=0;i<idx;i++) {
			//受け取った配列の要素を代入
			returnArray[i]=a[i];
		}
		//カウントがaの要素数と等しくなったらループ抜け
		for(int i=idx+n;i<a.length;i++) {
			//idxから後ろn個分以降の要素を代入
			returnArray[i-n]=a[i];
		}
		//配列を返す
		return returnArray;
	}

	/*
	 * 関数名:scanInput
	 * 概要:配列の要素数と全要素を入力させ宣言した配列を返すメソッド
	 * 引数:なし
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[]]
	 * 作成者:ukai
	 * 作成日:2023/04/21
	 */
	static int[] scanInput() {

		//入力値を代入する変数を宣言
		int elementCount=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elementCount=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(elementCount<=0);
		//入力された要素数をもとに配列を宣言
		int[] integerArray=new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for(int i=0;i<integerArray.length;i++) {
			//配列の要素の入力を促す
			System.out.print("配列a["+i+"]=");
			//インスタンスから入力された値を受け取る
			integerArray[i]=(int)scanInteger.nextDouble();
		}
		//配列を返す
		return integerArray;
	}
	/*
	 * 関数名:outputArray
	 * 概要:受け取った配列の全要素を表示するメソッド
	 * 引数:受け取った配列を格納するint型配列[integerArray]
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/21
	 */
	static void outputArray(int[] integerArray) {
		// {を表示
		System.out.print("{ ");
		//カウントが配列の要素数と等しくなったらループ抜け
		for(int i=0;i<integerArray.length;i++) {
			//配列の要素を表示
			System.out.print(integerArray[i]+" ");
		}
		// }を表示
		System.out.println("}");
	}
	/*
	 * 関数名:main
	 * 概要:scanInputメソッドを呼び出し配列を宣言し
	 * 		その配列から削除する先頭のインデックスと個数を入力させarrayRmvOfNを呼び出し配列を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/21
	 */
	public static void main(String[] args) {
		//メッセージを表示
		System.out.println("配列aから特定のインデックスの値を削除します。");
		//scanInputメソッドを呼び出す
		int[] integerArray=scanInput();
		//メッセージを表示
		System.out.print("配列a=");
		//outputArrayメソッドを呼び出し配列integerArrayを表示
		outputArray(integerArray);
		//削除するインデックスを格納する変数を宣言
		int deleteIndex=-1;
		//削除する要素の数を格納する変数を宣言
		int deleteNumber=0;
		//後判定ループ文
		do {
			//数値の入力を促す
			System.out.print("削除する先頭のインデックス:");
			//インスタンスから入力された値を受け取る
			deleteIndex=(int)scanInteger.nextDouble();
		//要素数未満の正の数が入力されたらループ抜け
		}while(deleteIndex<0 || deleteIndex>=integerArray.length);
		//後判定ループ文
		do {
			//数値の入力を促す
			System.out.print("削除する要素の個数:");
			//インスタンスから入力された値を受け取る
			deleteNumber=(int)scanInteger.nextDouble();
		//要素数未満の正の数が入力されたらループ抜け
		}while(deleteNumber<0 || deleteNumber>integerArray.length-deleteIndex);
		//メッセージを表示
		System.out.print("配列a=");		
		//arrayRmvOfNメソッドを呼び出し値が削除された配列を表示
		outputArray(arrayRmvOfN(integerArray,deleteIndex,deleteNumber));
	}
}
