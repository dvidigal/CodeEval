// Diogo Vidigal, 27/05/2015, CodeEval
/*
You are given a 2D N×N matrix. Each element of the matrix is a letter: from ‘a’ to ‘z’. 
Your task is to rotate the matrix 90° clockwise.
The first argument is a file that contains 2D N×N matrices, 
presented in a serialized form (starting from the upper-left element), one matrix per line. 
The elements of a matrix are separated by spaces.
For Example: 
Input:  "a b c d e f g h i j k l m n o p"
Output: "m i e a n j f b o k g c p l h d"
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split(" ");
            String msg = "";
            int size = values.length;
            int n = (int) Math.sqrt(size);
            int j = 0;
            for (String value : values) {
                size -= n;
                if (size < 0) {
                    j++;
                    size = values.length + j - n;
                }
                msg += values[size] + " ";
            }
            System.out.println(msg);
        }
    }
}
