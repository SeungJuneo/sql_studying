package sql_studying;

class j0105_biggest_su{
    public String solution(String number, int k){
        //연산 속도가 빠른 StringBuider 타입
        StringBuilder answer = new StringBuilder();
        
        //제거할 수 정의
        int remain = number.length()-k;
        int startIdx = 0;

        for (int i=0;i<remain;i++){
            char maxDight = '0';
            //K+i+1
            int endIdx = number.length()-remain+i+1;
            for (int j=startIdx;j<endIdx;j++){
                if (number.charAt(j)>maxDight){
                    maxDight = number.charAt(i);
                    startIdx = j+1;
                }
            }
            answer.append(maxDight);
        }
        return answer.toString();
    }
    public static void main(String[] args){
        j0105_biggest_su so = new j0105_biggest_su();
        System.out.println(so.solution("1924",2));
    }
}