/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.00003456
 * - Purpose: Spin in spirals
 * - Description: SpiralBug Object
 * - Methods: act()
 * - Gender: Male
 */


import info.gridworld.actor.Bug;
public class SpiralBug extends Bug{
    private int steps;
    private int sideLength;
    public SpiralBug(int length){
        steps = 0;
        sideLength = length;
    }
    public void act(){
        if (canMove()==true && steps < sideLength){
            move();
            steps++;
        } else {
            turn(); turn();
            steps = 0;
            sideLength++;
        }
    } 
}
