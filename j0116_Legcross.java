package sql_studying;
import java.util.*;

public class j0116_Legcross {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp_weight = 0;

        Queue<Integer> before_queue = new LinkedList<>();
        Queue<Integer> after_queue = new LinkedList<>();

        //대기 트럭
        for (int how_heavy : truck_weights){
            before_queue.offer(how_heavy);
        }
        //건너 가는 트럭들
        for (int i =0; i<bridge_length; i++){
            after_queue.offer(0);
        }

        while (!before_queue.isEmpty()){
            temp_weight -= after_queue.poll();
            if (temp_weight + before_queue.peek() <= weight){
                int truck = before_queue.poll();
                after_queue.offer(truck);
                temp_weight += truck;
            }
            answer++;
        }
        
        return answer;
    }
    public static void main(String args){
        j0116_Legcross so = new j0116_Legcross();
        int[] truck_weights = {7,4,5,6};
        System.out.println(so.solution(2,10,truck_weights));
    }
}
