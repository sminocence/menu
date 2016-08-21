package test;
import java.util.*;

/*有一个字符串，其中包含中文字符、英文字符和数字字符，
 * 统计和打印出 各个字符 的个数（提示:用map保存） 
 */

public class CountCharacter {
	
	public static void main(String[] args) {		
		int count = 1;		
		String str = "www123我各www123我各";		
		char [] st = str.toCharArray();
	  	
		//利用HashMap来存储给定字符串的各个字符-个数的键值对
		Map<Character, Integer> string = new HashMap<Character, Integer>();		
		//计算给定字符串中各个字符的个数
		for (int i = 0; i < st.length; i++) {	
			if (string.get(new Character(st[i])) == null) {
				string.put(new Character(st[i]), count);
			} else {				
				int num = string.get(new Character(st[i])).intValue();
				num++;
				string.put(new Character(st[i]), num);
			}
		}
		
		//打印输出map中各个字符和其个数 
		for (Map.Entry<Character, Integer> entry : string.entrySet()) {  
			Character key = entry.getKey();  
			Integer value = entry.getValue();  
            System.out.println("这个字符为：" + key + ", 它的个数为：" + value + "");  
        }
		
		//定义一个用来map存储字符的对象	    		
	  	class Character {
			private char a;
			Character(char a){
				this.a = a;
			}		
		}
	}
}

