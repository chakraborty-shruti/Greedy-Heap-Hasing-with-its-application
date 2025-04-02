//Hashing is particularly used in key-Value type of question

import java.util.HashMap;
import java.util.Map;

class Test{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("amazon",10);
        map.put("google",20);
        map.put("microsoft",30);
        map.put("meta",40);
        map.put("apple",50);

        System.out.println(map);
        System.out.println(map.size());

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}