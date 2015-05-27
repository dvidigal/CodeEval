// Diogo Vidigal, 26/06/2015, CodeEval
//Write a program which determines the sum of the first 1000 prime numbers

public class Main {
    public static void main (String[] args) {
        int sum = 1;
        int count = 0;
        int i = 0;
        while (count < 1000) {
            i++;
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            
        }
        System.out.println(sum);
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
