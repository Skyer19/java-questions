import java.util.Scanner;

public class p1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		double sum=0;
		String str2="";
		for(int i=0;i<str.length();i++) {
			int num=(str.charAt(i)-48);
			sum=sum+num;
		}
		String str1=(int)sum+"";
		for(int j=0;j<str1.length();j++) {
			switch(str1.charAt(j)) {
			case ('0'):
			str2=str2+"lin";
			break;
			case ('1'):
			str2=str2+" yi";
			break;
			case ('2'):
				str2=str2+" er";
				break;
			case ('3'):
				str2=str2+" san";
				break;
			case ('4'):
				str2=str2+" si";
				break;
			case ('5'):
				str2=str2+" wu";
				break;		
			case ('6'):
				str2=str2+" liu";
				break;
			case ('7'):
				str2=str2+" qi";
				break;
			case ('8'):
				str2=str2+" ba";
				break;			
			case ('9'):
				str2=str2+" jiu";
				break;	
			}
		}
//		String str4=str2.trim();
		System.out.println(str2.trim());
	}

}
