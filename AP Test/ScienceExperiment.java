import java.util.*;
public class ScienceExperiment {
    private ArrayList<Trial> trialList;
    
    public double getCompoundAvg(String comp){
        int numberOfTrialsWithcomp = 0;
        double totalTemperature = 0;
        for (int i = 0; i < trialList.size(); i++){
            if (trialList.get(i).getCompound().equals(comp)){
                numberOfTrialsWithcomp++;
                totalTemperature += trialList.get(i).getTemp();
            }
        }
        if (numberOfTrialsWithcomp == 0){
            return -1.0;
        } else {
            return numberOfTrialsWithcomp/((double) totalTemperature);
        }
    }
    
    public ArrayList<String> getCompoundList() {
        return new ArrayList<String>();
    }
    
    public String getCompoundWithHighestAvg(){
        ArrayList<String> listOfCompounds = getCompoundList();
        ArrayList<Double> averages = new ArrayList<Double>();
        for (int i = 0; i < listOfCompounds.size(); i++) {
            averages.add(getCompoundAvg(listOfCompounds.get(i)));
        }
        int highest = 0;
        for ( int i = 1; i < listOfCompounds.size(); i++ ) {
            if ( averages.get(i) > averages.get(highest) ) {
                highest = i;
            }
        }
        return listOfCompounds.get(highest);
    }
}
