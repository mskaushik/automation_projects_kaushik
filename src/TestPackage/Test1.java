package TestPackage;

public class Test1 {
	
	public static void main(String [] args){
//		int i = 0;
//		System.out.println(i+""+ i++ +""+ i++ +""+ i++);
		int a[] = {1,2,3,4};
		c_a(a[0],a);
		System.out.println(a[0]+"..."+a[1]);
	}
	public static void c_a(int i, int[] arr){
		arr[i]=6;
		i=5;
	}
}
