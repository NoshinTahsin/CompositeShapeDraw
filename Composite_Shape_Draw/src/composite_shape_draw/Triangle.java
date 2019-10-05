package composite_shape_draw;
 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Triangle implements IShape{
	ArrayList <Line> lineList=new ArrayList<Line>();
	
	public Triangle(Line a,Line b,Line c) {
		lineList.add(a);
		lineList.add(b);
		lineList.add(c);		
	}
	
	public void draw(Graphics2D g2d) {
		for(IShape line: lineList) {
			line.draw(g2d);
			
		}
	
	}

	
}