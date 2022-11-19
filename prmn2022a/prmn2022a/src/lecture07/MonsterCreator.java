package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator{
    MONKEY(0),
    PENGUIN(1),
    TURTLE(2);

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer, lecture07.MonsterCreator> map = new HashMap<Integer, lecture07.MonsterCreator>();

    MonsterCreator(int id){this.id = id;}
    public static void viewMonsterList(){
        for(lecture07.MonsterCreator monsters: lecture07.MonsterCreator.values()){
            System.out.println(monsters.id + "->" + monsters);
        }
    }

    //public static int monsterMinId(){}

    //public static int monsterMaxId(){}

}

