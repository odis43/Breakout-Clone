import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Platform extends Entity {
int speed=10;
private int moveX;
private int moveY;
Rectangle bruh;
Ball v=new Ball(x, y);
private boolean [] keys;
	public Platform(int x, int y) {
		super(x, y);
	
	    bruh=v.getBounds();
	    
        keys = new boolean [120];
    		
    
	}


	public void update() {
		
		
		if (keys[KeyEvent.VK_LEFT] == true) {
			x-=speed;
		}
		else if (keys[KeyEvent.VK_RIGHT] == true) {
			x+=speed;
		}
		checkCollision();
	}
	
	public void checkCollision() {
		if (x+getPlatformImg().getWidth(null) >1360){ 	
            x-=10;				
		}
		if (x+getPlatformImg().getWidth(null) <270){ 	
           x+=10;				
		}
		
		
		if(getBounds().intersects(bruh)) {
         	moveY*=-1;
         	
		}
        	
		
		
	}
	
	public  Rectangle getBounds() {
        return new Rectangle(x,y,getPlatformImg().getWidth(null),getPlatformImg().getHeight(null));
     

     
	}
	
	public void draw(Graphics2D g2d) {
        g2d.drawImage(getPlatformImg(),x,y,null);
		
	}
	
	public Image getPlatformImg() {
		ImageIcon ic=new ImageIcon("F://minecraft.png");
		return ic.getImage();
	}

	

	
		

	
	

	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		if (x+getPlatformImg().getWidth(null) >=1360){ 	
          			
		}
		if (x+getPlatformImg().getWidth(null) <=200){ 	
           				
		}
		if(key==KeyEvent.VK_LEFT) {
			keys[key] = true;
		}
		
		if(key==KeyEvent. VK_RIGHT) {
			keys[key] = true;
		}
			
		}


	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_LEFT) {
			keys[key] = false;
		}
		
		if(key==KeyEvent. VK_RIGHT) {
			keys[key] = false;
		}
		
	}
		
	}


