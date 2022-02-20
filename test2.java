

import java.util.*;
public class test2 {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number of books : ");
//		int n = sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Enter Edition, Category, Rate of book");
//			int b1 =
//		}
//		
		
		
		
		
		
		
		
		int[][] books = {{1,2,3},{1,2,4},{2,1,5},{2,1,6},{1,1,7},{1,1,8},{2,2,9},{2,2,10}};
		Map<Integer,Map<Integer,List<Integer>>> h1 = new HashMap<>();
		for(int[] b:books)
		{
			h1.putIfAbsent(b[0], new HashMap<>());
			h1.get(b[0]).putIfAbsent(b[1],new ArrayList<>());
			h1.get(b[0]).get(b[1]).add(b[2]);
			System.out.println(h1);
		}
		for(int n:h1.keySet())
		{
			List<Integer> rate = new ArrayList<>();
			for(int i:h1.get(n).keySet())
				rate.addAll(h1.get(n).get(i));
			System.out.print("Edition " +n + " Categories " + h1.get(n).keySet() + " Rates "+rate );
			System.out.println();
		}
		System.out.println(h1);
	}
}
