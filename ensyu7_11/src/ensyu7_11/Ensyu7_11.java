package ensyu7_11;
//標準入力のためのインポート文
import java.util.Scanner;
/*
 * クラス名:Ensyu7_11
 * 概要:整数を左右にシフトした値と2のべき乗での乗算や除算と等しくなることを確認する
 * 作成者:ukai
 * 作成日:2023/04/19
 */
public class Ensyu7_11 {
	/*
	 * 関数名:main
	 * 概要:整数を左右にシフトした値と2のべき乗での乗算や除算と等しくなることを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:ukai
	 * 作成日:2023/04/19
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInteger=new Scanner(System.in);
		//入力値を格納する変数を宣言
		int inputValue=0,shiftValue=0;
		//後判定ループ文
		do {
			//数値の入力を促す
			System.out.print("整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scanInteger.nextInt();	
		//正の数が入力されたらループ抜け
		}while(inputValue<0);
		
		//後判定ループ文
		do {
			//ビット数の入力を促す
			System.out.print("シフトするビット数:");
			//インスタンスから入力された値を受け取る
			shiftValue=scanInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(shiftValue<1||shiftValue>32);
		//整数をビット数で左シフトした値を表示
		System.out.println("左シフト:"+(inputValue<<shiftValue));
		//整数をビット数で右シフトした値を表示
		System.out.println("右シフト:"+(inputValue>>shiftValue));
		//べき乗を計算するための変数を宣言
		int exponentiationValue=1;
		//カウントがビット数と等しくなればループ抜け
		for(int countValue=0;countValue<shiftValue;countValue++) {
			//2のビット数乗を計算
			exponentiationValue=exponentiationValue*2;
		}
		//整数と2のビット数乗の乗算を表示
		System.out.println(inputValue+"*2の"+shiftValue+"乗:"+(inputValue*exponentiationValue));
		//整数と2のビット数乗の除算を表示
		System.out.println(inputValue+"/2の"+shiftValue+"乗:"+(inputValue/exponentiationValue));
		
	}

}
