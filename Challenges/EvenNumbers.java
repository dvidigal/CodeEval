// Diogo Vidigal, 05/06/2015, CodeEval
/*
Write a program which checks input numbers and determines whether a number is even or not.
Print 1 if the number is even or 0 if the number is odd.
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int numb = 0;
            if (Integer.parseInt(line) % 2 == 0) {
                numb = 1;
            }
            System.out.println(numb);
        }
    }
}
