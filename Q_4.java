package lab_1;

public class Q_4 {

	public static void main(String[] args) {

		deerVA(95,false);
		
	}
   public static void deerVA(int temp,boolean isSummer) {
   
	   if(temp<=90 && temp>=60) {
			   System.out.println("deepPlay("+temp+","+isSummer+");-->true");
   } else if(temp>=90 && temp<=100 && isSummer==true ) {
			   System.out.println("deepPlay("+temp+","+isSummer+");-->true");
		   }else {
			   System.out.println("deepPlay("+temp+","+isSummer+");-->false");
		   }
	   }
   }


