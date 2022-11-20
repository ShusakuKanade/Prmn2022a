package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator{
    MONKEY(1),
    PENGUIN(2),
    TURTLE(3);

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer, MonsterCreator> map = new HashMap<>();


    MonsterCreator(int id){this.id = id;}
    public static void viewMonsterList(){
        for(MonsterCreator monsters:MonsterCreator.values()){
            System.out.println(monsters.id + "->" + monsters);
        }
    }

    //public static int monsterMinId(){}

    //public static int monsterMaxId(){}

}

