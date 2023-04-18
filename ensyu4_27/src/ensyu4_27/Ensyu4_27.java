//ensyu4_27のパッケージ宣言
package ensyu4_27;
//乱数生成のためのインポート文
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu4_27
 * 概要:10～99の乱数を生成してヒントを表示しながら数を当てさせる
 * 作成者:ukai
 * 作成日:2023/04/07
 */
public class Ensyu4_27{
	/*
	 * 関数名:main
	 * 概要:10～99の乱数を生成してヒントを表示しながら数を当てさせる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/07
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//10～99の乱数を生成してランダム用の変数に代入
		int randomValue=randomGeneration.nextInt(90)+10;
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scannerInt=new Scanner(System.in);
		//入力値とカウント数を格納する変数を宣言
		int inputValue=0,countValue=1;
		//回答回数を格納する変数を宣言
		int answerNumber=0;
		
		//数当てゲームの開始表示
		System.out.println("数当てゲーム開始！");
		//数を当てる範囲を表示
		System.out.println("10～99の数を当ててください。");
		
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("回答回数を決めてください：");
			//インスタンスから入力された値を受け取る
			answerNumber=scannerInt.nextInt();
		//正の数が入力されたらループ抜け
		}while(answerNumber<=0);

		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("いくつかな:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInt.nextInt();
			//回答可能回数を超えた場合
			if(countValue==answerNumber) {
				//終了メッセージと正解を表示
				System.out.println("回答回数を超えました。\n正解は"+randomValue+"でした。");
				//ループ抜け
				break;
			}
			//入力された値が乱数より大きい場合
			if(inputValue>randomValue) {
				//ヒントを表示
				System.out.println("もっと小さな数だよ。");
			//入力された値が乱数より小さい場合
			}else if(inputValue<randomValue) {
				//ヒントを表示
				System.out.println("もっと大きな数だよ。");
			}
			//入力値と乱数が異なる場合
			if(inputValue!=randomValue) {
				//カウントをインクリメントして次のループへ
				countValue++;continue;
			}
			//正解であることを表示してループ抜け
			System.out.println("正解です。");break;
		//入力値が乱数と一致した場合ループ抜け
		}while(inputValue!=randomValue);
	}

}