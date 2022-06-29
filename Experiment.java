import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kendrick Smith
 *
 */
public class Experiment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scn = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How many items are in the list?");

	    int n = Integer.parseInt(scn.nextLine());  // Read user input
	    scn.close();
	    
	    List<Integer> arr = new ArrayList<Integer>();//create ArrayList
	    List<Integer> lin = new ArrayList<Integer>();//create LinkedList
	    
		addNums(arr,n);
		addNums(lin,n);
		
		long startTime = System.currentTimeMillis(); //Test One on ArrayList
		//CODE TO BE TIMED
		getCounts(arr);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println(duration);
		
		startTime = System.currentTimeMillis(); //Test One on LinkedList
		//CODE TO BE TIMED
		getCounts(lin);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println(duration);
		
		startTime = System.currentTimeMillis(); //Test Two on ArrayList
		//CODE TO BE TIMED
		getCountsV2(arr);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println(duration);
		
		startTime = System.currentTimeMillis(); //Test Two on LinkedList
		//CODE TO BE TIMED
		getCountsV2(lin);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println(duration);
		
		startTime = System.currentTimeMillis(); //Test Three on ArrayList
		//CODE TO BE TIMED
		addRemove(arr);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println(duration);
		
		startTime = System.currentTimeMillis(); //Test Three on LinkedList
		//CODE TO BE TIMED
		addRemove(lin);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println(duration);

	}
	
	public static void addNums(List<Integer> numbers, int n) {
		for (int i=0; i<n; i++) {
			numbers.add((int) (Math.random()*10));
		}
	}
	
	public static int[] getCounts(List<Integer> numbers) {
	    int[] counts = new int[10];
	    for(int i = 0; i<numbers.size(); i++) {
	        counts[numbers.get(i)]++;
	    }
	    return counts;
	}
	
	public static int[] getCountsV2(List<Integer> numbers) {
		ListIterator<Integer> iter = numbers.listIterator(0);
		int[] counts = new int[10];
		while(iter.hasNext()) {
	        counts[iter.next()]++;
	    }
		return counts;
	}
	
	public static void addRemove(List<Integer> numbers) {
		for (int i=0;i<numbers.size();i++) {
			numbers.remove(0);
			numbers.add((int) (Math.random()*10));
		}
	}

}
