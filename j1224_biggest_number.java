package sql_studying;
import java.util.*;

public class j1224_biggest_number {
    public String solution(int[] numbers){
        String answer = "";
        String[] strNumbers = new String[numbers.length];
        for (int i=0;i<numbers.length;i++){
            //String.valueOf() 괄호 안 값을 String으로 만듭니다
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        //comparator<>는 compare 함수 구현해야하는 것
        Arrays.sort(strNumbers, new Comparator<String>() {
            public int compare(String s1, String s2){
                //비교
                return (s2+s1).compareTo(s1 + s2);
            }
        });
        if (strNumbers[0]=="0"){
            return "0";
        }
        for (String strNumber : strNumbers){
            answer += strNumber;
        }

        return answer;
    }
    public static void main(String[] args){
        j1224_biggest_number so = new j1224_biggest_number();
        int[] numbers = {6, 10, 2};
        System.out.println(so.solution(numbers));

    }
}
