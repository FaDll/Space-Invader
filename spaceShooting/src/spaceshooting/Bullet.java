/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package spaceshooting;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class Bullet implements Runnable {
    
    public Point position=new Point();
    public int speed;
    public String ImagePath;
    

public Bullet()
{
    
    speed=7;
    
}



public void moveup()
{
    
    this.position.y-=speed;
    
}
public void movedown()
{
    
    this.position.y+=speed;
    
}
public void fire(int x, int y)
{
    
    position.x=x;
    
    position.y=y;
    
}

    @Override
    public void run() {
        
        
        System.out.println("fired");
while(true)
{//        {
          moveup();
           
        try{
            
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Bullet.class.getName()).log(Level.SEVERE, null, ex);
        }

        
//        } 
  }
    
  }  
    

 
    
   
}

