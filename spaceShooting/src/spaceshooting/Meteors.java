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
public class Meteors {
    
    public int y,x;
    
   Point makan=new Point();
   
    public int speedy;
    
    public Meteors(int y,int x,int speedy)
    {  
        this.makan.x=x;
        this.makan.y=y;
        
       this.x=x;
       
       this.y=y;
       
       this.speedy=speedy;
     
    }
    
    void movedown()
    {
        y+=speedy;
        
        
    }
   
}
