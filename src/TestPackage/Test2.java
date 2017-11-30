package TestPackage;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Test2 {
	
	public static void main(String [] args){
//		int i = 0;
//		System.out.println(i+""+ i++ +""+ i++ +""+ i++);
		int a[] = {1,1,7};
		int dpos = c_a(a);
		int remPos=a.length-dpos;
		System.out.println(remPos);
	}
	public static int c_a(int[] arr){

		
		Arrays.sort(arr);

		int counter = 0;
		int reg=0;
		int st = arr[0];
		int count[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(st==arr[i]){
				counter++;
			}
			else{
				count[reg]=counter;
				counter=1;
				st=arr[i];
				reg++;
			}
		}
		count[reg]=counter;
		
		count =(int[])ArrayUtils.removeAllOccurences(count, 0);
		Arrays.sort(count);
		counter=count[count.length-1];
        for(int i=count.length-1;i>=0;i--){
        	//System.out.println(count[i]);
        	if(count[i]==count[i-1]){
        		counter+=count[i-1];
        		
        	}else{
        		break;
        	}
        }
		
		return counter;
	}
}
