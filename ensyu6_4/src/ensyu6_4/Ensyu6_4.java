//ensyu6_4のパッケージ宣言
package ensyu6_4;
//
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu6_4
 * 概要:入力された要素数と配列の値をもとに縦グラフを表示する
 * 作成者:ukai
 * 作成日:2023/04/13
 */
public class Ensyu6_4 {
	/*
	 * 関数名:main
	 * 概要:入力された要素数と配列の値をもとに縦グラフを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/13
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//乱数生成の範囲指定用変数を宣言
		int RANDOM_RANGE=10;
		//入力値を代入する変数を宣言
		int inputValue=0,countValue=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			inputValue=(int)scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		}while(inputValue<=0);
		//int型の配列を宣言
		int[] integerArray=new int[inputValue];
		
			//カウントが入力値を超えたらループ抜け
			for(countValue=0;countValue<inputValue;countValue++) {
				//1～10の乱数を生成して配列の各要素に代入
				integerArray[countValue]=randomGeneration.nextInt(RANDOM_RANGE);
				//入力中のインデックスを表示
				System.out.println("integerArray["+countValue+"]="+integerArray[countValue]);
			}
		//最大値を格納する変数に配列の最初の値を代入
		int maximumValue=integerArray[0];
		
		//カウントが要素数を超えたらループ抜け
		for(countValue=1;countValue<inputValue;countValue++) {
			//最大値より配列の値が大きい場合
			if(maximumValue<integerArray[countValue]) {
				//配列の値を最大値を格納する変数に代入
				maximumValue=integerArray[countValue];
			}
		}
		//配列の最大値を代入した変数heightValueが0になったらループ抜け
		for(int heightValue=maximumValue;heightValue>0;heightValue--){
			//変数widthValueが要素数の値になったらループ抜け
			for(int widthValue=0;widthValue<inputValue;widthValue++) {
				//配列の値を下回っている場合
				if(integerArray[widthValue]>=heightValue) {
					//＊を表示
					System.out.print("*");
				//配列の値を上回っている場合
				}else {
					//空白を表示
					System.out.print(" ");
				}
				//空白を表示
				System.out.print(" ");
			}
			//改行を表示
			System.out.println();
		}
		//カウントが要素数を超えたらループ抜け
		for(countValue=0;countValue<inputValue;countValue++) {
			//-を表示
			System.out.print("--");
		}
		//改行を表示
		System.out.println();
		//カウントが要素数を超えたらループ抜け
		for(countValue=0;countValue<inputValue;countValue++) {
			//インデックスを10で割った余を表示
			System.out.print((countValue%10)+" ");
		}
	}

}
