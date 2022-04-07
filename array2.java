import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		
		char grade[]=new char[6];
		
		grade[0]='1';
		grade[1]='B';
		grade[2]='h';
		grade[3]='d';
		grade[4]='2';
		grade[5]='F';
		
//		System.out.println(grade[0]);
//		System.out.println(grade[5]);
//		System.out.println(grade[3]);//default value for char is blank(\n000)
		
		
//		for (int i=0;i<=5;i++) {
//			System.out.println(grade[i]);
//			
//		}
//		
//		System.out.println("==================");
//		
//		for (int i=0;i<=grade.length-1;i++) {
//			System.out.println(grade[i]);
//		}
	Arrays.sort(grade);
		
		for (int i=0;i<=grade.length-1;i++) {
			System.out.println(grade[i]);
	}
		
		System.out.println("===============");
		
for (int i=grade.length-1;i>=0;i--) {
		System.out.println(grade[i]);
	}
		
	}
	
	
	

}
