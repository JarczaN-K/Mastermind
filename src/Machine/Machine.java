package Machine;

import Player.Player;

import java.util.Arrays;
import java.util.Scanner;

public class Machine {
    private String[] cipher = new String[]{"W", "G"};
    String[] colours = new String[]{"W", "G", "O", "R", "B", "V"};
    private String[] answers = new String[cipher.length];

    // TODO: 22.12.2020

    /**
     * create cipher with randomized colours
     *
     * @param randomizer
     * @return
     */
    private int randomize(String[] randomizer) {
        int length = randomizer.length;
        return 0;
    }

    public String[] game() {
        for (int i = 0; i <= cipher.length - 1; i++) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            answers[i] = answer;
        }
        return answers;
    }

    public void examine(String[] playerAnswer) {
        int place = 0;
        if (playerAnswer[place].equals(cipher[place])) {
            System.out.print("o ");
        } else {
            System.out.print("x ");
        }
    }

    public void start() {
        System.out.println(Arrays.toString(cipher));
    }


    public String[] createCipher() {
        return cipher;
    }

    public int getCipherLength() {
        return cipher.length - 1;
    }
}
