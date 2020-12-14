package term2;
import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random(1000);
		int n=sc.nextInt();
		int[] v =new int [n];
		int k = sc.nextInt();
		for(int i=0;i<n;i++) v[i]=r.nextInt();
		for(int i=0;i<n;i++) System.out.println(v[i]+" ");
		for(int i=0;i<k;i++) {
			int a=r.nextInt(n);
			int b=r.nextInt(n);

			int min = v[a-1];
			int max = v[a-1];
			long sum = v[a-1];
				for(int j=a;j<b;j++) {
					if(min>v[j]) min=v[j];
					if(max<v[j]) max=v[j];
					sum += v[j];
			}
			System.out.println("최대값, 최소값, 합계");
			System.out.println(max+" "+min+" "+sum);
		}
		
		
		
	}

}
