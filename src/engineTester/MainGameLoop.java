package engineTester;

import org.lwjgl.opengl.Display;

import me.flyingdojo.renderEngine.DisplayManager;

public class MainGameLoop {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		while (!Display.isCloseRequested()) {
			// TODO: Game Logic
			
			// TODO: Render
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}

}
