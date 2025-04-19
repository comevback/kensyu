package kensyu417;

public class PracticeFive {
    // 3: メソッド outMessage を定義 (質問3)
    //    引数 message が null なら -1、そうでなければ画面出力して文字数を返す
    public static int outMessage(String message) {
        if (message == null) {
            // null の場合は -1 を返す (質問6)
            return -1;
        }
        // message を画面に表示 (質問1 の応用)
        System.out.println(message);
        // 文字数を返す (質問3)
        return message.length();
    }

    public static void main(String[] args) {
        // 合計文字数を保持する変数を用意 (質問5)
        int sum = 0;

        // 7: 配列にテスト用の文字列を設定し、for ループで順に呼び出す
        String[] strsT7 = {
            "メッセージ文字列　一行目",
            "二行目",
            null,
            "四行目",
            "五行目"
        };

        for (String str : strsT7) {
            // メソッド呼び出し (質問2 & 7)
            int num = outMessage(str);
            if (num == -1) {
                // 質問6: -1 の場合は専用メッセージを出力し、集計しない
                System.out.println("(文字の指定がありません)");
            } else {
                // 質問4: 文字数を表示
                System.out.println(">文字数：" + num);
                // 質問5: 合計に加算
                sum += num;
            }
        }
        // 最後に合計文字数を表示 (質問5)
        System.out.println(">>全文字数：" + sum);
    }
}
