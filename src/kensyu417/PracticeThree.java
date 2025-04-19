package kensyu417;

public class PracticeThree {
    public static void main(String[] args) {
        // 1: 変数 str を宣言し、自分の名前を文字列として代入
        String str = "name";
        System.out.println(str);

        // 2: str に半角スペース＋年齢文字列を連結し、表示
        str += " 80";
        System.out.println(str + "\nLength: " + str.length());

        // 3: 半角スペースの位置を検索し、インデックスを表示
        int pos = str.indexOf(" ");
        System.out.println("space is on the index: " + pos);

        // 4: 半角スペースの後ろ（pos+1）から末尾までを切り出して表示
        String sub4 = str.substring(pos + 1);
        System.out.println(sub4);

        // 5: 半角スペースの３文字前（pos-3）から空白直前（pos）までを切り出し、表示
        String sub5 = str.substring(pos - 3, pos);
        System.out.println(sub5);
    }
}
