package Yogesh_Practice;



public class Revesre {

	public static void main(String[] args) {
		
	String str="Yogesh";
	int L1=str.length();
	String revString="";
	

	for(int i=L1-1;i>=0;i--) {
		
		revString=revString+str.charAt(i);
		
		
	}
	System.out.println(revString);
	}
}


	
