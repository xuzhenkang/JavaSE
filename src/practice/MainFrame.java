package practice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable leftTable;
	private JTable mainTable;
	private JPanel leftPanel;
	private JPanel lleftPanel;
	private JPanel lMainPanel;
	private JPanel rightPanel;
	private JPanel rightNorthPanel;
	private JPanel leftLabelPanel;
	private JPanel mainLabelPanel;
	private JScrollPane lLeftScrollPane;
	private JScrollPane lMainScrollPane;
	private JScrollPane rightScrollPane;
	private JLabel leftLabel;
	private JLabel mainLabel;
	private JLabel rightLabel;
	private JButton searchNextButton;
	private JTextArea jTextAreaInfo;
	private Object[][] leftData;
	private Object[][] mainData;
	// 表头
	private String[] leftColumnNames = { "关键字", "文献数" };
	private String[] mainColumnNames = { "中医文献名", "作者", "朝代", "年份" };
	
	public MainFrame() {
		// 初始化组件
		initComponents();
		// 加载数据
		loadData();
		// 左侧Panel
		leftLabelPanel.add(leftLabel);
		lleftPanel.add(leftLabelPanel, BorderLayout.NORTH);
		leftTable = new JTable(leftData, leftColumnNames);
		lLeftScrollPane = new JScrollPane(leftTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		lleftPanel.add(lLeftScrollPane, BorderLayout.CENTER);
		lleftPanel.setPreferredSize(new Dimension(130, 500));
		
		
		// 中间Panel
		mainLabelPanel.add(mainLabel);
		lMainPanel.add(mainLabelPanel, BorderLayout.NORTH);
		mainTable = new JTable(mainData, mainColumnNames);
		lMainScrollPane = new JScrollPane(mainTable);
		lMainPanel.add(lMainScrollPane, BorderLayout.CENTER);
		lMainPanel.setPreferredSize(new Dimension(260, 500));
		
		
		// 右侧Panel
		rightNorthPanel.add(new JLabel(""));
		rightNorthPanel.add(rightLabel);
		rightNorthPanel.add(searchNextButton);

		rightPanel.add(rightNorthPanel, BorderLayout.NORTH);
		rightScrollPane = new JScrollPane(jTextAreaInfo);
		rightPanel.add(rightScrollPane, BorderLayout.CENTER);

		

		// 设定布局
		leftPanel.add(lleftPanel, BorderLayout.WEST);
		leftPanel.add(lMainPanel, BorderLayout.EAST);
		

		
		
		
		
		
		
		this.setLayout(new GridLayout(1, 2));
		this.add(leftPanel);
		this.add(rightPanel);
		this.setFrame();
	}

	private void initComponents() {
		leftPanel = new JPanel(new BorderLayout());
		lMainPanel = new JPanel(new BorderLayout());
		lleftPanel = new JPanel(new BorderLayout());
		rightPanel = new JPanel(new BorderLayout());
		rightNorthPanel = new JPanel(new GridLayout(1,3));
		jTextAreaInfo = new JTextArea();
		leftLabel = new JLabel("相关关键词");
		mainLabel = new JLabel("中医文献");
		rightLabel = new JLabel("文献文本");
		searchNextButton = new JButton("搜索/下一个");
		leftLabelPanel = new JPanel();
		mainLabelPanel = new JPanel();
	}

	private void loadData() {
		// 创建显示数据
		leftData = new Object[50][2];
		for (int i = 0; i < leftData.length; i++) {
			leftData[i][0] = "John";
			leftData[i][1] = "Sue";
		}
		mainData = new Object[50][4];
		for (int i = 0; i < mainData.length; i++) {
			mainData[i][0] = "Kathy" + i + 0;
			mainData[i][1] = "Smith" + i + 1;
			mainData[i][2] = "John" + i + 2;
			mainData[i][3] = "Doe" + i + 3;
		}
	}

	private void setFrame() {
		this.setTitle("基础检测子系统");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
