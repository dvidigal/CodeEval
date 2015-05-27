// Diogo Vidigal, 27/05/2015, CodeEval
// Print out the grade school multiplication table upto 12*12.

public class Main {
    public static void main (String[] args) {
        int result;
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                result = i*j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }
}
