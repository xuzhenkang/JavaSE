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
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable leftTable; // �����
	private JTable mainTable; // �м�ı��
	private JPanel leftPanel; // ������
	private JPanel lleftPanel; // �������е�������
	private JPanel lMainPanel; // �������е��Ҳ����
	private JPanel rightPanel; // �Ҳ����
	private JPanel rightNorthPanel; // �Ҳ�����еı������
	private JPanel leftLabelPanel; // �������е��������еı�ǩ���
	private JPanel mainLabelPanel; // �������е��Ҳ�����еı�ǩ���
	private JScrollPane lLeftScrollPane; // �������е��������е�Scroll���
	private JScrollPane lMainScrollPane; // �������е��Ҳ�����е�Scroll���
	private JScrollPane rightScrollPane; // �Ҳ�����е�Scroll���
	private JLabel leftLabel; // �������е�������ı����ǩ����еı�ǩ���
	private JLabel mainLabel; // �������е��Ҳ����ı����ǩ����еı�ǩ���
	private JLabel rightLabel; // �Ҳ�����еı�������еı�ǩ���
	private JButton searchNextButton; // �Ҳ�����еı�������еİ�ť���
	private JTextArea jTextArea; // �Ҳ�����е��м�Scroll����е�TextArea���
	private Object[][] leftData; // �������е��������б�������
	private Object[][] mainData; // �������е��Ҳ�����б�������
	// ��ͷ
	private String[] leftColumnNames = { "�ؼ���", "������" }; // �������е��������б��ı�ͷ
	private String[] mainColumnNames = { "��ҽ������", "����", "����", "���" }; // �������е��Ҳ�����б��ı�ͷ
	
	
	public MainFrame() {
		// ��ʼ�����
		this.initComponents();
		// ��������
		this.loadData();
		// ���Panel
		this.initLeftPanel();
		// �Ҳ�Panel
		this.initRightPanel();
		// �趨JFrame�����岼��
		this.setLayout(new GridLayout(1, 2));
		// ��JFrame��������������
		this.add(leftPanel);
		this.add(rightPanel);
		// �趨JFrame����
		this.setFrame();
	}

	private void initRightPanel() {
		rightNorthPanel.add(new JLabel(""));
		rightNorthPanel.add(rightLabel);
		rightNorthPanel.add(searchNextButton);

		rightPanel.add(rightNorthPanel, BorderLayout.NORTH);
		jTextArea.setEditable(false); // ���ò��ɱ༭
		jTextArea.setText("asdfasdfasdf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\nf\n\nadsf\nasdf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\ndf\n");
		rightScrollPane = new JScrollPane(jTextArea);
		rightPanel.add(rightScrollPane, BorderLayout.CENTER);
	}

	private void initLeftPanel() {
		// ���Panel
		leftLabelPanel.add(leftLabel);
		lleftPanel.add(leftLabelPanel, BorderLayout.NORTH);
		leftTable = new JTable(leftData, leftColumnNames) {
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		leftTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// �����Ե�ѡ
		
		lLeftScrollPane = new JScrollPane(leftTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		lleftPanel.add(lLeftScrollPane, BorderLayout.CENTER);
		lleftPanel.setPreferredSize(new Dimension(130, 500));
		
		// �м�Panel
		mainLabelPanel.add(mainLabel);
		lMainPanel.add(mainLabelPanel, BorderLayout.NORTH);
		mainTable = new JTable(mainData, mainColumnNames){
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		mainTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // �����Ե�ѡ
		lMainScrollPane = new JScrollPane(mainTable);
		lMainPanel.add(lMainScrollPane, BorderLayout.CENTER);
		lMainPanel.setPreferredSize(new Dimension(267, 500));
		
		// �趨����
		leftPanel.add(lleftPanel, BorderLayout.WEST);
		leftPanel.add(lMainPanel, BorderLayout.EAST);
	}

	private void initComponents() {
		leftPanel = new JPanel(new BorderLayout());
		lMainPanel = new JPanel(new BorderLayout());
		lleftPanel = new JPanel(new BorderLayout());
		rightPanel = new JPanel(new BorderLayout());
		rightNorthPanel = new JPanel(new GridLayout(1,3));
		jTextArea = new JTextArea();
		leftLabel = new JLabel("��عؼ���");
		mainLabel = new JLabel("��ҽ����");
		rightLabel = new JLabel("�����ı�");
		searchNextButton = new JButton("����/��һ��");
		leftLabelPanel = new JPanel();
		mainLabelPanel = new JPanel();
	}

	private void loadData() {
		// ������ʾ����
		leftData = new Object[50][2];
		for (int i = 0; i < leftData.length; i++) {
			leftData[i][0] = "John";
			leftData[i][1] = "Sue";
		}
		mainData = new Object[50][4];
		for (int i = 0; i < mainData.length; i++) {
			mainData[i][0] = "���ݸ�Ŀ";
			mainData[i][1] = "��ʱ��";
			mainData[i][2] = "��";
			mainData[i][3] = "1518��";
		}
	}

	private void setFrame() {
		this.setTitle("���������ϵͳ");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
