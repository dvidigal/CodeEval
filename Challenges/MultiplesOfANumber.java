// Diogo Vidigal, 27/05/2015, CodeEval
// Given numbers x and n, where n is a power of 2, 
// print out the smallest multiple of n which is greater than or equal to x. 
// Do not use division or modulo operator.

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] aux = line.split(",");
            int ref = Integer.parseInt(aux[0]);
            int multi = Integer.parseInt(aux[1]);
            int result = 0;
            while(result < ref) {
                result += multi;
            }
        System.out.println(result);
        }
    }
}
