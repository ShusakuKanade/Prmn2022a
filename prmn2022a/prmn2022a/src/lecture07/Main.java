package lecture07;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonsterCreator.viewMonsterList();
        //System.out.print("モンスターを選べ:");


    }



    private static int stdinMonsterId(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int randomMonsterId(){
        Random rand = new Random();
        return rand.nextInt(3);
    }
}
