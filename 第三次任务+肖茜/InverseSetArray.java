package test;

/*
 * 有数组 a[n]，用 java 代码将数组元素顺序颠倒
 */

public class InverseSetArray {
		
	// 定义一个泛型方法：用来接收任意类型的数组,然后再将数组中的元素倒置	 
	public static <T> void Inverse(T array[]) {		
		int len = array.length;	
		//打印输出原来的数组元素
        System.out.println("原来的数组为：");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");        	
        }         
		//将数组中的所有元素逆置
        for (int i = 0; i < len/2; i++) {  
        	T temp = array[i];  
            array[i] = array[len-1-i];  
            array[len-1-i] = temp; 
        }
        System.out.print("\n");        
        //打印输出逆置过后的数组
        System.out.println("逆置后的数组为：");
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

