import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains chameleon critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RockHoundRunner {
    
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(5, 5), new Rock());
        world.add(new Location(3, 2), new Rock());
        world.add(new Location(2, 1), new Rock());
        
        RockHound shreyas = new RockHound();
        RockHound loves = new RockHound();
        RockHound dhruv = new RockHound();
        
        world.add(new Location(4, 4), shreyas);
        world.add(new Location(5, 8), loves);
        world.add(new Location(5, 8), dhruv);
        world.show();
        
    }
    
}