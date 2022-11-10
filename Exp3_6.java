import java.util.*;

class MetaStrings {
    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    static boolean checkString(String s1, String s2) {
        int a[] = new int[3];
        if (s1.equals(s2))
            return false;
        if (s1.length() != s2.length())
            return false;
        int unmatched = 0, i;
        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                a[unmatched] = i;
                unmatched++;
            }
        }
        if (unmatched > 2) {
            return false;
        }
        s2 = swap(s2, a[0], a[1]);
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter 2 Strings");
        System.out.print("String 1: ");
        s1 = sc.next();
        System.out.print("String 2: ");
        s2 = sc.next();
        boolean b = checkString(s1, s2);
        if (b) {
            System.out.println("They are Meta Strings");
        } else {
            System.out.println("They are not Meta Strings");
        }
        sc.close();
    }
}