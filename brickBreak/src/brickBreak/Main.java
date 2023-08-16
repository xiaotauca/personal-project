package brickBreak;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame board = new JFrame();
        Game gameplay = new Game();
        board.setBounds(12, 12, 800, 600);
        board.setTitle("Break the Bricks!");
        board.setResizable(false);
        board.setVisible(true);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board.add(gameplay);
    }
}
