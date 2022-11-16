package lecture07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator {
    MONKEY(0),
    PENGUIN(1),
    TURTLE(2);

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer,MonsterCreator> map = new HashMap<Integer,MonsterCreator>();

    private MonsterCreator(int id){
        this.id = id;
    }

    public void viewMonsterList(){
        for(MonsterCreator monsters:MonsterCreator.values()){
            System.out.println(monsters.id + "->" + monsters);
        }
    }

    public int monsterMinId(){

    }

    public int monsterMaxId(){

    }

}
