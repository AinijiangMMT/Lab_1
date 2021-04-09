package lab_1;

public class Q_6 {

	public static void main(String[] args) {

		chipmonkParty(65, true);

	}

	public static void chipmonkParty(int cigar, boolean weekend) {

		if (cigar < 40) {
			System.out.println("cigarParty(" + cigar + "," + weekend + ")-->false");
		} else if (cigar >= 40 && cigar <= 60) {
			System.out.println("cigarParty(" + cigar + "," + weekend + ")-->true");
		} else {
			if (weekend == true) {
				System.out.println("cigarParty(" + cigar + "," + weekend + ")-->true");
			} else {
				System.out.println("cigarParty(" + cigar + "," + weekend + ")-->false");
			}
		}
	}

}
