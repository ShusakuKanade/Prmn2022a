package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator{
    MONKEY,
    PENGUIN,
    TURTLE;

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer, Monster> map = new HashMap<>();

    //MonsterCreator(int id){this.id = id;}
    public static void viewMonsterList(){
        map.put(MONKEY.id, new Monkey());
        map.put(PENGUIN.id, new Penguin());
        map.put(TURTLE.id, new Turtle());
        for(int i = 0;i<3;i++){
            System.out.println(i + " -> " + map.get(i));
        }
    }

    //public static int monsterMinId(){}

    //public static int monsterMaxId(){}

}

