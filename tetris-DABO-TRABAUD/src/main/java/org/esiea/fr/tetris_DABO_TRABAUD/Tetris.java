package org.esiea.fr.tetris_DABO_TRABAUD;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


//Informations sur les pièces de Tetris

public class Tetris extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel statusBar;


    public Tetris() {

        statusBar = new JLabel("Score 0");
        add(statusBar, BorderLayout.NORTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);
        setTitle("Tetris Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
    
    public JLabel getstatusBar() {
        return statusBar;
    }

     public static void main(String[] args) {

         Tetris game = new Tetris();
         game.setLocationRelativeTo(null);
         game.setVisible(true);

     } 
 }