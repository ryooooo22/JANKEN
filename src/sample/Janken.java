package sample;

import java.util.Scanner;
import java.util.Random;

public class Janken {

	public static void main(String[] args) {
		// プレイヤーの手が何かを表示する
		while(true){
			System.out.println("「グー」か「チョキ」か「パー」を入力してね☆");
			Scanner scan = new Scanner(System.in);
			String playerHund = scan.nextLine();
			if (playerHund.equals("グー")) {
				System.out.println("あなたが選択した手は「グー」です");
			} else if (playerHund.equals("チョキ")) {
				System.out.println("あなたが選択した手は「チョキ」です");
			} else if (playerHund.equals("パー")) {
				System.out.println("あなたが選択した手は「パー」です");
			}

			// computerの手を表示する
			Random rand = new Random();
			int comHand = rand.nextInt(3);
			if (comHand == 0) {
				System.out.println("CPUの手は「グー」です");
			} else if (comHand == 1) {
				System.out.println("CPUの手は「チョキ」です");
			} else if (comHand == 2) {
				System.out.println("CPUの手は「パー」です");
			}
			//勝敗判定
			if((playerHund.equals("グー") && comHand == 0)
					||(playerHund.equals("チョキ") && comHand == 1)
					|| (playerHund.equals("パー")  && comHand == 2)){
				System.out.println("あいこdeath");
				continue;
			}else if((playerHund.equals("グー") && comHand == 1)
					||(playerHund.equals("チョキ") && comHand == 2)
					|| (playerHund.equals("パー") && comHand == 0)){
				System.out.println("あなたの勝ちよ");
				scan.close();
				break;
			}else{
				System.out.println("あなたの負けよ");
				scan.close();
				break;
			}

		}

	}

}

