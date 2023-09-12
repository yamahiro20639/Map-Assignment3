package org.example;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new LinkedHashMap<>(); //値が順番どおりに反映されなかったためLinkedHashMapを活用

        personAge.put("山田", 26);  //keyは人物　値は年齢
        personAge.put("向井", 33);
        personAge.put("高橋", 55);
        for (Map.Entry<String, Integer> entry : personAge.entrySet()) { //Mapを反復させるためにentrySet()を活用
            System.out.println(entry.getValue());

        }
    }
}
