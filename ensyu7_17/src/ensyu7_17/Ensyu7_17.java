package ensyu7_17;

//標準入力のためのインポート文
import java.util.Scanner;
/*
* クラス名:Ensyu7_17
* 概要:配列の最も末尾に位置する探索キーをlinearSearchRメソッドを呼び出して表示
* 作成者:ukai
* 作成日:2023/04/20
*/
public class Ensyu7_17 {
	/*
	 * 関数名:linearSearchR  ※教本の表記
	 * 概要:受け取った配列の最も末尾に位置する探索キーのインデントを返す
	 * 		存在しない場合は－1を返す
	 * 引数:配列を受け取るint型配列[a[]] 探索するキーを受け取るint型変数[key] ※教本の表記
	 * 戻り値:最小値を格納するint型変数[returnValue]
	 * 作成者:ukai
	 * 作成日:2023/04/20
	 */
	static int linearSearchR(int[] a,int key) {
		//戻り値を格納する変数を宣言
		int returnValue=-1;
		//カウントが配列の要素数と等しくなったらループ抜け
		for(int i=a.length-1;i>=0;i--) {
			//探索キーが配列の要素と一致した場合
			if(key==a[i]) {
				//探索キーの場所を戻り値としてループ抜け
				returnValue=i;break;
			}
		}
		//戻り値を返す
		return returnValue;
	}
	/*
	 * 関数名:main
	 * 概要:要素数と各要素と探索するキーを入力させlinearSearchRメソッドを呼び出す
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
			System.out.print("integerArray["+i+"]=");
			//インスタンスから入力された値を受け取る
			integerArray[i]=(int)scanInteger.nextDouble();
		}
		//探索するキーの入力を促す
		System.out.print("探す値:");
		//インスタンスから入力された値を受け取る
		int searchValue=(int)scanInteger.nextDouble();
		//linearSearchRメソッドを呼び出して表示
		int indexValue=linearSearchR(integerArray,searchValue);
		//探索するキーが配列に存在しない場合
		if(indexValue==-1) {
			//メッセージを表示
			System.out.println("その値の要素は存在しません。");
		//探索するキーが配列に存在する場合
		}else {
			//最も末尾に位置する探索キーの場所を表示
			System.out.println("その値はintegerArray["+indexValue+"]にあります。");
		}
	}
}
