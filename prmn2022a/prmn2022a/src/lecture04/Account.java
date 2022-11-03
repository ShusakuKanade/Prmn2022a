package lecture04;

import java.util.Scanner;

import static java.lang.System.exit;

public class Account {
    private String name;
    private String number;
    private long balance;  //残高

    Account(String name,String number){
        this.name = name;
        this.setNumber(number);
        this.balance = 0;
    }

    String getName(){
        return this.name;
    }

    String getNumber(){
        return this.number;
    }

    void setNumber(String number){
        Scanner input = new Scanner(number);
        if(input.hasNextInt()){
            this.number = number;
        }
        else{
            System.out.println("口座番号は整数で入力してください。");
            exit(0);
        }
    }

    long getBalance(){
        return this.balance;
    }

    void setBalance(long balance){
        this.balance = balance;
    }
}
