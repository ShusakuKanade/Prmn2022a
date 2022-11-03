package lecture04;

import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accountList;
    Account account;
    ATM(){
        accountList = new ArrayList<>();
    }

    void registerAccount(String name,String number){
        if(!existsAccount(name,number)){
            account = new Account(name,number);
            accountList.add(account);
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            System.out.println(name + "さんのアカウントを口座番号:" + number + "で登録しました");
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        }

    }

    boolean existsAccount(String name,String number){
        for(Account tmp : accountList){
            if(tmp.getName().equals(name) && tmp.getNumber().equals(number)){
                return true;
            }
        }
        return false;
    }

    void deposit(String number,long money){
        for(Account tmp : accountList){
            if(tmp.getNumber().equals(number)){
                tmp.setBalance(tmp.getBalance() + money);
                System.out.println("口座番号:" + number + "に" + money + "円入金しました");
            }
        }
    }

    long withdraw(String number,long money){
        for(Account tmp : accountList){
            if(tmp.getNumber().equals(number)){
                if(tmp.getBalance() - money >= 0){
                    tmp.setBalance(tmp.getBalance() - money);
                    System.out.println("口座番号:" + number + "から" + money + "円引き出しました。残高" + (tmp.getBalance()) + "円です");
                    return money;
                }
                else{
                    System.out.println("口座番号:" + number + "から" + money + "円引き出せませんでした。残高" + tmp.getBalance() + "円です");
                    return 0;
                }
            }
            System.out.println("口座番号:" + number + "は存在しません。");
        }
        return 0;
    }


}
