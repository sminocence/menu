package test;

/*
 * 猴子吃桃问题.
 * 猴子第一天摘下若干个桃子,当即吃了一半, 又多吃了一个.
 * 第二天早上又将剩下的桃子吃掉一半,又多吃了一个. 
 * 以后每天早上都吃了前一天剩下的一半零一个.
 * 到第十天早上在想吃时, 就只剩一个桃子了.
 * 求第一天共摘了多少个桃子?
 */

public class CountPeach {
	
	public static void main(String[] args) {
		System.out.println("第一天一共摘了" + numPeach(1) + "个桃子");
	}
	
	//运用递归的方法计算第一天共摘的桃子数
	public static int numPeach(int day) {						
		if(day == 10) return 1;
		else return (numPeach(++day) + 1) * 2;
		}
}
	

