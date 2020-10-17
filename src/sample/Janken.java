package sample;

import java.util.Scanner;
import java.util.Random;

public class Janken {

	public static void main(String[] args) {
		// プレイヤーの手が何かを表示する
		while(true){
			System.out.println("「グー」か「チョキ」か「パー」を入力してね☆");

			Scanner scan = new Scanner(System.in);
			int PlayerHund = scan.nextInt();
			if (PlayerHund == 1) {
				System.out.println("あなたが選択した手は「グー」です");
			} else if (PlayerHund == 2) {
				System.out.println("あなたが選択した手は「チョキ」です");
			} else if (PlayerHund == 3) {
				System.out.println("あなたが選択した手は「パー」です");
				scan.close();
			}
			
			// computerの手を表示する
			Random rand = new Random();
			int ComHund = rand.nextInt(2);
			if (ComHund == 1) {
				System.out.println("CPUの手は「グー」です");
			} else if (ComHund == 2) {
				System.out.println("CPUの手は「チョキ」です");
			} else if (ComHund == 3) {
				System.out.println("CPUの手は「パー」です");
			}
			//勝敗判定
			if((PlayerHund == 1 && ComHund == 1)
					||(PlayerHund == 2 && ComHund == 2)
					|| (PlayerHund == 3 && ComHund ==3)){
				System.out.println("あいこdeath");
				continue;
			}else if((PlayerHund == 1 && ComHund == 2)
					||(PlayerHund == 2 && ComHund == 3)
					|| (PlayerHund == 3 && ComHund == 1)){
				System.out.println("あなたの勝ちよ");
				break;
			}else{
				System.out.println("あなたの負けよ");
				break;
			}
			
		}
		
	}
	
}

