package sql_studying;
import java.util.*;

class j0106_island_connect{
    public int solution(int n, int[][] costs){
        int answer = 0;
        // 1.비용 낮은 순으로 정렬
        Arrays.sort(costs, (a,b) -> Integer.compare(a[2], b[2]));

        // 2. 각 섬들이 속한 관계 배열
        int[] parent = new int[n];
        for (int i=0;i<n;i++){
            parent[i] = i;
        }
        //3. 크루스칼 알고리즘?
        
        return answer;
    }
    public static void main(String[] args){
        j0106_island_connect so = new j0106_island_connect();
        int[][] costs= {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        System.out.println(so.solution(4,costs));
    }
}