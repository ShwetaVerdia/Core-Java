

/**
 * Created by Mital Jani on 11/4/14.
 */
public class DemoClassObject {
    public String name;
    public int age;
    public DemoClassObject buddy;
    private boolean magical = false;
    protected double height = 2.6;
    public static final int MAX_HEIGHT = 3;

    DemoClassObject(String nm, int ag, DemoClassObject bud, double hg){
        name = nm;
        age = ag;
        buddy = bud;
        height = hg;
    }
    DemoClassObject(){
        name = "ABC";
        age =201;
        buddy= null;
        height = 2.1;
    }
    public static void makeKing(DemoClassObject h){
        h.name = "King " ;
    }

    public boolean isMagical(){
        return magical;
    }
    public void setHeight(int newHeight){
        height = newHeight;
    }
    public String getName(){
        return "I won't tell ";
    }
    public String getRealName(){
        return name;
    }
    public void renameDemoClassObject (String s){
        name =s;
    }

}
