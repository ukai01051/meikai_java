//ensyu6_5
package ensyu6_5;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_5
 * 概要:入力された要素数と各配列の値をもとに配列の内容を表示
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu6_5 {
	/*
	 * 関数名:main
	 * 概要:入力された要素数と各配列の値をもとに配列の内容を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int elmentCount=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(elmentCount<=0);
		//int型の配列を宣言
		int[] integerArray=new int[elmentCount];
		
		//配列の要素数が最後まで行ったらループ抜け
		for(int countValue=0;countValue<elmentCount;countValue++) {
			//整数の入力を促す
			System.out.print("integerArray["+countValue+"]=");
			//インスタンスから入力された値を受け取る
			integerArray[countValue]=(int)scanInteger.nextDouble();
		}
		//配列名を表示
		System.out.print("integerArray={");
		//配列のインデックスが最後まで行ったらループ抜け
		for(int countValue=0;countValue<elmentCount;countValue++) {
			//配列の値を表示
			System.out.print(integerArray[countValue]);
			//配列の最後のインデックスとカウント数が異なる場合
			if(countValue!=elmentCount-1) {
				//,を表示
				System.out.print(",");
			//配列の最後のインデックスとカウント数が一致した場合
			}else {
				//}を表示
				System.out.print("}");
			}
		}			
	}
}
