package test;

/*
 * ������ a[n]���� java ���뽫����Ԫ��˳��ߵ�
 */

public class InverseSetArray {
		
	// ����һ�����ͷ��������������������͵�����,Ȼ���ٽ������е�Ԫ�ص���	 
	public static <T> void Inverse(T array[]) {		
		int len = array.length;	
		//��ӡ���ԭ��������Ԫ��
        System.out.println("ԭ��������Ϊ��");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");        	
        }         
		//�������е�����Ԫ������
        for (int i = 0; i < len/2; i++) {  
        	T temp = array[i];  
            array[i] = array[len-1-i];  
            array[len-1-i] = temp; 
        }
        System.out.print("\n");        
        //��ӡ������ù��������
        System.out.println("���ú������Ϊ��");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");        	
        }        
        System.out.print("\n");
	}
	
	public static void main(String[] args) {		
		 String arr[] = {"sf","sgs","gs"};	
		 Inverse(arr);	
		 Integer arra[] = {1,2,3,4,5};
		 Inverse(arra);
	}
}

