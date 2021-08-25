import javax.swing.JFrame;																	//Harmit Goswami and Oditha Amarasinghe 

public class Client {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame =new JFrame("BreakoutGame");
		frame.setSize(1360,680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new GameFrame());
		frame.setVisible(true);
		frame.repaint();
		
		

	}

}
