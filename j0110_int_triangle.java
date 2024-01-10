// --<단계키워드>
// -- 1. 전체적인 max값만 구하려한다
// -- 2. 주어진 범위가 넓다 
// -- 3. DP 로직을 쓴다

// DP 로직:
// 1. 빈 배열을 하나 만든다 
// 2. i->triangle.length, j->i보다 작은 것만
// 3. tg_copy[i][j]+tg[i+1][j] > tg_copy[i+1][j]라면 
// 4. [i+1][j]와 [i+1][j+1]를 [i][j]+(해당 값들)로 값들을 갱신한다
// -- <해결책>
// --  문제를 보고 단계 키워드를 쓰면서 이해했다
package sql_studying;

public class j0110_int_triangle {
    public int solution(int[][] tg){
        int answer = 0;
        int[][] tg_copy = new int[tg.length][tg.length];
        
        for (int i=0;i>)
        return answer;
    }
    public static void main(String[] args){
        j0110_int_triangle so = new j0110_int_triangle();
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        so.solution(triangle);
    }
}
