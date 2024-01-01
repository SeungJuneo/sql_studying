package sql_studying;
import java.util.*;

class j1229_hash_clothes {
    
    public int soultion(String[][] clothes){
        // 로직: (얼굴 부위별 물건 개수+1)*(안경 개수+1)-1
        Map<String, Integer> hashMap1 = new HashMap<>();
        int temp = 1;
        for (int i=0;i<clothes.length;i++){
            if (hashMap1.containsKey(clothes[i][1])){
                hashMap1.put(clothes[i][1], hashMap1.get(clothes[i][1])+1);
            }else{
                hashMap1.put(clothes[i][1], 1);
            }
        }
        for (int valuemap : hashMap1.values()){
            temp *= valuemap + 1;
        }
        return temp-1;
    }
    public static void main(String[] args){
        j1229_hash_clothes so = new j1229_hash_clothes();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(so.soultion(clothes));
    }
}
