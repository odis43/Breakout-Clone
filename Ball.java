import java.awt.Graphics2D;
	import java.awt.event.KeyEvent;
	import java.awt.Image;
	import java.awt.Rectangle;
	import java.awt.event.KeyEvent;
	import java.util.ArrayList;

	import javax.swing.ImageIcon;


	
	
	public class Ball extends Entity {
		
		
		private int moveX;
		private int moveY;
		
	
		public Ball(int x, int y) {
			super(x,y);
			
			
			 moveX=6;
			 moveY= 7;
		}
		
		public void update() {
			
			
			x+=moveX;
			y+=moveY;
			checkCollision();
		}
		
		public void checkCollision() {
			
			Platform platform=GameFrame.getPlatform();
			if(getBounds().intersects(platform.getBounds())) {
				moveY*=-1;
				
				y-=6;
			}
			
			
			
			if (x+getBallImg().getWidth(null) >1350){ 	
	            moveX*=-1;				
			}
			if (x+getBallImg().getWidth(null) <40){ 	
	            moveX*=-1;				
			}
			if (y+getBallImg().getHeight(null) >680){ 	
					System.exit(0);;
			}
			if (y+getBallImg().getHeight(null) <0){ 	
	         		moveY*=-1;	
			}
			
			
			
	            ArrayList<Brick>bricks=GameFrame.getBrickList();
	            ArrayList<Brickrowtwo>brickstwo=GameFrame.getBrickrowtwoList();
	            ArrayList<Brickrowthree>bricksthree=GameFrame.getBrickrowthreeList();
	            
	           
	            
	            for (int i=0;i<bricks.size();i++) {
	            	Brick utemp=bricks.get(i);
	            	if(getBounds().intersects(utemp.getBounds())) {
	            	GameFrame.removeBrick(utemp);
	            	
	            		moveY*=-1;
	            	}
	            	}
	            for (int i=0;i<brickstwo.size();i++) {
		   	         Brickrowtwo utemp=brickstwo.get(i);
		   	         if(getBounds().intersects(utemp.getBounds())) {
		   	         	GameFrame.removeBrick(utemp);
		   	        		moveY*=-1;
		   	            	}
		            	}
	            
	            for (int i=0;i<bricksthree.size();i++) {
		   	         Brickrowthree utemp=bricksthree.get(i);
		   	         if(getBounds().intersects(utemp.getBounds())) {
		   	         	GameFrame.removeBrick(utemp);
		   	        		moveY*=-1;
		   	            	}
		            	}
	            
	           
		            }
		
		


			
		
		
		public  Rectangle getBounds() {
	        return new Rectangle(x,y,getBallImg().getWidth(null),getBallImg().getHeight(null));
		}
		public void draw(Graphics2D g2d) {
	        g2d.drawImage(getBallImg(),x,y,null);
			
		}
		
		public Image getBallImg() {
			ImageIcon ic=new ImageIcon("F:\\ballrez.png");
			return ic.getImage();
		}

	

		

		
	
		

		
		

	
	
	
	
	
	

	}
	

