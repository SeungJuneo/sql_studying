package sql_studying;
import java.util.*;

class j1228_call_list{
    public boolean solution(String[] phone_book){
        //비슷한 접두어끼리 만나게 하는 장치
        Arrays.sort(phone_book);
        
        for (int i=0;i<phone_book.length-1;i++){
            //startwidth로 간편하게! oracle의 % 해당함
            if (phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        j1228_call_list so = new j1228_call_list();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(so.solution(phone_book));
    }
}