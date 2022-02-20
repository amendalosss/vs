import java.util.*;
public class test 
{
    static List<List<Integer>> New_edition_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_category_ID = new ArrayList<List<Integer>>();
    static List<List<Integer>> New_Rates = new ArrayList<List<Integer>>();

    public static void combine(List<Integer> edID,List<Integer> catID,List<List<Integer>> rate) 
    {
        for(int i=0;i<edID.size();i++)
        {
            New_edition_ID.add(new ArrayList<>());
            New_category_ID.add(new ArrayList<>());
            New_Rates.add(new ArrayList<>());
            for(int j=i+1;j<edID.size();j++)
            {
                if(edID.get(i)==edID.get(j))
                {
                    New_edition_ID.get(i).add(j,(int)edID.get(j));
                    New_category_ID.get(i).add(j,(int)catID.get(j));
                    // for(int k=0;k<rate.get(0).size();k++)
                    // {
                    //     New_Rates.get(i).add(k,(int)rate.get(j).get(k));
                    // }
                }
            }
        }
        System.out.printf("%10s %10s %10s", "New Edition", "New Category", "New Rates");
        System.out.println();
        // for(int i=0;i<New_edition_ID.size();i++)
        // {
        //     for(int j=0;j<New_Rates.size();j++)
        //     {
        //         System.out.printf("%10s",New_edition_ID.get(i).get(j));
        //         System.out.println();
        //         System.out.printf("%21s","");
        //         System.out.printf("%20s",New_edition_ID.get(i).get(j));
        //         System.out.println();
        //         System.out.printf("%31s","");
        // // //         for(int k=0;k<New_Rates.get(0).size();k++)
        // // //         {
        // // //             System.out.printf("%30s",New_Rates.get(i).get(k));
        // // //             System.out.println();
        // // //             System.out.printf("%41s","");
        // // //         }
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
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
        combine(editionID,categoryID,Rates);

    }   
}
