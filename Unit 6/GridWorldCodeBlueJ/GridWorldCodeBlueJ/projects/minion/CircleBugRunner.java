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

public class CircleBugRunner{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        CircleBug fuck = new CircleBug(6);
        fuck.setColor(Color.ORANGE);
        CircleBug boob = new CircleBug(3);
        world.add(new Location(7, 8), fuck);
        world.add(new Location(5, 5), boob);
        world.show();
    }
}