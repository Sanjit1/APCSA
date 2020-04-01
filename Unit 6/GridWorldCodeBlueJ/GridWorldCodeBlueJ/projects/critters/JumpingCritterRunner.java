import info.gridworld.grid.*; 
import info.gridworld.actor.*; 
import java.awt.*; 
import java.util.*;

public class JumpingCritterRunner
{
    public JumpingCritterRunner(){}
    public static void main(){
       BoundedGrid g = new BoundedGrid(15,15);
       ActorWorld w = new ActorWorld(g);
       JumpingCritter b1 = new JumpingCritter();
       w.add(new Location(5,5), b1);
       w.show();
    }
}
