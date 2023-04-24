package ensyu6_19;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_19
 * 概要:クラス数・学生数・点数を入力させ点数の合計と平均点を求める
 * 作成者:ukai
 * 作成日:2023/04/18
 */
public class Ensyu6_19 {
	/*
	 * 関数名:main
	 * 概要:クラス数・学生数・点数を入力させ点数の合計と平均点を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/18
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//変数を宣言
		int classNumber=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("クラス数:");
			//インスタンスから入力された値を受け取る
			classNumber=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(classNumber<=0);
		//点数を格納する配列を宣言
		int[][] scoreArray=new int[classNumber][];
		//点数と学生の総合計を格納する変数を宣言
		int allTotal=0,allStudent=0;
		//クラスカウントがクラス数と等しくなればループ抜け
		for(int classCount=0;classCount<classNumber;classCount++) {
			//変数を宣言
			int studentNumber=0;
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print((classCount+1)+"組の人数:");
				//インスタンスから入力された値を受け取る
				studentNumber=scanInteger.nextInt();
			//正の数が入力されたらループ抜け
			}while(studentNumber<=0);
			//入力値をもとに配列を宣言
			scoreArray[classCount]=new int[studentNumber];
			//学生のカウントが学生数と等しくなればループ抜け
			for(int studentCount=0;studentCount<studentNumber;studentCount++) {
			//後判定ループ文
				do {
					//整数の入力を促す
					System.out.print((classCount+1)+"組の"+(studentCount+1)+"番の点数:");
					//インスタンスから入力された値を受け取る
					scoreArray[classCount][studentCount]=scanInteger.nextInt();
					//正の数が入力されたらループ抜け
				}while(studentNumber<=0);
				//点数の総合計を求める
				allTotal=allTotal+scoreArray[classCount][studentCount];
				//学生総数をインクリメント
				allStudent++;
			}
			//改行を表示
			System.out.println();
		}
		
		//表題を表示
		System.out.print("  組 |\t合計\t平均\n-----+-----------------\n");
		//クラスカウントがクラス数と等しくなればループ抜け
		for(int classCount=0;classCount<scoreArray.length;classCount++) {
			//クラスごとの合計を格納する配列を宣言
			int classTotal=0;
			//学生カウントが学生数と等しくなればループ抜け
			for(int studentCount=0;studentCount<scoreArray[classCount].length;studentCount++) {
				//クラスごとの合計を求める
				classTotal=classTotal+scoreArray[classCount][studentCount];
			}
			//クラスごとの合計と平均を表示
			System.out.print(" "+(classCount+1)+"組 |\t"+classTotal+"\t\t"+(String.format("%.1f",(double)classTotal/scoreArray[classCount].length))+"\n");
		}
		//すべての学生の総計点数と平均点を表示
		System.out.printf("-----+-----------------\n  計 |\t"+allTotal+"\t\t"+(String.format("%.1f",((double)allTotal)/allStudent)));
	}
}