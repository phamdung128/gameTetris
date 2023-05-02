package XepGach;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
 
 
public class Tetris extends JFrame {
	
	
    private JLabel statusbar;
 
    public Tetris() {
         
        initUI();
   }
     
  private void initUI() {
	  	
	   
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();
 
        setSize(400, 600);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   
        setLocationRelativeTo(null);       
   }
 
   public JLabel getStatusBar() {
        
       return statusbar;
   }
 
    public static void main(String[] args) {
 
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
    
                Tetris game = new Tetris();
                game.setVisible(true);
            }
        });                
    } 
}
