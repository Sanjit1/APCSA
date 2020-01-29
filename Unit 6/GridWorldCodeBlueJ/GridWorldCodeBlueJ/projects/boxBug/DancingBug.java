/**
 * Documentation:
 * - Lab # 29
 * - Author: @Sanjit1
 * - Version: 1.000000000000006
 * - Purpose: To Dance
 * - Description: Dancing BUg object
 * - Methods: turn() act() 
 * - Gender: Female
 */


import info.gridworld.actor.Bug;
public class DancingBug extends Bug{
    private int[] turnList;
    private int currentStep;
    public DancingBug(int[] turns){
        turnList = turns;
        currentStep = 0;
    }
    public void turn(int times){
        for(int j = 1; j <= times; j++){
            turn();
        }
    }
    public void act(){
        if(currentStep == turnList.length){
            currentStep = 0;
        }
        turn (turnList[currentStep]);
        currentStep++;
        super.act();
    }
} 