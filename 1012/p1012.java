
import java.text.DecimalFormat;
import java.util.Scanner;

public class p1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1 = 0;
		int a2 = 0;
		int count = 0;
		int a3 = 0;
		int a4 = 0;
		float sum = 0;
		int count4 = 0;
		int a5 = 0;
		int max = 0;
		int all=sc.nextInt();
		int countall=0;
		while (countall<all) {
			countall++;
			int num = sc.nextInt();
			if (num % 5 == 0&&num%2==0) {
				a1+=num;
			} else if (num % 5 == 1) {
				count++;
				if (count % 2 != 0) {
					a2 += num;
				} else {
					a2 -= num;
				}
			} else if (num % 5 == 2) {
				a3++;
			} else if (num % 5 == 3) {
				count4++;
				sum += num;
			} else {
				if (num > max) {
					max = num;
				}
			}
		}
		if(a1==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(a1+" ");	
		}
		if(a2==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(a2+" ");
		}
		if(a3==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(a3+" ");
		}
		DecimalFormat decimalFormat=new DecimalFormat("#.0");
		float f=sum/count4;
		if(sum==0&&count4==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(decimalFormat.format(f)+" ");
		}
		if(max==0) {
			System.out.print("N");
		}else {
			System.out.println(max);
		}
	}

}
