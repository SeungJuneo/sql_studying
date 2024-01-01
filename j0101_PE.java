package sql_studying;

import java.util.Arrays;

public class j0101_PE {
    //0이 boolean 역할함
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(reserve);
        Arrays.sort(lost);
        //2개 가진얘가 도난 당했을때
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = 0;
                    lost[j] = 0;
                    answer++;
                    break;
                }
            }
        }
        //빌려줄 때
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == 0 || lost[j] == 0) continue;
                if (Math.abs(reserve[i] - lost[j]) == 1){
                    lost[j] = 0;
                    answer ++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String args){
        j0101_PE so = new j0101_PE();
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        so.solution(5, lost, reserve);
    }
}
