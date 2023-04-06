//ensyu3_17のパッケージ宣言
package ensyu3_17;
//乱数生成のためのインポート文
import java.util.Random;
/*
 * クラス名:Ensyu3_17
 * 概要:0～2の乱数を生成してそれに応じて場合分けしてじゃんけんを表示する
 * 作成者:ukai
 * 作成日:2023/04/06
 */
public class Ensyu3_17 {
	/*
	 * 関数名:main
	 * 概要:0～2の乱数を生成してそれに応じて場合分けしてじゃんけんを表示する
	 * 引数:
	 * 戻り値:
	 * 作成者:ukai
	 * 作成日:2023/04/06
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();
		//0～2の乱数を生成
		int randomValue = randomGeneration.nextInt(3);
		//生成された乱数に応じて場合分け
		switch(randomValue) {
			//0が生成されたときグーを表示
			case 0 :System.out.println("グー");
			//プログラム終了		
			break;
			//1が生成されたときチョキを表示
			case 1 :System.out.println("チョキ");
			//プログラム終了
			break;
			//2が生成されたときパーを表示
			case 2 :System.out.println("パー");
			//プログラム終了
			break;
		}
	}

}
