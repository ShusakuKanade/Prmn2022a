package lecture07;

public class PlayerMonster extends BattleMonster{
    public PlayerMonster(IMonster monster){
        super(monster);
    }

    public int skillSelect(){
        return 0;
    }

    public void attackOutput(){
        System.out.println("プレイヤーの" + getName() + "の攻撃！");
    }

    public void remainHpOutput(){
        System.out.println("プレイヤーの" + getName() + "のHP:" + getHP());
    }

    @Override
    public void skillListOutPut() {

    }

    public void winOutput(){
        System.out.println("プレイヤーの" + getName() + "の勝ち！");
    }

    public void loseOutput(){
        System.out.println("プレイヤーの" + getName() + "は倒れた");
    }

    @Override
    public void attack() {

    }
}
