package sql_studying;

import java.util.HashSet;

public class j0109_Sosu{
    public int solution(String numbers) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        gp("", numbers.toCharArray(), new boolean[numbers.length()], hashSet1);
        return hashSet1.size();
    }
    //제곱근으로 소수 판단하고 재귀함수로 한 숫자씩 더해감.
    private void gp(String current, char[] numArray, boolean[] visited, HashSet<Integer> hashSet1) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            //hashSet1에 추가할지 말지 결정
            if (isPrime(num)) {
                hashSet1.add(num);
            }
        }
        //재귀함수
        for (int i = 0; i < numArray.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                gp(current + numArray[i], numArray, visited, hashSet1);
                visited[i] = false;
            }
        }
    }
//sqrt = 제곱근
    //num에 제곱근만큼 반복해서 나눴을 경우 나머지가 0인지 판단하는 메서드
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        j0109_Sosu so = new j0109_Sosu();
        System.out.println(so.solution("17"));  // Output: 3
        System.out.println(so.solution("011")); // Output: 2
    }


}