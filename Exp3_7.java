import java.util.*;

class Characters {
    static void count_characters(String str) {
        int vowels = 0, consonants = 0, spaces = 0, words = 0, alphabets = 0, specials = 0,
                digits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            } else if (ch >= '0' && ch <= '9')
                digits++;
            else if (ch == ' ')
                spaces++;
            else
                specials++;
        }
        words = spaces + 1;
        alphabets = vowels + consonants;
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Words: " + words);
        System.out.println("Digits: " + digits);
        System.out.println("Blank Spaces: " + spaces);
        System.out.println("Special Characters: " + specials);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter a string: ");
        str = s.nextLine();
        count_characters(str);
        s.close();
    }
}