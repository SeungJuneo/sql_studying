package sql_studying;

import java.util.*;

class j0106_rescueboat{
    public int solution(int[] people, int limit){
        Arrays.sort(people);
        int answer = 0;
        //이중탐색
        int start = 0;
        int end = people.length -1;
        while (start <= end) {
            if (people[start]+people[end] <= limit){
                start++;
            }
            end--;
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        j0106_rescueboat so = new j0106_rescueboat();
        int[] people ={70,50,80,50};
        System.out.println(so.solution(people,100));
    }
}