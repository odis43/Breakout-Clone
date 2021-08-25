import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Background extends Entity {

	public Background(int x, int y) {
		super(x, y);
		
	}
	
	public Image getBackgroundImg() {
		ImageIcon ic=new ImageIcon("F:\\atari.jpg");
		return ic.getImage();
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getBackgroundImg(),x, y,1360,680,null);
	}
	
	public void update() {
		
	}

}
