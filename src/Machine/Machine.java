package Machine;

import Player.Player;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Machine {
    private String[] cipher = new String[]{"W", "G"};
    String[] colours = new String[]{"W", "G", "O", "R", "B", "V"};
    //private String[] answers = new String[cipher.length];
    private String[] answers = new String[]{"R", "O"};

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
            answers[i] = answer.toUpperCase(Locale.ROOT);
        }
        return answers;
    }

    private boolean check(String[] playerAnswer, int playerSocket, int cipherSocket) {
        boolean result = false;
        //game();
        if (playerAnswer[playerSocket].equals(cipher[cipherSocket])) {
            result = true;
        } else if (!playerAnswer[playerSocket].equals(cipher[cipherSocket])){
            result = false;
        }
        return result;
    }

    public void examine() {
        int socket = 0;
        int checkSocket = 0;
        for (int i = 1; i <= getCipherLength(); i++) {
            if (check(answers, socket, socket)) {
                System.out.print("o ");
                socket++;
            } else {
                for (int j = 0; j <= getCipherLength() - 1; j++) {
                    if (!check(answers, socket, checkSocket)) {
                        checkSocket++;
                        if (checkSocket > j){
                            break;
                        }
                    }
                }
                if (check(answers, socket, checkSocket)){
                    checkSocket = 0;
                    System.out.print("x ");
                } else {
                    checkSocket = 0;
                    System.out.print("_ ");
                }
            }
        }
    }

    public int getCipherLength() {
        return cipher.length;
    }
}
