import java.util.*;
public class example 
{
    static List<List<Integer>> New_edition_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_category_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_Rates = new ArrayList<List<Integer>>();

    public static void combine(List<Integer> edID,List<Integer> catID,List<Integer> rates) 
    {
        int j=0;
        int i=0;
        for (i = 0; i <edID.size();i++) 
        {
            for(j=1; j<=edID.size();j++)
            {
                if(edID.get(i)==edID.get(j))
                {
                    New_edition_ID.get(i).add(i,edID.get(j));
                    New_category_ID.get(i).add(i,catID.get(i));
                    for(int k=0;k<rates.size();k++)
                    {
                        New_Rates.get(i).add(i,rates.get(k));
                    }
                }    
            }
        }
    }

    // public static void printcombination() 
    // {
    //     System.out.println("New combined data is:");
    //     System.out.printf("%10s %10s %10s", "Edition", "Category", "Rates");
    //     System.out.println();
    //     for(int i=0;i<New_edition_ID.size();i++)
    //     {
    //         for(int j=0;j<New_edition_ID.size();j++)
    //         {
    //             System.out.printf("%10s","");
    //             System.out.printf("%1s",New_edition_ID.get(i).get(j));
    //             System.out.printf("%20s","");
    //             System.out.printf("%1s",New_category_ID.get(i).get(j));
    //             System.out.printf("%10s","");
    //             System.out.printf("%1s",New_Rates.get(i).get(j));
    //             System.out.println();
    //         }
    //     }
    // }
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
        combine(editionID,categoryID,Rates);
        // printcombination();
        read.close();
    }    
}
