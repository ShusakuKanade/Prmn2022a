package lecture07;

import java.util.Scanner;
import java.util.Random;

public class Exercise7_1 {

    public static void main(String[] args) {
        MonsterCreator.viewMonsterList();
        System.out.print("モンスターを選べ:");
        stdinMonsterId();
        randomMonsterId();

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
