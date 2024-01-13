// --<단계키워드>
// -- 1. 전체적인 max값만 구하려한다
// -- 2. 주어진 범위가 넓다 
// -- 3. DP 로직을 쓴다

// DP 로직:
// 1. 빈 배열을 하나 만든다 
// 2. i->triangle.length, j->i보다 작은 것만
// 3. tg_copy[i-1][j]+tg[i][j] > tg_copy[i][j]라면 
// 4. [i][j]와 [i][j+1]를 [i][j]+(해당 값들)로 값들을 갱신한다
// -- <해결책>
// --  문제를 보고 단계 키워드를 쓰면서 이해했다

package sql_studying;
import java.util.*;
// 0
// 1, 0
// 2, 0
// 2, 1
// 3, 0
// 3, 1
// 3, 2
// 4, 0 
// 4, 1
// 4, 2
// 4, 3


public class j0113_int_triangle {
    public int solution(int[][] tg){
        int[][] tg_copy = new int[tg.length][tg.length];
        tg_copy[0][0] = tg[0][0]; 

        //개량
        //[i-1][j], [i][j]로 변경
        for (int i=1; i<tg.length; i++){
            for (int j=0;j<i;j++){
                if (tg_copy[i-1][j]+tg[i][j] > tg_copy[i][j]){
                    tg_copy[i][j] = tg_copy[i-1][j]+tg[i][j];
                }
                if (tg_copy[i-1][j]+tg[i][j+1] > tg_copy[i][j+1]){
                    tg_copy[i][j+1] = tg_copy[i-1][j]+tg[i][j+1];
                }
            }
        }
        Arrays.sort(tg_copy[tg.length-1]);
        return tg_copy[tg.length-1][tg.length-1];
    }
    public static void main(String[] args){
        j0113_int_triangle so = new j0113_int_triangle();
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        // int[][] triangle = {{0,1,2}, {0,1,2}, {0,1,2}};
        System.out.println(so.solution(triangle));;
    }
}
