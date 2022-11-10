import java.util.*;
import java.io.*;

class Constraints {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the no of test cases : ");
        int t = Integer.parseInt(br.readLine());
        String[] strNums;
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the no of elements in array : ");
            int n = Integer.parseInt(br.readLine());
            System.out.println("Enter the values of elements in array : ");
            strNums = br.readLine().split(" ");
            Vector<Integer> rem = new Vector<Integer>();
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(strNums[j]);
            }
            for (int j = 0; j < n; j++) {
                rem.add(sum - Integer.parseInt(strNums[j]));
            }
            System.out.println("The output is :\n" + rem);
            sum = 0;
            rem.clear();
        }
    }
}