package sql_studying;

class j1224_Hindex {
    public int solution(int[] citations){
        int answer = 0;
        int n = citations.length;
        for (int i=0;i<n;i++){
            if (citations[i]>= n-i){
                return n-i;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        j1224_Hindex so = new j1224_Hindex();
        int[] citations = {3,0,6,1,5};
        so.solution(citations);
    }    
}
