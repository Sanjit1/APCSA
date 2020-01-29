/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.00000020032032207
 * - Purpose: You spin me round round baby round round
 * - Description: Circle Bug Object
 * - Methods: act()
 * - Gender: Male
 */

import info.gridworld.actor.Bug;
public class CircleBug extends Bug{
    private int steps;
    private int sideLength;
    public CircleBug(int length){
        steps = 0;
        sideLength = length;
    }
    public void act(){
        if (steps < sideLength && canMove()){
            move();
            steps++;
        } else {
            turn();
            steps = 0;
        }
    }
}
