import java.util.*;

class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<Integer> item = new Vector<Integer>();
        item.add(4);
        item.add(2);
        item.add(6);
        item.add(4);
        item.add(4);
        item.add(8);
        item.add(6);
        System.out.println(item);
        System.out.print("Enter the element whose frequency is required: ");
        int i = s.nextInt();
        int freq = 0;
        for (int j = 0; j < item.stream().count(); j++) {
            if (item.get(j) == i)
                freq++;
        }
        System.out.print("The required fequency is: " + freq);
        s.close();
    }
}