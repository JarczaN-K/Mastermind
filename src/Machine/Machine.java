package Machine;

import java.util.Arrays;

public class Machine {
    private String[] cipher = new String[]{"W", "G"};
    String[] colours = new String[] {"W", "G", "O", "R", "B", "V"};

    private int randomize(String[] randomizer){
        int length = randomizer.length;
        return 0;
    }

    public void start(){
        System.out.println(Arrays.toString(cipher));
    }


    public String[] createCipher(){
        return cipher;
    }

    public int getCipherLength() {
        return cipher.length;
    }
}
