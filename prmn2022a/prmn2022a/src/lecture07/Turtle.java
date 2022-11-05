package lecture07;

import java.util.Arrays;

public class Turtle extends Monster{

    Turtle(){
        super("Turtle",55,17,16,15, Arrays.asList(new Tackle(),new RazorLeaf()));
    }
}
