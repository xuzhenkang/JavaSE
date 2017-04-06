package practice;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGridBagLayout {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		jf.setLayout(gbl);
		JButton jb1 = new JButton("BUTTON1");
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 10;
		gbc.weighty = 10;
		gbl.setConstraints(jb1, gbc);
		jf.add(jb1);
		JButton jb2 = new JButton("BUTTON2");
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.gridx = 1;
		gbc1.gridy = 0;
		gbc1.gridheight = 2;
		gbc1.weightx = 20;
		gbc1.weighty = 20;
		gbl.setConstraints(jb2, gbc1);
		jf.add(jb2);
		JButton jb3 = new JButton("BUTTON3");
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.gridwidth = 1;
		gbc2.weightx = 10;
		gbc2.weighty = 10;
		gbl.setConstraints(jb3, gbc2);
		jf.add(jb3);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
}