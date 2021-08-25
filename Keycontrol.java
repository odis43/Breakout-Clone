import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Keycontrol extends KeyAdapter {

Platform b;
	
	public Keycontrol(Platform platform) {
		b=platform;
	}
	
	public void keyPressed (KeyEvent e) {
	b.keyPressed(e);	
	}
	
	public void keyReleased (KeyEvent e) {
		b.keyReleased(e);
	}
	
	
}
