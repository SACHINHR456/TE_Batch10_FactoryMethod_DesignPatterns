package com.tyss.dp.factoryMethod;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WindowsButton implements Button {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel lable = new JLabel();
	JButton button;

	@Override
	public void rendering() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lable = new JLabel("HelloWorld");
		lable.setBackground(new Color(230, 245, 125));
		lable.setFont(new Font("Dialog",Font.BOLD, 44));
		lable.setHorizontalAlignment(SwingConstants.CENTER);
		lable.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.getContentPane().add(panel);
		panel.add(lable);
		onClicking();
		panel.add(button);

		frame.setSize(320, 300);
		frame.setVisible(true);
//   System.out.println("rendering the testbutton");
		onClicking();

	}

	@Override
	public void onClicking() {
		button = new JButton("Exit");
		System.out.println("Exit button clicked");
	}

}
