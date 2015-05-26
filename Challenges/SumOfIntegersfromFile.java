// Diogo Vidigal, 26/05/2015, CodeEval
//Print out the sum of integers read from a file.

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int total = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            total += Integer.parseInt(line);
        }
        System.out.println(total);
    }
}
