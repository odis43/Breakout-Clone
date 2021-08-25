import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;	//to set random Ufo locations
import java.awt.event.ActionEvent;      //for timer
import java.awt.event.ActionListener;   //for timer
import java.util.ArrayList;	//because we have an ArrayList of Ufos
import javax.swing.JPanel;
import javax.swing.Timer;
																								//timer import
public class GameFrame extends JPanel implements ActionListener {
	Timer mainTimer;
	
	 static  Ball ball;
	public Timer timer;
	    static Platform platform;
	   Random rand = new Random();     //seed the random generator
	  static ArrayList<Brick> bricks = new ArrayList<Brick>();
	  static ArrayList<Brickrowtwo> brickstwo=new ArrayList<Brickrowtwo>();
	  static ArrayList<Brickrowthree> bricksthree=new ArrayList<Brickrowthree>();
	  Background back= new Background (0,0);																							//set up ufo group – empty but ready
	 
	public GameFrame(){
				
			
	        setFocusable(true);
	        ball = new Ball(650,350);
	        platform=new Platform(650,600);
	        mainTimer = new Timer(10,this);     //sets Timer object to 10 milliseconds
	        mainTimer.start();                  //to start the timer
	        setBricks();   
	        addKeyListener(new Keycontrol(platform)); //calls the method below for setting up the ufos randomly
	}

	public void setBricks() {
	for(int i=0;i<9;i++){
		
			bricks.add(new Brick(i*150,i));
		}
for (int i=0;i<9;i++) {
	brickstwo.add(new Brickrowtwo(i*150,i+90));
		
	}

for (int i=0;i<9;i++) {
	bricksthree.add(new Brickrowthree (i*150,i+180));
}


	
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent arg0){  //this method nec'y for timers
	        ball.update();     
	        platform.update();
	        checkEnd();
	        repaint();
	    }
	public void checkEnd() {
	if (bricks.size()==0&&  brickstwo.size()==0&&bricksthree.size()==0){
		
	}
	

	}
	public void paint(Graphics g){	//this method paints everything onto the screen
	        super.paint(g);
	        Graphics2D g2d  = (Graphics2D) g;  //cast g as Graphics2d 
	              //type for powerful graphics, and sets g2d as the reference.
	        g.setColor(Color.white);
		      
		       back.draw(g2d);
	        ball.draw(g2d);
	       
	        g.setColor(Color.white);
	        g.setFont(new Font (null, Font.BOLD, 20));
		      g.drawString("Use the arrow keys LEFT and RIGHT to move the platform!", 0,635);
		    
		       g.setFont(new Font (null, Font.BOLD, 20));
		     
	        	platform.draw(g2d);
	        	if (bricks.size()==0&&  brickstwo.size()==0&&bricksthree.size()==0){
	        		 g.setColor(Color.white);
	        		 g.setFont(new Font (null, Font.BOLD, 70));
	 	        	g.drawString("GOOD GAME!", 450,450);

	 		      

	  		    
	        		
	        	}
	        for (int i=0;i<bricks.size();i++){    //draw the ArrayList of ufos (which is
	            Brick tempBrick = bricks.get(i);   //changing in size as we go)
	            tempBrick.draw(g2d);
	        }
	        
	        for (int i=0;i<brickstwo.size();i++){    //draw the ArrayList of ufos (which is
	            Brickrowtwo tempBricktwo = brickstwo.get(i);   //changing in size as we go)
	            tempBricktwo.draw(g2d);
	        }
	        for (int i=0;i<bricksthree.size();i++){    //draw the ArrayList of ufos (which is
	            Brickrowthree tempBrickthree = bricksthree.get(i);   //changing in size as we go)
	           tempBrickthree.draw(g2d);
	        }
	        
	}
	
	
		
	public static ArrayList<Brick> getBrickList(){	
	       return bricks;	
	}
	
	public static ArrayList<Brickrowtwo> getBrickrowtwoList(){	
	       return brickstwo;	
	}
	
	public static ArrayList<Brickrowthree> getBrickrowthreeList(){	
	       return bricksthree;	
	}
	
	
	
	public static void removeBrick(Brick u){	
		
																//the ArrayList remove command is 
	       bricks.remove(u);									// from the Java Summary
	}

	public static void removeBrick(Brickrowtwo utemp) {
		brickstwo.remove(utemp);
		
	}

	public static Platform getPlatform() {
		return platform;
	}

	public static void removeBrick(Brickrowthree utemp) {
		bricksthree.remove(utemp);
		
	}
	
	
	


	}

	
	
	


