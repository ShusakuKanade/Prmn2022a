package lecture07;

import java.util.ArrayList;

public class Exercise7_1 {
    public static void main(String[] args) {
        ArrayList<Skill> moveList = new ArrayList<>();

        moveList.add(new Tackle());
        moveList.add(new Scratch());
        moveList.add(new Peck());
        moveList.add(new RazorLeaf());
        moveList.add(new Ember());
        moveList.add(new Bubble());

        for(Skill moveLists:moveList){
            System.out.println(moveLists.getName() + "は" + moveLists.getPower() + "ダメージ");
        }
    }
}
