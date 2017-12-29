/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooting;

/**
 *
 * @author Ali
 */
public class BOSS {
    
     public int x,y;
     
    public int speedx;
    
    
    
    
    public BOSS(int x,int y,int speedx)
    {
     
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
    
}
