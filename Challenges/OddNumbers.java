// Diogo Vidigal, 26/05/2015, CodeEval
//Print the odd numbers from 1 to 99.

public class Main {
    public static void main (String[] args) {
        for(int i = 1; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
