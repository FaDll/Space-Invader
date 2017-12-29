/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooting;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ali
 */
public class MovingAliens extends JPanel implements Runnable {
    
    public ArrayList<Meteors> nayzak=new  ArrayList<Meteors>();
   
    public ArrayList<Aliens> fada2y=new  ArrayList<Aliens>();
    
     public ArrayList<Aliens> fada2y2=new  ArrayList<Aliens>();
     
      boolean bosso=false;
      
      int counter2=0;
    //public BOSS wa7sh=new BOSS(300,300,3);
   
    
    public int HP=90;
    
    public Aliens wa7sh=new Aliens(1000,1000,3);
    
    public Aliens BossBullet=new Aliens(0,0,3);
    
   // public Meteors bossattack=new Meteors(wa7sh.y,wa7sh.x,2);
            
    public spaceShip safina=new spaceShip("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\space ship.png");
    
    
    public  BufferedImage bulletimg1; 
    
    JLabel lbl1=new JLabel();
    JLabel lbl2=new JLabel();
    
    int counter;
    
     public MovingAliens() 
    {
       setSize(600,600);
         
       lbl1.setText("HP:"+" "+ String.valueOf(HP));
       
       lbl2.setText("S C O R E" +String.valueOf(counter));
       
        lbl2.setBounds(200, 300, 200, 200); 
       
       //lbl1.setBackground(Color.GREEN);
       
       lbl2.setFont(new Font("Courier", Font.BOLD,75));
     
     lbl1.setBounds(200, 100, 200, 200);
     
     lbl1.setFont(new Font("Courier",Font.HANGING_BASELINE,75));
     
    
     safina.position.x=220;
     safina.position.y=700;
       // add(lbl1);
        add(lbl2);
        
       // add(lbl1);
        
        
       
        
        this.addKeyListener(new keylist());
        
    }

       private class keylist implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {
           
        }

        @Override
        public void keyPressed(KeyEvent e) {
         
            
            
            if (e.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                
                safina.moveRight();
                
            }
            if (e.getKeyCode()==KeyEvent.VK_LEFT)
            {
                
                safina.moveLeft();
                
            }
            if (e.getKeyCode()==KeyEvent.VK_SPACE)
            {
                if(counter>=40)
                {
               
                 safina.fireBullet2();
                 
                 System.out.println("entered");
                }
                else
                    safina.fireBullet();
                
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }
    }
     
       
       
