package composite_shape_draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Line extends JFrame implements IShape {
	int x1,y1,x2,y2;
	
	public Line(int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.green);
		g2d.drawLine(x1, y1, x2, y2);
		System.out.println("Drawing a line between points"+"("+x1+","+y1+") and "+"("+x2+","+y2+")");
		
	}	
}
