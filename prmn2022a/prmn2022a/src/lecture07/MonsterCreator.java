package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator{
    MONKEY(new Monkey()),
    PENGUIN(new Penguin()),
    TURTLE(new Turtle());

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer, MonsterCreator> map = new HashMap<>();

    MonsterCreator(Monster monster){
    }

    public static void viewMonsterList(){
        map.put(1,MONKEY);
        map.put(2,PENGUIN);
        map.put(3,TURTLE);
        for(Map.Entry<Integer,MonsterCreator> entry:map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    //public static int monsterMinId(){}

    //public static int monsterMaxId(){}

}

