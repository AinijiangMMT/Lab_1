package lab_1;

public class Q_3 {

	public static void main(String[] args) {

	specialEleven(34);	
		
	}
public static void specialEleven(int num) {
	
	if(num%11==0 || num%11==1) {
		System.out.println("specialEleven("+num+")-->true");
	}else {
		System.out.println("specialEleven("+num+")-->false");
	}
}
	
	
}
