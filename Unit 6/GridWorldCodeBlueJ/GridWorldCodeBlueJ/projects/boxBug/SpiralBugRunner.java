/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.00000020032032207
 * - Purpose: You spin me round round baby round round
 * - Description: Makes a CircleBug and puts it on a Grid
 * - Methods: main()
 * - Gender: Male
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class SpiralBugRunner{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(6);
        alice.setColor(Color.YELLOW);
        SpiralBug bob = new SpiralBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}