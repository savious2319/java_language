package stringEx;
/*
 	���ڿ�
 	
 	���ڿ� �����ϴ� �޼����!!!
 	length() - int
 	charAt(����==�ε���) - char
 	equals(Object)
 	equalsIgnoreCase(���ڿ�)	str.equalsIgnoreCase("Abc"); abc ��ҹ��� ������� str�� ������ ���� �ּ���.
 	
 	
 	concat(���ڿ�) -> String(����Ÿ��) 	str.concat("bcd"); str�� "bcd"�� �ٿ��� ���ο� ���ڿ��� �����Ѵ�!
 				 str +"bcd"
 	contains(CharSequence) -> boolean(����Ÿ��) 	str.contains("bcd");	str�� "bcd"�� ���ԵǾ��ִ�?
 	CharSequence�� String Ŭ������ ����Ŭ���� (���ڿ� ����ȴ�)  
 		String s = "abcdef";
 		s.contains("cd");	-> true
 		
 	endsWith(���ڿ�) -> boolean(����Ÿ��)	str.endsWith("txt"); 	str���ڿ��� txt�� ������?
 	
 	indexOf(int)	-> int 	String msg = "Hello";
 							int index = msg.indexOf('o'); -> msg��� ���ڿ��� o��� ���ڴ� ���° ��ġ�� �ִ�?
 																4�� �ε����� �־��~
 																������ : -1�� �����Ѵ�!
 																
    indexOf(String)		msg.indexOf("el");		���ϰ� 1�� �ش�!
    
    lastIndexOf(int) 	-> int		�ڿ������� (������ -> ����) ã���� �ϴ� ������ ��ȣ��    								
    lastIndexOf(String) -> int     	�˻��ؼ� ��ġ�� �˷��ش�
    
    replace(char A, char B)  -> String 		A:  ���� ���� 		B:  ���� �ٲ� ����!
        									String tmp = msg.replace('H', 'C');
        									tmp : Cello
        									
    replace("ll", "LL")		msg => Hello		HeLLoLLo
    
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    
    ���ڿ�.split(���ڿ� �и���=regex) -> String[]
    	���ڿ�("dog, cat, cow").split(",")	,�޸��� ��������!
    	"dog"
    	"cat"
    	"cow"
    
    subString(int begin)	
            			
     ���ڿ�.substring(5);	5���� �����ؼ� ������ ���ڿ��� ��ȯ����!
     
      0123456
     "abcdefg".substring(5);				fg�� ������ �ش�
     
     substring(0, 5);						ù��° : ���� 0"����"
     										�ι�°(end��) : exclusive �̸�! 4������!!!
     										
                0 <= ���ڿ� �ε��� < 5 �߶� �����Ͷ�! 
                
     trim()		:    ���ڿ����� �¿� ������ ���� ���, ������ ���ְ� ���� ���ڿ��� �����Ͷ�!
     
     String id = "     dog  ";
     String tmp = id.trim();		tmp���� "dog"�� �´�!
     id = "   do  g " ;
     id.trim();    <---- "do  g"  �̷��� ���� �´�!
     
                                											
 */
public class StringTest02 {

	public static void main(String[] args) {
		
		
		
	}

}



















