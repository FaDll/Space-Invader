package spaceshooting;


import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class spaceShip  {
    public Point position=new Point();
    public String Image;
    public Bullet shot=new Bullet();
    public Bullet shot2=new Bullet();
    public int speed;
    
    public spaceShip(String imagepath)
    {
        
        speed=5;
        this.Image=imagepath;
        shot.ImagePath="C:\\Users\\Ali\\Documents\\NetBeansProjects\\spaceShooting\\pics\\bullet.png";
        
    }
    
    void moveRight()
    {
        this.position.x+=speed;
        
    }
    
    void moveLeft()
    {
        this.position.x-=speed;
        
    }
    
    
    public void fireBullet()
    {
        
        shot.position.x=this.position.x+60;
        shot.position.y=this.position.y;
        
        Thread thread1=new Thread(shot);       
        thread1.start();
 
        
    }
    
    public void fireBullet2()
    {
        
        shot.position.x=this.position.x+60;
        shot.position.y=this.position.y;
        
        shot2.position.x=this.position.x+80;
        shot2.position.y=this.position.y;
        
        Thread thread2=new Thread(shot);
        Thread thread1=new Thread(shot2); 
       
        
        thread1.start();
        thread2.start();
        
    }
    
}
