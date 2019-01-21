
public class StringReverse {
	
	
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="sailesh";
		int endIndex =s.length()-1;
		reverseSubstring(s,endIndex);
		

	}
public static void reverseSubstring(String str,int endIndex){

	if(endIndex>=0){
		System.out.println(str.charAt(endIndex));
	reverseSubstring(str.substring(0,endIndex),endIndex-1);

}
}
}

	

