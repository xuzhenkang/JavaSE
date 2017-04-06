package practice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private JTable leftTable;
	private JTable mainTable;
	private JPanel leftPanel;
	private JPanel lleftPanel;
	private JPanel lMainPanel;
	private JPanel rightPanel;
	private JPanel rightNorthPanel;
	private JScrollPane lLeftScrollPane;
	private JScrollPane lMainScrollPane;
	private JScrollPane rightScrollPane;

	private JLabel leftLabel;
	private JLabel mainLabel;
	private JLabel rightLabel;

	private JButton searchNextButton;

	private JTextArea jTextAreaInfo;

	public MainFrame() {
		leftPanel = new JPanel(new BorderLayout());
		lMainPanel = new JPanel(new BorderLayout());
		lleftPanel = new JPanel(new BorderLayout());
		rightPanel = new JPanel(new BorderLayout());
		rightNorthPanel = new JPanel(new GridLayout(1,3));
		lleftPanel.setSize(200, 500);
		lMainPanel.setSize(200, 500);
		jTextAreaInfo = new JTextArea(30, 30);

		leftLabel = new JLabel("相关关键词");
		mainLabel = new JLabel("中医文献");
		rightLabel = new JLabel("文献文本");
		searchNextButton = new JButton("搜索/下一个");
		
		JPanel leftLabelPanel = new JPanel();
		leftLabelPanel.add(leftLabel);
		JPanel mainLabelPanel = new JPanel();
		mainLabelPanel.add(mainLabel);
		lleftPanel.add(leftLabelPanel, BorderLayout.NORTH);
		lMainPanel.add(mainLabelPanel, BorderLayout.NORTH);
		rightNorthPanel.add(new JLabel(""));
		rightNorthPanel.add(rightLabel);
		rightNorthPanel.add(searchNextButton);

		rightPanel.add(rightNorthPanel, BorderLayout.NORTH);
		rightScrollPane = new JScrollPane(jTextAreaInfo);
		rightPanel.add(rightScrollPane, BorderLayout.CENTER);

		// 创建表头
		String[] leftColumnNames = { "关键字", "文献数" };
		String[] mainColumnNames = { "中医文献名", "作者", "朝代", "年份" };
		// 创建显示数据
		Object[][] leftData = { { "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Kathy", "Smith" }, { "John", "Doe" }, { "Sue", "Black" }, { "Jane", "White" },
				{ "Joe", "Brown" } };
		Object[][] mainData = { { "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Kathy", "Smith", "Kathy", "Smith" }, { "John", "Doe", "Kathy", "Smith" },
				{ "Sue", "Black", "Kathy", "Smith" }, { "Jane", "White", "Kathy", "Smith" },
				{ "Joe", "Brown", "Kathy", "Smith" } };

		leftTable = new JTable(leftData, leftColumnNames);
		lLeftScrollPane = new JScrollPane(leftTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		mainTable = new JTable(mainData, mainColumnNames);
		lMainScrollPane = new JScrollPane(mainTable);

		lleftPanel.add(lLeftScrollPane, BorderLayout.CENTER);
		lMainPanel.add(lMainScrollPane, BorderLayout.CENTER);
		lleftPanel.setPreferredSize(new Dimension(130, 500));
		lMainPanel.setPreferredSize(new Dimension(260, 500));

		
		leftPanel.add(lleftPanel, BorderLayout.WEST);
		leftPanel.add(lMainPanel, BorderLayout.EAST);
		this.setLayout(new GridLayout(1, 2));
		this.add(leftPanel);
		this.add(rightPanel);
		this.setUI();
	}

	private void setUI() {
		this.setTitle("基础检测子系统");
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
