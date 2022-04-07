import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
//		
//		char S[]=new char[9];
//		
//		S[0]='8';
//		S[1]='6';
//		S[2]='2';
//		S[3]='1';
//		S[4]='3';
//		S[5]='7';
//		S[6]='5';
//		S[7]='4';
//		S[8]='9';
//		
//		Arrays.sort(S);
//		
//		for (int i=0;i<=S.length-1;i++) {
//			System.out.println(S[i]);
//		}
//		System.out.println("=======");
//		
//		for (int i=S.length-1;i>=0;i--) {
//			System.out.println(S[i]);
//		}
//		
		String D[]=new String[3];
		D[0]="Sapna";
		D[1]="Saurabh";
		D[2]="Sara";
Arrays.sort(D);
		
		for (int i=0;i<=D.length-1;i++) {
			System.out.println(D[i]);
		}
		System.out.println("=======");
		
		for (int i=D.length-1;i>=0;i--) {
			System.out.println(D[i]);
		}
		
	}

}
