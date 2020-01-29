/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.0007
 * - Purpose: To Dance
 * - Description: Makes a DancingBug and puts it on a Grid
 * - Methods: main()
 * - Gender: Female
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class DancingBugRunner{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        int[] turns = {2,4,1,6};
        DancingBug alice = new DancingBug(turns);
        alice.setColor(Color.ORANGE);
        world.add(new Location(6, 3), alice);
        world.show(); 
    }
}