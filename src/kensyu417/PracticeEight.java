package kensyu417;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PracticeEight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		ArrayList<ArrayList<Integer>> totalList = new ArrayList<>(); 
		int totalTimes = 0;
		int count = 0;
		
		while(count<5) {
			int randomNum = rnd.nextInt(31);
			ArrayList<Integer> arr = new ArrayList<>();  
		
			while(true) {
				System.out.println("0～30までの数字を入力して [Enter] キーを押して、数を当てて下さい");
				String str = scanner.nextLine();
				try {
					int numInput = Integer.parseInt(str);
					if (numInput>30 || numInput <0){
						System.out.println("0～30の整数を入力してください");
						continue;
					}
					
					arr.add(numInput);
					
					if  (numInput > randomNum){
						System.out.println("秘密の数字は" + numInput + "未満です。");
					}else if (numInput < randomNum) {
						System.out.println("秘密の数字は" + numInput + "を超過しています。");
					}else {
						System.out.println("正解です。お疲れ様でした。");
						break;
					}
				}catch (NumberFormatException e) {
					System.out.println("無効な入力です、整数を入力ください");
				}
			}
			
			totalList.add(arr);
			count +=1;
		}
		
		for (ArrayList<Integer> arr : totalList) {
			StringBuilder builder = new StringBuilder();
			int countNum = 0;
			for(Integer num: arr) {
				countNum += 1;
				if (countNum!=1) {
					builder.append("-->");
				}
				builder.append(String.valueOf(num));
			}
			
			System.out.println(builder.toString());
			System.out.println(countNum);
			totalTimes += countNum;
		}
		
		System.out.println("used " + totalTimes + " times to guess all the numbers.");
		scanner.close();
		return;	
	}
}