    public void  paintComponent(Graphics g)
    {
        
        g.clearRect(0, 0, 600, 600);
        
        try
        {
     
            
        BufferedImage IT = ImageIO.read(new File("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\invader.png"));
        BufferedImage bg = ImageIO.read(new File("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\backgroundooo.png"));    
        BufferedImage spaceimg = ImageIO.read(new File(safina.Image));
        BufferedImage bulletimg = ImageIO.read(new File(safina.shot.ImagePath));
        
      //  BufferedImage bulletimg1 = ImageIO.read(new File(safina.shot.ImagePath));//habd
      
        BufferedImage MT = ImageIO.read(new File("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\Meteor1.png"));
        
        BufferedImage BOSS = ImageIO.read(new File("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\BOSSSS.png"));
        
        BufferedImage IT2 = ImageIO.read(new File("C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\invader.png"));
        
        g.drawImage(bg,0,0,null);
        g.drawImage(spaceimg,safina.position.x, safina.position.y,null);
        g.drawImage(bulletimg,safina.shot.position.x, safina.shot.position.y,null);
        
        if(fada2y.size()==0)
         {
            
           //remove(lbl2);
             
          if(bosso==false) 
          {
              wa7sh.x=200;
              wa7sh.y=300;
              
          }
          
            bosso=true;
            
            
            add(lbl1);
            
            lbl1.setText("HP:"+" "+ String.valueOf(HP));
             
            g.drawImage(BOSS,wa7sh.x, wa7sh.y,null); 
            
           
            
           
            
            wa7sh.move(this.getWidth());
            
             g.drawImage(IT2, BossBullet.pos.x, BossBullet.pos.y, null);
            
          
          }
        
        
        if(counter>=40)
        {
            
          g.drawImage(bulletimg,safina.shot2.position.x+10, safina.shot.position.y,null);
        
        }
        
         for(Meteors eg: nayzak)
        {
            g.drawImage(MT,eg.x,eg.y, null);
        }
         
        for(Aliens aalien: fada2y)
            
        {
            
            g.drawImage(IT, aalien.x, aalien.y, null);
            
        }
       
        
        }
        
        catch (IOException e)
        {
            System.out.println(e);
        }
        
        
        
        for (Aliens alien: fada2y)
        
        {
         
            if (safina.shot.position.distance(alien.x, alien.y)<=50)
            {
             
              counter=counter+10;
//              
//              if(counter>=40)
//              {
//                  try {
//                      bulletimg1 = ImageIO.read(new File(safina.shot.ImagePath));
//                  } catch (IOException ex) {
//                      Logger.getLogger(MovingAliens.class.getName()).log(Level.SEVERE, null, ex);
//                  }
//                   g.drawImage(bulletimg1,safina.shot2.position.x+10, safina.shot2.position.y,null);
//                   
//              }
              
              
              lbl2.setText(String.valueOf(counter));
              safina.shot.position.x=-10;
              safina.shot.position.y=-10;
              
              safina.shot2.position.x=-10;
              safina.shot2.position.y=-10;

              
              
              
            
             repaint();
                fada2y.remove(alien);
                
                break;
                
            }
            
            
        }
        
        if(safina.shot.position.distance(wa7sh.x,wa7sh.y)<=100)
       {      
             HP=HP-10;
             
              safina.shot.position.x=-10;
              safina.shot.position.y=-10;
              
              safina.shot2.position.x=-10;
              safina.shot2.position.y=-10;
             
             
            if(HP==0)
            {
                
             safina.shot.position.x=-10;
              safina.shot.position.y=-10;
              
              safina.shot2.position.x=-10;
              safina.shot2.position.y=-10;
              
                wa7sh.x=-1000;
                
                
              //  wa7sh.y=-10;
                
                repaint();
                
                JOptionPane.showMessageDialog(null,"You Won!!. ", "Victory :D.",JOptionPane.ERROR_MESSAGE); 
                             
            }
            
            
          
        } 
     
        if(BossBullet.pos.distance(safina.position.x,safina.position.y)<=100)        
            
        { 
             
           safina.position.x=-1000;
            wa7sh.x=-1000;
            
             repaint();          
           JOptionPane.showMessageDialog(null,"You lost. ", " Game Over.",JOptionPane.ERROR_MESSAGE); 
            

           System.exit(0); 
           
        }   
        
        
        
//       for(int i=0;i<nayzak.size();i++)
//       {
//        if(nayzak.get(i).makan.distance(safina.position.x,safina.position.y)<=100)        
//            
//        { 
//             
//           safina.position.x=-1000;
//           // wa7sh.x=-1000;
//            
//           repaint();          
//           JOptionPane.showMessageDialog(null,"You lost. ", " Game Over.",JOptionPane.ERROR_MESSAGE); 
//            
//
//           System.exit(0);   
//        }   
//       }
    }   
     
    @Override
    public void run() {
       
        while(true)
        {
            
            for(Meteors meteor:nayzak)
        {
            
             meteor.movedown();
            
        }
            
          for (Aliens alien: fada2y)
              
        {    
                                                       
              alien.move(this.getWidth());         
              
        }  


            if(bosso)
           {
              counter2++;
           }
            if(counter2 >=200)                
             {
                 
                 
                    BossBullet.pos.x=wa7sh.x;
                    BossBullet.pos.y=wa7sh.y;
                    counter2=0;
                    
             }
     
            BossBullet.movedown2(3);

         
           
            try {
                
                Thread.sleep(10);
                
                repaint();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovingAliens.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }
    
}
