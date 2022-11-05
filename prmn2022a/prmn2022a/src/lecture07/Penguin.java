package lecture07;

import java.util.Arrays;

public class Penguin extends Monster{

    Penguin(){
        super("Penguin",53,12,13,20, Arrays.asList(new Peck(),new Tackle(),new Bubble()));
    }
}
