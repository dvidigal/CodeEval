// Diogo Vidigal, 27/07/2015, CodeEval
/*
Given two integers N and M, count the number of prime numbers between N and M (both inclusive)
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int start = Integer.parseInt(line.split(",")[0]);
            int end = Integer.parseInt(line.split(",")[1]);
            int count = 0;
            for(int i = start; i <= end; i++) {
                if(isPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
    static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
