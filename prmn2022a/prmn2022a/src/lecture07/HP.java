package lecture07;

public class HP {
    private int hp;
    private static int dead = 0;

    public boolean isAlive(){
        return dead == 0;
    }

    public int getHP(){
        return this.hp;
    }
}
