package sql_studying;
import java.util.*;

public class j0115_Jusic {
    public int[] solution(int[] prices){
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        for(int i =0; i< prices.length;i++){ 
            // peek은 선입후출에서 가장 마지막꺼 스캔 
            // pop은 실제로 꺼내옴
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int index = stack.pop();
                answer[index] = i - index;
            }
        }
        //stack이 비어있지 않다면 
        while (!stack.isEmpty()){
            int index = stack.pop();
            answer[index] = prices.length - index -1;
        }

        return answer;
    }
    public static void main(String[] args){
        j0115_Jusic so = new j0115_Jusic();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(so.solution(prices));
    }
}
