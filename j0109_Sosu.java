package sql_studying;

import java.util.HashSet;

public class j0109_Sosu{
    public int solution(String numbers) {
        HashSet<Integer> primeSet = new HashSet<>();
        //??
        generatePrimes("", numbers.toCharArray(), new boolean[numbers.length()], primeSet);
        return primeSet.size();
    }
    //로직?
    private void generatePrimes(String current, char[] numArray, boolean[] visited, HashSet<Integer> primeSet) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (isPrime(num)) {
                primeSet.add(num);
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                generatePrimes(current + numArray[i], numArray, visited, primeSet);
                visited[i] = false;
            }
        }
    }
//sqrt?
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