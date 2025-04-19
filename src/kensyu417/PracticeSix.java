package kensyu417;

import java.util.ArrayList;

public class PracticeSix {
    public static void main(String[] args) {
        // 1: ProcessClass に引数を渡して処理結果をリストで受け取る (質問1)
        ProcessClass pcs = new ProcessClass();
        ArrayList<BeanClass> results = pcs.process(args);

        // 2: リストの各要素からスコアを取得し、順番に表示 (質問2)
        for (int i = 0; i < results.size(); i++) {
            // BeanClass の getter を使って値を取得
            System.out.println("Score " + (i + 1) + ": " + results.get(i).getScore());
        }
    }
}

// ProcessClass: 文字列配列を数値に変換して BeanClass にセットする
class ProcessClass {
    public ArrayList<BeanClass> process(String[] args) {
        ArrayList<BeanClass> list = new ArrayList<>();

        for (String str : args) {
            // 文字列を整数に変換
            int num = Integer.parseInt(str);
            // BeanClass を作成してスコアを設定
            BeanClass bean = new BeanClass();
            bean.setScore(num);
            // リストに追加
            list.add(bean);
        }
        return list;
    }
}
