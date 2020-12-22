package com.company;

import Machine.Machine;
import Player.Player;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        Machine machine = new Machine();
        machine.examine(machine.game());


    }
}
