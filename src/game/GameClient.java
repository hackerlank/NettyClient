package game;

import game.net.Framework;
import game.util.Spring;

public class GameClient {
	

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				Framework framework = new Framework();
				try {
					framework.connect(8081, "127.0.0.1");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.start();	
		
		Spring.uiService.start(Spring.uiLogin);
	}
	
	
	
}
