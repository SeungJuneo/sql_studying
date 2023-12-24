package sql_studying;
import java.util.*;

public class j1224_Knumber {
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for (int i=0;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int select_num = commands[i][2];
            //Array.copyOfRange 함수는 1부터 세면서 슬라이싱한다
            int[] answer1 = Arrays.copyOfRange(array, start-1, end);
            //오름차순 정렬한다
            Arrays.sort(answer1);
            //select_num은 1부터 시작하므로 -1을 하여 index로 사용한다
            answer[i] = answer1[select_num-1];
        }
        return answer;
    }
    public static void main(String[] args){
        j1224_Knumber so = new j1224_Knumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(so.solution(array, commands)));
    }
}
