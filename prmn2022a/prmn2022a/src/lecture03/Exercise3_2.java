package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int times = input.nextInt();
        String blank = input.nextLine();

        for(int i=0;i<times;i++){
            System.out.println(i+1 + "行目:");
            strings.add(input.nextLine());
        }

        System.out.println("入力した文字列:");
        for(String string : strings){
            System.out.println(string);
        }
    }
}
