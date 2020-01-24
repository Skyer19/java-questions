import java.util.Scanner;

public class p1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num0=sc.nextInt();
		double num=(num0-1)/2;
		String cha=sc.next();
		int sum=0;
		int count=0;
		int i=3;
		while(sum<=num) {			
			sum+=i;
			i=i+2;		
			count++;
		}
		count--;
//		System.out.println(sum);
		int countarray=count+1;
		String arr[][]=new String [countarray] [countarray*2-1];//(一共有多少行-1)/2
		int start=0;
		int last=(count+1)*2-2;
		for(int j=0;j<countarray;j++) {
			if(start<=last) {
			for(int k=0;k<countarray*2-1;k++) {
				if(k>=start&&k<=last) {
					arr[j][k]=cha;
				}else {
					arr[j][k]=" ";
				}
			}
		}
			start++;
			last--;
		}
		
		for(int j=0;j<countarray;j++) {
			for(int k=0;k<countarray*2-1;k++) {
				System.out.print(arr[j][k]);
			}
			System.out.println();
		}
		for(int j=countarray-2;j>=0;j--) {
			for(int k=0;k<countarray*2-1;k++) {
				System.out.print(arr[j][k]);
			}
			System.out.println();
		}

		int all=(sum-((count+2)*2-1));	
		System.out.println((num0)-all*2-1);
	}

}
