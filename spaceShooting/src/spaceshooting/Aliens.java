/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooting;

import java.awt.Point;

/**
 *
 * @author Ali
 */
public class Aliens {
    
    
    public int x,y;
    public int speedx;
    
    Point pos=new Point();
  // public String img;
   
    public Aliens(int x,int y,int speedx)
    {
        
        this.pos.x=x;
        this.pos.y=y;
        
        this.x=x;
        this.y=y;
        this.speedx=speedx;
             
        
    }
    
    
     public  void move(int width)
    {
        x+=speedx;
        
        if (x+50>width)
        {
            speedx=-speedx;
        }
        if (x<0)
        {
            speedx= -speedx;
        }
    }
     
      void movedown2(int speedy)
    {
        
        this.pos.y+=speedy;
        
        
    }
    
}
