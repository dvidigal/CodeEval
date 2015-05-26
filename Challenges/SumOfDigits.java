// Diogo Vidigal, 26/05/2015, CodeEval
//Given a positive integer, find the sum of its constituent digits.

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int sum = 0;
            for(int i = 0; i < line.length(); i++) {
                sum += line.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}
