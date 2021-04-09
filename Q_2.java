package lab_1;

public class Q_2 {

	public static void main(String[] args) {

		love6(5,11);
		
	}

		public static void love6(int num1,int num2) {
		if(num1==6 || num2==6) {
			System.out.println("love6("+num1+","+num2+")->true");
		}else if(num1+num2==6) {
			System.out.println("love6("+num1+","+num2+")->true");
		}else if(num2-num1==6 || num1-num2==6) {
			System.out.println("love6("+num1+","+num2+")->true");
			
		}else {
			System.out.println("false");
		}
	}
}
