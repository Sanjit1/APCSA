import java.util.*;

public class OnlinePurchaseManager
{
    /** An ArrayList of purchased Gizmo objects,
    instantiated in the constructor. */
    private ArrayList<Gizmo> purchases;
    /** Returns the number of purchased Gizmo objects that are
    electronic and are
     * manufactured by maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker){  
        int numberOfElectronics = 0;
        for (int i = 0; i < purchases.size(); i++) {
            if(purchases.get(i).equals(maker) && purchases.get(i).isElectronic()){
                numberOfElectronics++;
            }
        }
        return numberOfElectronics;
    }

    /** Returns true if any pair of adjacent purchased Gizmo
    objects are equivalent, and
     * false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair(){
        for (int i = 0; i < purchases.size() - 1; i++) {
            if (purchases.get(i).equals(purchases.get(i+1))) {
                return true;
            }
        }
        return false;
    }
}