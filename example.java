import java.util.*;
public class example 
{
    static List<List<Integer>> New_edition_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_category_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_Rates = new ArrayList<List<Integer>>();
    public static void main(String[] args) 
    {
        Scanner read=new Scanner(System.in);
       
        List<Integer> editionID =new ArrayList<Integer>();
        List<Integer> categoryID =new ArrayList<Integer>();
        List<Integer> Rates =new ArrayList<Integer>();

        System.out.println("Enter the length of data:");
        int n=read.nextInt();

        System.out.println("Enter the rates:");
        int n_of_rates=read.nextInt();

        System.out.println("Enter the data in sequence of editionID, categoryID, Rates:");
        for(int i=0; i<n ;i++)
        {
            editionID.add(read.nextInt());
            categoryID.add(read.nextInt());
            for(int j=0;j<n_of_rates;j++)
            {
                Rates.add(read.nextInt());
            }
            System.out.println();
        }

        int counter=0;
        System.out.printf("%10s %10s %10s", "Edition", "Category", "Rates");
        System.out.println();
        for (int i=0; i <n ; i++) 
        {
            System.out.printf("%10s %10s",editionID.get(i),categoryID.get(i));
            for(int j=counter;j<n_of_rates;j++)
            {
                System.out.printf("%10s",Rates.get(j));
                System.out.println();
                System.out.printf("%21s","");
            }
            counter=n_of_rates;
            n_of_rates+=n_of_rates;
            System.out.println();   
        }
        // combine(editionID,categoryID,Rates);
        // printcombination();
        read.close();
    }    
}
