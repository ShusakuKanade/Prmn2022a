package lecture06;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //System.out.println(random.nextInt(100));

        for(int i=0;i<5;i++){
            list.add(random.nextInt(6));
        }
        System.out.println("さいころを5つ振りました。");

        System.out.println("何番目のさいころの値を確認しますか？");
        try{
            int x = input.nextInt();
            System.out.println(x + "番目のさいころの値は" + list.get(x));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("AllayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }
        catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
