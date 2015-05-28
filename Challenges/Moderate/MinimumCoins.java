// Diogo Vidigal, 27/05/2015, CodeEval
/*
You are given 3 coins of value 1, 3 and 5. 
You are also given a total which you have to arrive at. 
Find the minimum number of coins to arrive at it.
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int value = Integer.parseInt(line);
            int diff = 0;
            int count = 0;
            while (value > 0) {
                if (value >= 5) {
                    diff = 5;
                } else if (value >= 3) {
                    diff = 3;
                } else {
                    diff = 1;
                }
                value -= diff;
                count++;
            }
            System.out.println(count);
        }
    }
}
