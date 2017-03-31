package com.calculator;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Distance_Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel;
	JButton submit;
	JTextField lat1, lat2, long1, long2, distance;

	public Distance_Calculator() {
		super("Geo Distance Calculator");
		init();
	}

	private void init() {
		panel = new JPanel();
		submit = new JButton("Submit");
		JLabel head, src, dest, lt1, lt2, lg1, lg2, dist;
		head = new JLabel("Distance Calculator");
		src = new JLabel("Source");
		dest = new JLabel("Destination");
		lt1 = new JLabel("Latitute:");
		lt2 = new JLabel("Latitute");
		lg1 = new JLabel("Longitude");
		lg2 = new JLabel("Longitude");
		dist = new JLabel("Distance");
		lat1 = new JTextField(10);
		lat2 = new JTextField(10);
		long1 = new JTextField(10);
		long2 = new JTextField(10);
		distance=new JTextField(10);
		panel.setLayout(new GridLayout(7, 2));
		panel.add(head);
		panel.add(src);
		panel.add(lt1);
		panel.add(lat1);
		panel.add(lg1);
		panel.add(long1);
		panel.add(dest);
		panel.add(lt2);
		panel.add(lat2);
		panel.add(lg2);
		panel.add(long2);
		panel.add(dist);
		panel.add(submit);
		panel.add(distance);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setSize(400,600);
	}

	public static void main(String[] args) {
		Distance_Calculator dist=new Distance_Calculator();

	}

}
