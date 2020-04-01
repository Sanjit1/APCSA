
import java.util.ArrayList;
import java.util.Random;

public class Generator {

    private int length;

    Generator(int aLength) {
        length = aLength;

    }

    public ArrayList<String> Instantiator() {
        String[] Letters = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] Symbols = new String[] { "!", "@", "#", "$", "%", "&", "_" };

        ArrayList<String> DataBase = new ArrayList<String>();
        for (int i = 0; i < Symbols.length + Letters.length + 10; i++) {
            if (i < 10) {
                DataBase.add(String.valueOf(i));
            } else if (i < Symbols.length+10) {
                    DataBase.add(Symbols[i-10]);
            } else if (i < Letters.length+Symbols.length+10) {
                DataBase.add(Letters[i-10-Symbols.length]);
            }
        }

        return DataBase;

    }

    public String Creator(ArrayList<String> DataBase) {

        Random random = new Random();
        int initial = random.nextInt(DataBase.size());
        String PassW = "";

        for (int j = 0; j < length; j++) {
            int index = random.nextInt(DataBase.size());

            String Part = DataBase.get(index);

            PassW += Part;
        }
        return PassW;
    }
}