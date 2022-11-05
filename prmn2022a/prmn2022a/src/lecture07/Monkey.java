package lecture07;

import java.util.Arrays;

public class Monkey extends Monster{

    Monkey() {
        super("Monkey", 44, 14, 11, 31, Arrays.asList(new Scratch(),new Tackle(),new Ember()));
    }
}
