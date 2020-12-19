package Player;

import Machine.Machine;

import java.util.Scanner;

public class Player {
    Machine machine = new Machine();
    int codeLength = machine.getCipherLength();
    String[] answers = new String[codeLength];

    public void game(){
        for (int i = 1; i <= codeLength; i++){
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            answers[i] = answer;
        }
    }
}
