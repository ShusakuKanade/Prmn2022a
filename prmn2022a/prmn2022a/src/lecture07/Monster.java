package lecture07;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IMonster{
    private String name;
    private HP hp = new HP();
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills;

    protected Monster(String name,int hp,int power,int defense,int speed,List<Skill> skills){
        this.name = name;
        this.setHP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills.addAll(skills);
    }

    protected Monster(IMonster monster){

    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return hp.getHP();
    }

    public void setHP(int hp){
        this.hp.setHP(hp);
    }

    public int getPower(){
        return this.power;
    }

    public int getDefense(){
        return this.defense;
    }

    public boolean isAlive(){
        return hp.isAlive();
    }
}
