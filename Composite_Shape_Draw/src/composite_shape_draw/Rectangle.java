package composite_shape_draw;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Rectangle implements IShape{
	ArrayList <Line> lineList=new ArrayList<Line>();
	
	public Rectangle(Line a,Line b,Line c,Line d) {
		lineList.add(a);
		lineList.add(b);
		lineList.add(c);
		lineList.add(d);
	}
	
	public void draw(Graphics2D g2d) {
		for(IShape line: lineList) {
			line.draw(g2d);
			
		}
	
	}

}