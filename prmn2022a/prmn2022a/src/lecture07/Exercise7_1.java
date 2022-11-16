package lecture07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise7_1 {

    public static void main(String[] args) {
        

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
