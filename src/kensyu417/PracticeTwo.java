package kensyu417;

public class PracticeTwo {
    public static void main(String[] args) {
        // 2: コマンドライン引数として渡された文字列を
        //    for‑each で一つずつ表示する
        for (String str : args) {
            // str に引数が順番に格納される
            System.out.println(str);
        }
    }
}
