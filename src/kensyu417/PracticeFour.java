package kensyu417;

public class PracticeFour {
    public static void main(String[] args) {
        // 1: 文字列 "500" を str に代入し、表示＆クラス名を出力
        String str = "500";
        System.out.println(str);
        System.out.println(str.getClass().getName());

        // 2: str を int に変換して num に代入し、表示＆クラス名を出力
        int num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println(((Object) num).getClass().getName());

        // 3: num を double にキャストし、3で割った結果を表示
        double numDouT3 = (double) num;
        numDouT3 /= 3;
        System.out.println(numDouT3);

        // 4: 小数点第1位で四捨五入して表示
        double numDouT4 = (double) num;
        numDouT4 = (double) Math.round((numDouT4 / 3) * 10) / 10;
        System.out.println(numDouT4);
    }
}
