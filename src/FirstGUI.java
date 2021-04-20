import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstGUI implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent f) {
		count++;
		label.setText("Number of clicks: " + count);
		
	}
	
	int count = 0;
	JLabel label;
	JFrame frame1;
	JButton button;
	JPanel panel1;
	
	public FirstGUI() {
		
		frame1 = new JFrame();
		
		button = new JButton("Click ME");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: ");
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel1.setLayout(new GridLayout(0,1));
		panel1.add(button);
		panel1.add(label);
		
		frame1.add(panel1, BorderLayout.CENTER);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setTitle("Our GUI");
		frame1.pack();
		frame1.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new FirstGUI();

	}	
}
