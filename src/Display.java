import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JFrame implements ActionListener{
	JLabel label10=new JLabel("");
	JLabel label20=new JLabel("");
	JLabel label40=new JLabel("");
	JLabel label80=new JLabel("");
	JLabel label160=new JLabel("");


	public Display() {
		init();
	}

	public void init() {
		
		JFrame mainFrame;
		
		mainFrame = new JFrame("Monte Carlo Assignment");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		mainFrame.add(panel);
		
		//panel.setBackground(Color.darkGray);
		panel.setSize(300, 300);
		GridLayout layout = new GridLayout(2,5, -1, -1);
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);
		panel.add(new JLabel("10"));
		panel.add(new JLabel("20"));
		panel.add(new JLabel("40"));
		panel.add(new JLabel("80"));
		panel.add(new JLabel("160"));
		
		panel.add(label10);
		panel.add(label20);
		panel.add(label40);
		panel.add(label80);
		panel.add(label160);
		JPanel panel2 = new JPanel();
		mainFrame.add(panel2);
		
		Button Run=new Button("Run");
		Run.addActionListener(this);
		panel2.add(Run);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MonteCarlo mc = new MonteCarlo();
		DecimalFormat dc=new DecimalFormat("#.###");
		label10.setText(dc.format(mc.MonteCarloFunction(0.0, 3.142, 10)));
		label20.setText(dc.format(mc.MonteCarloFunction(0.0, 3.142, 20)));
		label40.setText(dc.format(mc.MonteCarloFunction(0.0, 3.142, 40)));
		label80.setText(dc.format(mc.MonteCarloFunction(0.0, 3.142, 80)));
		label160.setText(dc.format(mc.MonteCarloFunction(0.0, 3.142, 160)));
		
	}
}
