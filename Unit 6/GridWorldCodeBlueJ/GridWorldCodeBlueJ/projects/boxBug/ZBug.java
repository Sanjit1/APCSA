/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.000007632456789
 * - Purpose: Zzzzzz. Good Night
 * - Description: ZBug object
 * - Methods: main()
 * - Gender: Female
 */


import info.gridworld.actor.Bug;
public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    public ZBug(int length){
        steps = 0;
        sideLength = length;
        setDirection(90);
    }
    public void act(){
        if (canMove() && steps<sideLength){
            move();
        }else if (canMove() && steps==sideLength){
            setDirection(215);
        }else if (canMove() && steps<2*sideLength+1){
            move();
        }else if (canMove() && steps==2*sideLength+1){
            setDirection(90);
        }else if (canMove() && steps<3*sideLength+2){
            move();
        }else {
            // Nope Do nothing
        }
        steps++;
    }
}
