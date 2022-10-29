package weightedGradesWithGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	JTextField totalPoints = new JTextField(20);
	JTextField earnedPoints = new JTextField(20);
	JTextField percentage = new JTextField(20);
	JTextField weightedPoints = new JTextField(20);
	
	public MyFrame(String title) {
		
		super(title);
		
		// set up the container (panel)
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(null);
				
		// Total Assignment Points
		JLabel label1 = new JLabel("Total Assignment Points");
		label1.setForeground(Color.blue);
		panel.add(label1);
		label1.setBounds(0, 0, 175, 30);
		
		totalPoints.setForeground(Color.blue);
		panel.add(totalPoints);
		totalPoints.setBounds(0, 35, 175, 30);
		
		// Earned Points
		JLabel label2 = new JLabel("Earned Points");
		label2.setForeground(Color.blue);
		panel.add(label2);
		label2.setBounds(200,0,175,30);
		
		earnedPoints.setForeground(Color.blue);
		panel.add(earnedPoints);
		earnedPoints.setBounds(200, 35, 175, 30);
		
		// Percentage of Class
		JLabel label3 = new JLabel("Percentage of Class");
		label3.setForeground(Color.blue);
		panel.add(label3);
		label3.setBounds(0, 90, 175, 30);
		
		percentage.setForeground(Color.blue);
		panel.add(percentage);
		percentage.setBounds(0, 125, 175, 30);
		
		// button
		JButton button = new JButton("Click to calculate Score");
		
		button.setForeground(Color.blue);
		button.setOpaque(true);
		button.setBackground(new Color(255, 0, 0));
		panel.add(button);
		button.setBounds(150, 180, 200, 30);
		
		// Weighted Score
		JLabel label4 = new JLabel("Weighted Score");
		label4.setForeground(Color.blue);
		panel.add(label4);
		label4.setBounds(150, 215, 200, 30);
		
		weightedPoints.setForeground(Color.blue);
		panel.add(weightedPoints);
		weightedPoints.setBounds(150, 250, 200, 30);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
			
		});
	}
	
	// use to run weightedGrades
	public void calculate() {
		int total = Integer.parseInt(totalPoints.getText());
		int earned = Integer.parseInt(earnedPoints.getText());
		int perc = Integer.parseInt(percentage.getText());
		weightedGrades weightedgrades;
		weightedgrades = new weightedGrades(total, earned, perc);
		weightedPoints.setText(String.format("%.3f",weightedgrades.gettotalWeightedGrades()));
	}
			
}
