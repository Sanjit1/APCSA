/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.00000020032032207
 * - Purpose: Zzzzzz. Good Night
 * - Description: Makes a ZBug and puts it on a Grid
 * - Methods: main()
 * - Gender: Male
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ZBugRunner{
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        ZBug alice = new ZBug(6);
        alice.setColor(Color.YELLOW);
        world.add(new Location(2, 2), alice);
        world.show();
    }
}