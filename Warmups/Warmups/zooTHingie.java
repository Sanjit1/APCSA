public class zooTHingie
{
    public void welcome(){
        System.out.println("Welcome to the 2020");
    }

    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public int multiply(int[] intArray){
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i<intArray.length; i++){
            sum = intArray[i] + sum;
            multiply = multiply* intArray[i];
        }
        System.out.println(sum);
        return multiply;
    }
}