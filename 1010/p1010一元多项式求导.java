import java.util.Scanner;

public class p1010一元多项式求导 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;;i++) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=num1*num2;
			int num4=num2-1;
			if(num3!=0&&num4==0||num3!=0&&num4!=0) {
			if(i==0) {
				if(num3!=0&&num4!=0) {
			System.out.print(num1*num2+" ");
			System.out.print(num2-1);
				}else {
			System.out.println(0+" "+0);
			break;
				}
			}else {
				System.out.print(" "+num1*num2+" ");
				System.out.print(num2-1);	
			}
			
		}else if(num3==0&&num4==0){
			System.out.print(" "+0+" ");
			System.out.print(0);	
		}else {			
		}
		}
	}
}
