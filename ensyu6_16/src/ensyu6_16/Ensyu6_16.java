package ensyu6_16;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_16
 * 概要:各要素をキーボード入力させ４行３列と３行４列の行列の積を求める
 * 作成者:ukai
 * 作成日:2023/04/17
 */
public class Ensyu6_16 {
	/*
	 * 関数名:main
	 * 概要:各要素をキーボード入力させ４行３列と３行４列の行列の積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/17
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//定数である行列の値を格納する変数を宣言
		final int FIRST_ARRAY_LINE=4,FIRST_ARRAY_COLUMN=3;
		//定数である行列の値を格納する変数を宣言
		final int SECOND_ARRAY_LINE=3,SECOND_ARRAY_COLUMN=4;
		
		//4行3列の配列を宣言
		int[][] firstArray=new int[FIRST_ARRAY_LINE][FIRST_ARRAY_COLUMN];
		//3行4列の配列を宣言
		int[][] secondArray=new int[SECOND_ARRAY_LINE][SECOND_ARRAY_COLUMN];
		//行列の積を格納する配列を宣言
		int[][] productArray=new int[FIRST_ARRAY_LINE][SECOND_ARRAY_COLUMN];
		
		//行カウント/列カウント用変数を宣言
		int lineCount=0,columnCount=0;
		
		//行カウントが４になったらループ抜け
		for(lineCount=0;lineCount<FIRST_ARRAY_LINE;lineCount++) {
			//列カウントが３になったらループ抜け
			for(columnCount=0;columnCount<FIRST_ARRAY_COLUMN;columnCount++) {
				//後判定ループ文
				do {
					//数値の入力を促す
					System.out.print("firstArray["+lineCount+"]["+columnCount+"]=");
					//インスタンスから入力された値を受け取る
					firstArray[lineCount][columnCount]=scanInteger.nextInt();
				//正の数が入力されたらループ抜け
				}while(firstArray[lineCount][columnCount]<0);
			}
		}
		
		//行カウントが3になったらループ抜け
		for(lineCount=0;lineCount<SECOND_ARRAY_LINE;lineCount++) {
			//列カウントが4になったらループ抜け
			for(columnCount=0;columnCount<SECOND_ARRAY_COLUMN;columnCount++) {
				//後判定ループ文
				do {
					//数値の入力を促す
					System.out.print("secondArray["+lineCount+"]["+columnCount+"]=");
					//インスタンスから入力された値を受け取る
					secondArray[lineCount][columnCount]=scanInteger.nextInt();
				//正の数が入力されたらループ抜け
				}while(secondArray[lineCount][columnCount]<0);
			}
		}
		//カウントが4になったらループ抜け
		for(int firstLineCount=0;firstLineCount<FIRST_ARRAY_LINE;firstLineCount++) {
			//カウントが4になったらループ抜け
			for(int secondColumnCount=0;secondColumnCount<SECOND_ARRAY_COLUMN;secondColumnCount++) {
				//行列の積を格納する変数を宣言
				int productValue=0;
				//カウントが3になったらループ抜け
				for(int firstColumnCount=0;firstColumnCount<FIRST_ARRAY_COLUMN;firstColumnCount++) {
					//行列の積の値を求める
					productValue=productValue+firstArray[firstLineCount][firstColumnCount]*secondArray[firstColumnCount][secondColumnCount];
				}
				//行列の積の値を配列に格納
				productArray[firstLineCount][secondColumnCount]=productValue;
			}
		}
		
		//行カウントが3になったらループ抜け
		for(lineCount=0;lineCount<FIRST_ARRAY_LINE;lineCount++) {
			//列カウントが4になったらループ抜け
			for(columnCount=0;columnCount<SECOND_ARRAY_COLUMN;columnCount++) {
				//行列の積を表示
				System.out.print(productArray[lineCount][columnCount]+"\t");
			}
			//改行を出力
			System.out.println();
		}
		
	}
}
