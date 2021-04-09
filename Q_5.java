package lab_1;

public class Q_5 {

	public static void main(String[] args) {
caughtSpeed(-85, true);
		
	}

	public static void caughtSpeed(int speed, boolean birthD) {
		if( speed >=80) {
			if(speed <=85 && birthD==true) {
				System.out.println("caughtSpeed("+speed+","+birthD+")-->1");
			}else {
				System.out.println("caughtSpeed("+speed+","+birthD+")-->2");
			}
		}else if(speed>=60) {
			if(speed <=65 && birthD==true) {
				System.out.println("caughtSpeed("+speed+","+birthD+")-->0");
			}else {
				System.out.println("caughtSpeed("+speed+","+birthD+")-->1");
			}
		}else if(speed <=60) {
			System.out.println("caughtSpeed("+speed+","+birthD+")-->0");
			
		}else {
			System.out.println("invalid speed measurement");
		}
	}
	
	
}
