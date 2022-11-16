package lecture07;

import java.util.Map;
import java.util.function.Supplier;

public enum MonsterCreator {
    MONKEY,
    PENGUIN,
    TURTLE;

    private int id;
    private Supplier<Monster> supplier;
    private static Map<Integer,MonsterCreator> ;

    public void viewMonsterList(){

    }

    public int monsterMinId(){

    }

    public int monsterMaxId(){

    }

}
