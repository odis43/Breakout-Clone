import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Brickrowtwo extends Entity{

	public Brickrowtwo(int x, int y) {
		super(x, y);
		
	}
	
	public void update(){	
	}
	public void draw(Graphics2D g2d){
	       g2d.drawImage(getBrickImg(),x,y,null);
	   }
	public Image getBrickImg(){
	   ImageIcon ic=new ImageIcon("F://bricktwo.png");
	   return ic.getImage();
	  }
	public Rectangle getBounds(){
	       return new Rectangle(x,y,getBrickImg().getWidth(null),getBrickImg().getHeight(null));
	}
	
	
	
	
	
	

}
