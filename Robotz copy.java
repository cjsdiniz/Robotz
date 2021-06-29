// Robotz.java
// A First java program

import java.awt.*;
import java.awt.event.*;

public class Robotz // extends Applet
{
	// public void init() {
	public static void main() {
		// add(new Robot(Color.blue));
		// add(new Robot(Color.red));
		// add(new Robot(Color.green));
		Robot blue = new Robot(Color.blue);
		Robot red = new Robot(Color.red);
		Robot green = new Robot(Color.green);
		blue.setVisible(true);
		red.setVisible(true);
		green.setVisible(true);
	}
}

class Robot extends Canvas implements MouseMotionListener {
	private Color myColor;
	private Point myLocation;

	public Robot(Color theColor) {
		setMyColor(theColor);
		setSize(50, 50);
		setBackground(theColor);
		addMouseMotionListener(this);
	}

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public void mouseMoved(MouseEvent evt) {
		myLocation = getLocation();
		int dx = evt.getX(), dy = evt.getY();
		if (dx > 25)
			dx = dx - 50;
		if (dy > 25)
			dy = dy - 50;
		setLocation(myLocation.x + dx, myLocation.y + dy);
	}

	public void mouseDragged(MouseEvent evt) {
		myLocation = getLocation();
		setLocation(myLocation.x + (evt.getX() - 25), myLocation.y + (evt.getY() - 25));
	}

	public void paint(Graphics g) {
		g.drawLine(10, 40, 40, 40);
		g.drawRect(15, 5, 5, 15);
		g.drawRect(30, 5, 5, 15);
	}
}
