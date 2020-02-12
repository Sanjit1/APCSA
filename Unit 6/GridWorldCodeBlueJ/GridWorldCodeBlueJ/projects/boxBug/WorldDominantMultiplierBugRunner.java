import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;
import java.awt.Color;

public class WorldDominantMultiplierBugRunner{
    public static void main(String[] args){
        BoundedGrid g = new BoundedGrid(25, 25);
        ActorWorld world = new ActorWorld(g);
        WorldDominantMultiplierBug yellow = new WorldDominantMultiplierBug();
        WorldDominantMultiplierBug blue = new WorldDominantMultiplierBug();
        WorldDominantMultiplierBug black = new WorldDominantMultiplierBug();
        WorldDominantMultiplierBug white = new WorldDominantMultiplierBug();
        WorldDominantMultiplierBug green = new WorldDominantMultiplierBug();
        yellow.setColor(Color.YELLOW);
        blue.setColor(Color.BLUE);
        black.setColor(Color.BLACK);
        white.setColor(Color.WHITE);
        green.setColor(Color.GREEN);
        world.add(new Location(1, 1), yellow);
        world.add(new Location(3, 3), blue);
        world.add(new Location(5, 5), black);
        world.add(new Location(3, 7), white);
        world.add(new Location(7, 3), green);
        world.show(); 
    }
}