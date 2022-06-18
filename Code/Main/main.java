package Main;
import classes.Mairie;
import view.window;

import view.mariagegui;

public class main {
    public static Mairie m = new Mairie("Evry");
    public static void main(String args[]) {
        window w = new window();
        w.setVisible(true);
    }

}
