import java.util.*;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') || 
                (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')) 
                {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
