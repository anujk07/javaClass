import java.util.Scanner;
public class word {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print("number of word in string " + count_words(str)+"\n");
    }

 public static int count_words(String str)
    {
       int a = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    a++;
                }
            }
            a++; 
        
        return a; 
    }
 }