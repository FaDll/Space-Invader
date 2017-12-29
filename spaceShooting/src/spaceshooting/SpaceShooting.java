/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooting;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Ali
 */
public class SpaceShooting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JFrame frame=new JFrame();
        frame.setSize(600,900);
        
       MovingAliens game=new MovingAliens();
       
       game.fada2y.add(new Aliens(100,100,5));
       game.fada2y.add(new Aliens(100,200,5));
       game.fada2y.add(new Aliens(100,300,5));
       game.fada2y.add(new Aliens(100,400,5));
       
       game.fada2y.add(new Aliens(200,100,5));
       game.fada2y.add(new Aliens(200,200,5));
       game.fada2y.add(new Aliens(200,300,5));
       game.fada2y.add(new Aliens(200,400,5));
       game.fada2y.add(new Aliens(300,100,5));
       game.fada2y.add(new Aliens(300,200,5));
       game.fada2y.add(new Aliens(300,300,5));
       game.fada2y.add(new Aliens(300,400,5));
      
//       game.nayzak.add(new Meteors(0,100,1));
//       game.nayzak.add(new Meteors(0,300,1));
//       game.nayzak.add(new Meteors(0,500,1));
       
       //game.fada2y2.add(new Aliens(400,400,3));
       
       frame.add(game,BorderLayout.CENTER);
       game.setFocusable(true);
       Thread t1=new Thread(game);
       t1.start();
       frame.setDefaultCloseOperation(3);
       frame.setVisible(true);
       
       
       
       
    }
    
}
