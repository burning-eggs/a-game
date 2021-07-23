package me.flyingdojo.renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	private static final String BUILD_VER = "0.0.0.1";

	public static void createDisplay() {
		ContextAttribs attribs = new ContextAttribs(3,2);
		attribs.withForwardCompatible(true);
		attribs.withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT)); // Set display width and height
			Display.create(new PixelFormat(), attribs); // Create OpenGL Context
			
			Display.setTitle("a-game build " + BUILD_VER);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
	}

	public static void updateDisplay() {
		Display.sync(FPS_CAP); // Sync the display
		Display.update(); // Update the display
	}

	public static void closeDisplay() {
		Display.destroy(); // Destroy the display
	}
}
