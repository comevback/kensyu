package kensyu417;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class PracticeSeven {
	public static void main(String[] args) {
		ArrayList<BigDecimal> list = new ArrayList<>();
		Random rnd = new Random();
		BigDecimal sum = BigDecimal.ZERO;
		int avg;

		int randomNum = rnd.nextInt(5)+1;
		System.out.println("length of arraylist is: "+ randomNum);
		
		for (int i= 0; i<randomNum;i++) {
			double dNum = rnd.nextDouble()*10;
			dNum = ((double)Math.round(dNum*100000))/100000;
			// System.out.println(dNum);
			BigDecimal num = BigDecimal.valueOf(dNum);
			// System.out.println(num);
			sum = sum.add(num);
			list.add(num);
		}
		
		BigDecimal avgB = sum.divide(BigDecimal.valueOf(randomNum),1,RoundingMode.HALF_UP);
		// System.out.println(avgB);
		double avgD = avgB.doubleValue();
		avg =(int)Math.round(avgD);
		System.out.println("sum is: "+ sum);
		System.out.println("average is: "+ avg);
	}
}
