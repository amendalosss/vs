import java.util.*;
public class ListPractice
{
    public static void main(String[] args) 
    {
        List<List<Integer>> x=new ArrayList<List<Integer>>();
        Scanner read=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            x.add(new ArrayList<>());
            for(int j=0;j<3;j++)
            {
                x.get(i).add(j,read.nextInt());
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(x.get(i).get(j)); 
            }
            System.out.println();
        }      
    }
}