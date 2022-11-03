package lecture04;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();

        long money = 0;

        while(true){
            System.out.println("操作を選んでください r:登録 d:入金 w:引出 q:終了");
            String op = input.next();

            switch(op){
                case "r":
                    System.out.println("登録する名前と口座番号を入力してください");
                    atm.registerAccount(input.next(),input.next());
                    break;
                case "d":
                    System.out.println("入金する口座番号と金額入力してください");
                    atm.deposit(input.next(),input.nextLong());
                    break;
                case "w":
                    System.out.println("引出する口座番号と金額入力してください");
                    money += atm.withdraw(input.next(),input.nextLong());
                    break;
                case "q":
                    exit(0);
            }
        }

        //atm.registerAccount("畠中美南斗","3710");
        //atm.registerAccount("畠中美南斗","3710");

        //atm.deposit("3710",1000);
        //atm.withdraw("3710",2000);
        //atm.withdraw("3710",500);
    }
}
