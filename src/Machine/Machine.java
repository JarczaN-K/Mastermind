package Machine;

import java.util.*;

public class Machine {
    private final String[] cipher = new String[4];
    private final String[] answers = new String[cipher.length];

    private void randomize(String[] randomizer) {
        Random r = new Random();
        Set<Integer> set = new HashSet<>(4);
        int i = 0;
        do {
            set.add(r.nextInt(8));
        } while (set.size() != 4);

        for (Integer socket : set) {
            switch (socket) {
                case 0 -> {
                    randomizer[i] = "W";
                    ++i;
                }
                case 1 -> {
                    randomizer[i] = "G";
                    ++i;
                }
                case 2 -> {
                    randomizer[i] = "O";
                    ++i;
                }
                case 3 -> {
                    randomizer[i] = "R";
                    ++i;
                }
                case 4 -> {
                    randomizer[i] = "B";
                    ++i;
                }
                case 5 -> {
                    randomizer[i] = "V";
                    ++i;
                }
                case 6 -> {
                    randomizer[i] = "P";
                    ++i;
                }
                case 7 -> {
                    randomizer[i] = "Y";
                    ++i;
                }
            }
        }

    }

    public void chances() {
        int maxChance = 10;
        randomize(cipher);
        for (int i = 0; i <= maxChance; i++) {
            if (i != maxChance) {
                examine();
                if (correctAnswer()) {
                    break;
                }
                System.out.println();
            } else {
                System.out.println("END OF CHANCES");
                System.out.println("CORRECT ANSWER: " + Arrays.toString(cipher));
                break;
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

    private boolean correctAnswer() {
        boolean result = false;
        if (answers[0].equals(cipher[0]) && answers[1].equals(cipher[1]) && answers[2].equals(cipher[2]) && answers[3].equals(cipher[3])) {
            System.out.println();
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

}
