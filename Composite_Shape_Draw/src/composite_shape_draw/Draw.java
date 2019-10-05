package composite_shape_draw;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Draw {
	int i;
	public JFrame frame;
	JPanel panel;
	Graphics2D g2d;
	
	
	public Draw() {
		initialize();
	}

	private void initialize() {
		
		int cordinates[][]=new int[4][2];
		
		frame = new JFrame();
		frame.setBounds(11, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(11, 2, 500, 180);
		frame.getContentPane().add(panel);
		
		i=0;
		
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(i<4) {
					cordinates[i][0]=e.getX();
					cordinates[i][1]=e.getY();
					System.out.println("Just Clicked "+e.getX() + "," + e.getY());
					i++;
				}
				else {
					JOptionPane.showMessageDialog(frame,"Max 4 points can be clicked!\n Try Again!");
					i=0;
					
				}
				
				
			}
		});
		
		
		JButton btnNewButton = new JButton("Draw Line");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g2d=(Graphics2D)panel.getGraphics();
				IShape line=new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				line.draw(g2d);
				i=0;
				 
			}
		});
		btnNewButton.setBounds(95, 197, 100, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTriangle = new JButton("Draw Triangle");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Line l1 = new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				Line l2 = new Line(cordinates[1][0],cordinates[1][1],cordinates[2][0],cordinates[2][1]);
				Line l3 = new Line(cordinates[2][0],cordinates[2][1],cordinates[0][0],cordinates[0][1]);
				IShape tri = new Triangle(l1,l2,l3);
				g2d=(Graphics2D)panel.getGraphics();
				tri.draw(g2d);
				i=0;
			}
		});
		btnTriangle.setBounds(200, 227, 100, 23 );
		frame.getContentPane().add(btnTriangle);
		
		JButton btnRectangle = new JButton("Draw Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Line l1 = new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				Line l2 = new Line(cordinates[1][0],cordinates[1][1],cordinates[2][0],cordinates[2][1]);
				Line l3 = new Line(cordinates[2][0],cordinates[2][1],cordinates[3][0],cordinates[3][1]);
				Line l4 = new Line(cordinates[3][0],cordinates[3][1],cordinates[0][0],cordinates[0][1]);
				IShape rec = new Rectangle(l1,l2,l3,l4);
				g2d=(Graphics2D)panel.getGraphics();
				rec.draw(g2d);
				i=0;
				
			}
		});
		btnRectangle.setBounds(200, 197, 100, 23);
		frame.getContentPane().add(btnRectangle);
		
		
		
		JButton btnClear = new JButton("Start Over");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
				i=0;
			}
		});
		btnClear.setBounds(95, 227, 100, 23);
		frame.getContentPane().add(btnClear);
		
	}
}
