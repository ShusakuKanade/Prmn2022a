package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        String[] msg = new String[2];

        for(int i=0;i<2;i++){
            System.out.println(i+1 + "つ目の整数を入力してください:");
            msg[i] = input.next();
            ans += Integer.parseInt(msg[i]);
        }

        System.out.println(msg[0] + "+" + msg[1] + "=" + ans);
    }
}
