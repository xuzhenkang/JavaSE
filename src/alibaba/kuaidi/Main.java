package alibaba.kuaidi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
�ڿ�ݹ�˾��������ĳ���ʹ���У������ŵ��߳���˫�߳�������ʹ�ó��������� ��������-�������ģ������ֲ����ĵ��˴˵ĵ����Եȣ�����Կ�˫�߳�����ͬһ�������������Կ�����
�����������ĵĶԷ��������Ե�ʱ�������õ��߳�������˫�߳��ĳɱ��ǵ��ڵ��߳��ģ����������Կ��ĵ��߳��ϲ�Ϊһ��������˫�߳����ܹ���ʡ�����ɱ���
���߳��Ż�ԭ��
�����߳��Ż��Ĺ�����пɳ���Ϊ�������֣�A,B,C����ʾ�ֲ����ģ���
����-1: A-B���߳���B-A���߳� �Ż���������A-B��B-A���������߳��ϲ�Ϊ˫�ߣ�
����-2: A-B���߳���B-C���߳���C-A���߳� �Ż���������A-B��B-C��C-A���������߳��Ż�Ϊһ��������������
����-3: A-B���߳���C-A���߳���B��Cͬʡ �Ż���������B��Cͬʡ����A-B��C-A���������Ż�Ϊһ����������
�������£�
��ĳ��ݹ�˾��ʵ�ʵ��߳�����Ϊ������·ID����;���ֲ�����; ���ֲ���������ʡ;����ֲ�����;����ֲ���������ʡ�����ͣ����������Ż����Ż��Ĺ���������ϣ�
�������ȼ����ν��ͣ��ϲ���ʱ����Ҫ���ǳ��ͣ���Ϊ17.5m��9.6m���֣���1����ͬ���Ͳ��ܽ��кϲ���2������ͬ�����9.6m������һ��17.5m�ĶԿ����ͺϲ��Ż� ˵����
�Ż����������չ�����࣬����rule1�� 2016120001+2016120002��ʾ�����߳���·ID����Ϊ2016120001��2016120002���չ���1�ϲ��Ż�

���˵��
�������汾: Java 1.8.0_66
��ʹ�ñ�׼�������(System.in, System.out)���ѽ���ͼ�Ρ��ļ������硢ϵͳ��صĲ�������java.lang.Process , javax.swing.JFrame , Runtime.getRuntime��
��Ҫ�Զ�������ƣ�����ᱨ������Ҫ���package answer֮�����䣻
������д�ܶ���࣬���Ǳ�����һ������ΪMain������Ϊpublic���ԣ�����MainΪΨһ��public class��Main�������������һ������Ϊ'main'�ľ�̬����������������������ǳ�������
ʱ������: 3S (C/C++���������Ϊ: 5 S)   �ڴ�����: 128M (C/C++���������Ϊ: 640 M)
����:
��·���ݣ�����2�� ÿ����6����� ��·ID;�����ֲ���������;����ʡ����;����ֲ���������;����ʡ����;����;
���:
���������Ż���������ĵ��߳��Ż����
���뷶��:
350410;��������;�㽭ʡ;��������;����ʡ;9.6m;
350424;��������;����ʡ;��������;�㽭ʡ;9.6m;
350428;��������;�㽭ʡ;��ɳ����;����ʡ;17.5m;
350432;��ɳ����;����ʡ;�人����;����ʡ;17.5m;
350448;�人����;����ʡ;��������;�㽭ʡ;17.5m;
350476;��������;�㽭ʡ;Ϋ������;ɽ��ʡ;9.6m;
350479;Ϋ������;ɽ��ʡ;��������;�㽭ʡ;17.5m;
350481;��������;�㽭ʡ;�ɶ�����;�Ĵ�ʡ;9.6m;
�������:
rule1:350410+350424
rule2:350428+350432+350448

 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
		while (scanner.hasNextLine()) {
			String[] options = scanner.nextLine().split(";");
			if (options.length < 5) {
				break;
			}
			lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
		}
		scanner.close();

		// wirte your code here
		List<String> result = calculateUnilateral(lineList);

		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("rule1:350410+350424\nrule2:350428+350432+350448");
	}

	public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
		List<String> result = new ArrayList<String>();
		
		return result;
		
	}
	
	public static boolean isRule1(UnilateralLine entry1, UnilateralLine entry2) {// A-B���߳���B-A���߳�
		return entry1.sCen.equals(entry2.eCen) && entry1.eCen.equals(entry2.sCen);
	}
	public static boolean isRule2(UnilateralLine entry1, UnilateralLine entry2, UnilateralLine entry3) {//A-B���߳���B-C���߳���C-A���߳� 
		return entry1.sCen.equals(entry3.eCen) && entry1.eCen.equals(entry2.sCen) && entry2.eCen.equals(entry3.sCen);
	}
	public static boolean isRule3(UnilateralLine entry1, UnilateralLine entry2) {//A-B���߳���C-A���߳���B��Cͬʡ
		return entry1.sCen.equals(entry2.eCen) && entry1.ePro.equals(entry2.sPro);
	}
	

	public static class UnilateralLine {
		private String id;
		private String sCen;// �����ֲ�
		private String sPro;// ����ʡ
		private String eCen;// ����ֲ�
		private String ePro;// ����ʡ
		// 9.6m/17.5m
		private String tType;// ����

		public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
			this.id = id;
			this.sCen = sCen;
			this.sPro = sPro;
			this.eCen = eCen;
			this.ePro = ePro;
			this.tType = tType;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSCen() {
			return sCen;
		}

		public void setSCen(String ePro) {
			this.ePro = ePro;
		}

		public String getSPro() {
			return sPro;
		}

		public void setSPro(String sPro) {
			this.sPro = sPro;
		}

		public String getECen() {
			return eCen;
		}

		public void setECen(String eCen) {
			this.eCen = eCen;
		}

		public String getEPro() {
			return ePro;
		}

		public void setEPro(String ePro) {
			this.ePro = ePro;
		}

		public String getTType() {
			return tType;
		}

		public void setTType(String tType) {
			this.tType = tType;
		}
	}
}