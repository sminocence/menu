package test;

/*
 * ���ӳ�������.
 * ���ӵ�һ��ժ�����ɸ�����,��������һ��, �ֶ����һ��.
 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ��,�ֶ����һ��. 
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��.
 * ����ʮ�����������ʱ, ��ֻʣһ��������.
 * ���һ�칲ժ�˶��ٸ�����?
 */

public class CountPeach {
	
	public static void main(String[] args) {
		System.out.println("��һ��һ��ժ��" + numPeach(1) + "������");
	}
	
	//���õݹ�ķ��������һ�칲ժ��������
	public static int numPeach(int day) {						
		if(day == 10) return 1;
		else return (numPeach(++day) + 1) * 2;
		}
}
	

