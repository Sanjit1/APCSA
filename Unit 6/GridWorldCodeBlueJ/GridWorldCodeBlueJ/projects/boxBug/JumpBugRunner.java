/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.0007
 * - Purpose: To Dance
 * - Description: Makes a Jumper and puts it on a Grid
 * - Methods: main()
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;
public class JumpBugRunner{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        Jumper Shreyas = new Jumper();
        Dhruv dhruv = new Dhruv();
        Rock oYea = new Rock();
        Shreyas.setColor(Color.WHITE);
        dhruv.setColor(Color.WHITE);
        world.add(new Location(5, 3), Shreyas);
        world.add(new Location(4, 3), oYea);
        world.add(new Location(9, 3), dhruv);
        world.show(); 
    }
}