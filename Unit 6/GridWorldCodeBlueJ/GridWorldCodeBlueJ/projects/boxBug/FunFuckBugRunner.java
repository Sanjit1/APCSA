import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color; 
import java.util.Random;

public class FunFuckBugRunner
{
    public static void main(String[] args){
        Random random = new Random();
        BoundedGrid grid = new BoundedGrid(50,80);
        ActorWorld world = new ActorWorld(grid); 
        for(int i = 0; i<random.nextInt(200)+100; i++){
            FuckBug [] arr = {new MaleBug(world), new FemaleBug(world)};
            FuckBug fuckers = arr[random.nextInt(arr.length)];
            float r = random.nextFloat();
            float g = random.nextFloat();
            float b = random.nextFloat();
            fuckers.setColor(new Color(r, g, b));
            int[] arrayOfDir = {0, 45, 90, 135, 180, 225, 270, 315, 360};
            fuckers.setDirection(random.nextInt(arrayOfDir.length));
            world.add(new Location(random.nextInt(50), random.nextInt(80)), fuckers);            
        }
        world.show();
    }
}