import java.util.Calendar;
import java.util.Scanner;
 
public class t5 {
 
	public static void main(String[] args) {
		// ���ָ�����µ����������´Ӽ������롣ÿ����һ�У��������տ�ʼ����������������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������꣺");
		int year = scanner.nextInt();
		
		System.out.println("�������£�");
		int month = scanner.nextInt();
		
		// ��ȡ���д���ִ�е�ʱ�� ��������
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);// �޸� ������
		
		// ��ȡ1��������ܵĵڼ���
		int week = c.get(Calendar.DAY_OF_WEEK);
		int max = c.getActualMaximum(Calendar.DATE);// �õ����µ�������
		System.out.println("�����ܹ��У�" + max + "��");
 
		System.out.println(year + "��" + month + "�µ�����Ϊ��");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		// ��ӡ1��֮ǰ�Ŀո�
		String empty = " ";
		for (int j = 1; j < week; j++) {
			System.out.print(empty);
			System.out.print("\t");
		}
		// ��ӡ����
		int tag = week;
		for (int i = 1; i <= max; i++) {
			System.out.print(i);
			System.out.print("\t");
			// ����
			if (tag % 7 == 0) {
				System.out.println();
			}
			tag++;
		}
	}
 
}
