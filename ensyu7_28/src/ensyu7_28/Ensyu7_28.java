package ensyu7_28;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_28
 * 概要:２つの配列の和を格納した２次元配列を求めるプログラム
 * 作成者:ukai
 * 作成日:2023/04/24
 */
public class Ensyu7_28 {
	//Scannerクラスのインスタンスを作成
	//引数:標準入力System.in
	static Scanner scanInteger=new Scanner(System.in);

	/*
	 * 関数名:addMatrix  ※教本の表記
	 * 概要:行列xとyの和を格納した２次元配列を返すメソッド
	 * 引数:受け取った配列を格納するint型配列[x[][]][y[][]]  ※教本の表記
	 * 戻り値:２つの配列の和を格納したint型配列[totalArray[][]]
	 * 作成者:ukai
	 * 作成日:2023/04/24
	 */
	static int[][] addMatrix(int[][] x,int[][] y){
		//２つの配列の和を格納する配列を宣言
		int[][] totalArray=new int[x.length][x[0].length];
		//カウントが行の要素数と等しくなったらループ抜け
		for(int i=0;i<x.length;i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for(int j=0;j<x[i].length;j++) {
				//２つの配列の和を格納
				totalArray[i][j]=x[i][j]+y[i][j];
			}
		}
		//２つの配列の和を格納した配列を返す
		return totalArray;
	}
	/*
	 * 関数名:scanMultipleInput
	 * 概要:多次元配列の要素数と全要素を入力させ配列を生成するメソッド
	 * 引数:なし
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[][]]
	 * 作成者:ukai
	 * 作成日:2023/04/24
	 */
	static int[][] scanMultipleInput() {
		//入力値を代入する変数を宣言
		int lineNumber=0,columnNumber=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("行の要素数:");
			//インスタンスから入力された値を受け取る
			lineNumber=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(lineNumber<=0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("列の要素数:");
			//インスタンスから入力された値を受け取る
			columnNumber=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(columnNumber<=0);
				
		//入力された要素数をもとに配列を宣言
		int[][] firstArray=new int[lineNumber][columnNumber];
		//カウントが行の要素数と等しくなったらループ抜け
		for(int i=0;i<firstArray.length;i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for(int j=0;j<firstArray[i].length;j++) {
				//配列の要素の入力を促す
				System.out.print("配列x["+i+"]["+j+"]=");
				//インスタンスから入力された値を受け取る
				firstArray[i][j]=(int)scanInteger.nextDouble();
			}
		}
		//配列を返す
		return firstArray;
	}
	/*
	 * 関数名:scanMultipleElement
	 * 概要:受け取った配列と同じ要素数の配列を生成し各要素を入力させる
	 * 引数:受け取った配列の要素を格納するint型配列[firstArray[][]]
	 * 戻り値:受け取った配列と同じ要素数の配列を返すint型配列[secondArray[][]]
	 * 作成者:ukai
	 * 作成日:2023/04/24
	 */
	static int[][] scanMultipleElement(int[][] firstArray){
		
		//入力された要素数をもとに配列を宣言
		int[][] secondArray=new int[firstArray.length][firstArray[0].length];
		//カウントが行の要素数と等しくなったらループ抜け
		for(int i=0;i<firstArray.length;i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for(int j=0;j<firstArray[i].length;j++) {
				//配列の要素の入力を促す
				System.out.print("配列y["+i+"]["+j+"]=");
				//インスタンスから入力された値を受け取る
				secondArray[i][j]=(int)scanInteger.nextDouble();
			}
		}
		//配列を返す
		return secondArray;
	}

	/*
	 * 関数名:outputMultipleArray
	 * 概要:受け取った多次元配列の全要素を表示するメソッド
	 * 引数:受け取った多次元配列を格納するint型配列[integerArray[][]]
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/24
	 */
	static void outputMultipleArray(int[][] integerArray) {
		//カウントが行の要素数と等しくなったらループ抜け
		for(int i=0;i<integerArray.length;i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for(int j=0;j<integerArray[i].length;j++) {
				//配列の要素を表示
				System.out.print(integerArray[i][j]+" ");
			}
			//改行を出力
			System.out.println();
		}
	}

	/*
	 * 関数名:main
	 * 概要:scanMultipleInputメソッドを呼び出し２つの多次元配列を生成し
	 * 		addMatrixメソッドを呼び出し配列の和を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/24
	 */
	public static void main(String[] args) {
		//scanMultipleInputメソッドを呼び出す
		int[][] firstArray=scanMultipleInput();
		//改行を出力
		System.out.println();
		//scanMultipleInputメソッドを呼び出す
		int[][] secondArray=scanMultipleElement(firstArray);
		//addMatrixメソッドを呼び出す
		outputMultipleArray(addMatrix(firstArray,secondArray));
	}
}
