import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={2,4,5,7,1};
		HashMap<Integer,Integer>map=new HashMap();
		int k=9;
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
		    sum=sum+arr[i];
		    if(map.containsKey(sum-k)){
		        count=count+map.get(sum-k);
		        }
		        map.put(sum,map.getOrDefault(sum,0)+1);
		}
		System.out.println(count);
	    
	}}
