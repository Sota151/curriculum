package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
    	 ArrayList<String> shohinList = new ArrayList<String>(){
             {
             add(SHOP_SHOHIN_00);
             add(SHOP_SHOHIN_01);
             add(SHOP_SHOHIN_02);
             add(SHOP_SHOHIN_03);
         }
         };
    	
    	
    	
        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * get内の引数をキー値として配列番号と値段に相当する整数を得る
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        
        for (Map.Entry<String, Integer> ent : shopMap.entrySet()) {
            System.out.println(ent + "円になります");
          }

          
}
}