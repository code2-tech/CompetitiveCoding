import java.util.ArrayList;
public class Studentarraylist {
	static ArrayList<Integer> updateArray(ArrayList<Integer> arr){
		int sum=0;
		for(int i=0;i<arr.size();i++) 
			sum += arr.get(i);
			for(int i =0;i<arr.size();i++) 
				arr.set(i, sum-arr.get(i));
				return arr;
		
		}
   public static void main(String [] args) {
	
	   ArrayList<Integer> nums= new ArrayList();
	  nums.add(1);
	   nums.add(2);
	   nums.add(3);
	   nums.add(4);
	   nums.add(5);
	   System.out.println(updateArray(nums));
   }
}
