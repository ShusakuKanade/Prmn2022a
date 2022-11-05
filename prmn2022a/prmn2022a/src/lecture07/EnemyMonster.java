package lecture07;

public class EnemyMonster extends BattleMonster{
    public EnemyMonster(IMonster monster){
        super(monster);
    }

    public int skillSelect(){
        return 0;
    }

    public void attackOutput(){
        System.out.println("野生の" + getName() + "の攻撃");

    }

    public void remainHpOutput(){
        System.out.println("野生の" + getName() + "のHP:" + getHP());
    }

    @Override
    public void skillListOutPut() {

    }

    public void winOutput(){
        System.out.println("野生の" + getName() + "の勝ち！");
    }

    public void loseOutput(){
        System.out.println("野生の" + getName() + "は倒れた！");
    }

    @Override
    public void attack() {

    }
}
