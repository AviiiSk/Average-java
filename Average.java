

// 5. Write the Java Program to calculate total of five subject marks and average of it.






public class Average {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int English = 50;
		
		int Hindi = 62;
		
		int Marathi = 65;
		
		int Urdu = 80;
		
		int Math = 78;
		
	int total = English + Hindi + Marathi + Urdu + Math;
	
	int avg = total/5;
	
	System.out.println("Marks of English : " + English);
	System.out.println("Marks of Hindi : " + Hindi);
	System.out.println("Marks of Marathi : " + Marathi);
	System.out.println("Marks of Urdu : " + Urdu);
	System.out.println("Marks of Math : " + Math);
	System.out.println("Total of Subjects : " + total);
	System.out.println("Average of Marks : " + avg);
		
	}

}
