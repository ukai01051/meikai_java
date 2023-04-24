package ensyu6_17;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_17
 * 概要:6人の2科目の点数を読み込んで科目ごとと学生ごとの平均点を求めるプログラム
 * 作成者:ukai
 * 作成日:2023/04/18
 */
public class Ensyu6_17 {
	/*
	 * 関数名:main
	 * 概要:6人の2科目の点数を読み込んで科目ごとと学生ごとの平均点を求めるプログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/18
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//学生の人数を格納する変数を宣言
		final int STUDENT_NUMBER=6;
		//科目数を格納する変数を宣言
		final int SUBJECT_NUMBER=2;
		//各学生の科目の点数を格納する配列を宣言
		int [][] subjectScore=new int[STUDENT_NUMBER][SUBJECT_NUMBER];
		//科目の表示用文字列型配列を宣言
		String[] subjectArray= {"国語","数学"};
		//行カウント用変数を宣言
		int lineCount=0;
		//列カウント用変数を宣言
		int columnCount=0;
		
		//行カウントが学生の人数と等しくなったらループ抜け
		for(lineCount=0;lineCount<STUDENT_NUMBER;lineCount++) {
			//列カウントが科目数と等しくなったらループ抜け
			for(columnCount=0;columnCount<SUBJECT_NUMBER;columnCount++) {
				//後判定ループ文
				do {
					//数値の入力を促す
					System.out.print((lineCount+1)+"人目の"+subjectArray[columnCount]+"の点数:");
					//インスタンスから入力された値を受け取る
					subjectScore[lineCount][columnCount]=scanInteger.nextInt();
				//正の数が入力されたらループ抜け
				}while(subjectScore[lineCount][columnCount]<0);
			}	
		}
		//学生ごとの平均
		//行カウントが学生の人数と等しくなったらループ抜け
		for(lineCount=0;lineCount<STUDENT_NUMBER;lineCount++) {
			//学生ごとの合計を格納する変数を宣言
			double studentTotal=0;
			//列カウントが科目数と等しくなったらループ抜け
			for(columnCount=0;columnCount<SUBJECT_NUMBER;columnCount++) {
				//学生ごとの点数を足し込む
				studentTotal=studentTotal+subjectScore[lineCount][columnCount];
			}
			//学生ごとの平均を表示
			System.out.println((lineCount+1)+"人目の平均点:"+(String.format("%.2f",studentTotal/SUBJECT_NUMBER)));
		}
		
		//教科ごとの平均
		//列カウントが科目数と等しくなったらループ抜け
		for(columnCount=0;columnCount<2;columnCount++) {
			//教科ごとの合計を格納する変数を宣言
			double subjectTotal=0;
			//行カウントが学生の人数と等しくなったらループ抜け
			for(lineCount=0;lineCount<STUDENT_NUMBER;lineCount++) {
				//教科ごとの点数を足し込む
				subjectTotal=subjectTotal+subjectScore[lineCount][columnCount];
			}
			//教科ごとの平均を表示
			System.out.println(subjectArray[columnCount]+"の平均点:"+(String.format("%.2f",subjectTotal/STUDENT_NUMBER)));
		}
	}
}
