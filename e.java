import java.util.*;
public class e{
	public static void main(String args[]) 
    {
	 Scanner read=new Scanner(System.in);
        List<Integer> editionID =new ArrayList<Integer>();
        List<Integer> categoryID =new ArrayList<Integer>();
        List<List<Integer>> Rates =new ArrayList<List<Integer>>();
        System.out.println("Enter the length of data:");
        int n=read.nextInt();

        System.out.println("Enter the rates:");
        int n_of_rates=read.nextInt();

        System.out.println("Enter the data in sequence of editionID, categoryID, Rates:");
        for(int i=0;i<n;i++)
        {
            editionID.add(read.nextInt());
            categoryID.add(read.nextInt());
            Rates.add(new ArrayList<>());
            for(int j=0;j<n_of_rates;j++)
            {
                Rates.get(i).add(j,read.nextInt());
            }
            System.out.println();
        }
        System.out.printf("%10s %10s %10s", "Edition", "Category", "Rates");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.printf("%10s %10s",editionID.get(i),categoryID.get(i));
            for(int j=0;j<n_of_rates;j++)
            {
                System.out.printf("%10s",Rates.get(i).get(j));
                System.out.println();
                System.out.printf("%21s","");
            }
            System.out.println();
        }



		int[][] books = {{1,2,3},{1,2,4},{2,1,5},{2,1,6},{1,1,7},{1,1,8},{2,2,9},{2,2,10}};
		Map<Integer,Map<Integer,List<Integer>>> h1 = new HashMap<>();
		for(Integer b:editionID)
		{
			h1.putIfAbsent(b, new HashMap<>());
			h1.get(b).putIfAbsent(categoryID.get(editionID.indexOf(b)),new ArrayList<List>());
			h1.get(b).get(editionID.indexOf(b)).add();
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
