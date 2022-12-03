package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator{
    MONKEY(1,new Monkey()),
    PENGUIN(2,new Penguin()),
    TURTLE(3,new Turtle());

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer, MonsterCreator> map = new HashMap<>();

    MonsterCreator(int id,Monster monster){
    }

    public static void viewMonsterList(){
        map.put(1, MONKEY);
        map.put(2, PENGUIN);
        map.put(3, TURTLE);
        for(Map.Entry<Integer,MonsterCreator> entry:map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static Monster setMonster(int id){
        return map.get(id).supplier.get();
    }

    //public static int monsterMinId(){}

    //public static int monsterMaxId(){}

}

