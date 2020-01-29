import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class FuckBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        FuckBug shreyas = new MaleBug(world);
        FuckBug shreya = new FemaleBug(world);
        shreyas.setColor(Color.BLACK);
        shreyas.setDirection(180);
        world.add(new Location(1, 2), shreyas);
        shreya.setColor(Color.BLUE);
        world.add(new Location(6, 2), shreya);
        world.show();
    }
}