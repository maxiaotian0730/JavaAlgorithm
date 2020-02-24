package practise;

import java.util.Scanner;

/**
 * @author malu
 */
public class PopBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            if (n > 0) {
                while (n > 1) {
                    count += n / 3;
                    n = n / 3 + n % 3;
                    if (n == 2) {
                        count += 1;
                        break;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
