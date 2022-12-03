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

    MonsterCreator(int id){
        this.id = id;
    }

    public static void viewMonsterList(){
        for(MonsterCreator monsterCreators:MonsterCreator.values()){
            map.put(monsterCreators.id, monsterCreators);
        }
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

