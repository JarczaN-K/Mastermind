package Machine;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Machine {
    private String[] cipher = new String[]{"W", "G", "O", "R"};
    String[] colours = new String[]{"W", "G", "O", "R", "B", "V"};
    private String[] answers = new String[cipher.length];
    //private String[] answers = new String[]{"W", "R", "O", "V"};

    // TODO: 22.12.2020

    /**
     * create cipher with randomized colours
     */
    private int randomize(String[] randomizer) {
        int length = randomizer.length;
        return 0;
    }

    public void chances() {
        int maxChance = 5;
        for (int i = 0; i <= maxChance; i++) {
            if (i != maxChance) {
                examine();
                if (correctAnswer()){
                    break;
                }
                System.out.println();
            }
        }
    }

    private void playerCipher() {
        for (int i = 0; i <= cipher.length - 1; i++) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            answers[i] = answer.toUpperCase(Locale.ROOT);
        }
    }

    private boolean check(String[] playerAnswer, int playerSocket, int cipherSocket) {
        boolean result = false;
        if (playerAnswer[playerSocket].equals(cipher[cipherSocket])) {
            result = true;
        }
        return result;
    }

    private boolean correctAnswer(){
        boolean result = false;
        if (answers[0].equals(cipher[0]) && answers[1].equals(cipher[1]) && answers[2].equals(cipher[2]) && answers[3].equals(cipher[3])){
            System.out.print("CORRECT! ");
            result = true;
        }
        return result;
    }

    private void examine() {
        playerCipher();
        for (int i = 0; i <= cipher.length - 1; i++) {
            if (check(answers, i, i)) {
                System.out.print("o ");
            } else {
                for (int j = 0; j <= cipher.length - 1; j++) {
                    if (check(answers, i, j)) {
                        System.out.print("x ");
                        break;
                    } else if (!check(answers, i, j) && j == (cipher.length - 1)) {
                        System.out.print("_ ");
                        break;
                    }
                }
            }

        }
        System.out.print(Arrays.toString(answers));
    }

    public int getCipherLength() {
        return cipher.length;
    }
}
