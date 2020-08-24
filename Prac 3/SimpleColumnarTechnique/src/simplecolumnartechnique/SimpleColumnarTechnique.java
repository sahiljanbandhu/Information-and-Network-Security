
package simplecolumnartechnique;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleColumnarTechnique 
{
    public static void main(String[] args) 
    {
        try 
        {
            System.out.println("INS Practical performed by SAHIL JANBANDHU");
            System.out.println("----*--Simple Column transposition--*---");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your plain text");
            String accept = br.readLine();
            System.out.println("Enter the no of rows ");
            int r = Integer.parseInt(br.readLine());
            System.out.println("Enter the no of cols");
            int c = Integer.parseInt(br.readLine());
            int count = 0;
            char cont[][] = new char[r][c];
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    cont[i][j] = accept.charAt(count);
                    count++;
                }
            }
            System.out.println("\nEnter the order of cols you want to view them in");
            int choice[] = new int[c];
            for (int k = 0; k < c; k++) 
            {
                System.out.println("Choice " + k + "-> ");
                choice[k] = Integer.parseInt(br.readLine());
            }
            String cipher = "", plain = "";
            for (int j = 0; j < c; j++) 
            {
                int k = choice[j];
                for (int i = 0; i < r; i++) 
                {
                    cipher += cont[i][k];
                }
            }
            cipher = cipher.trim();
            System.out.println("Cipher Text: "+cipher);
            char mat[][] = new char[r][c];
            int t = 0;
            for (int j = 0; j < c; j++) 
            {
                int k = choice[j];
                for (int i = 0; i < r; i++) 
                {
                    mat[i][k] = cipher.charAt(t++);
                }
            }
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    plain += mat[i][j];
                }
            }
            plain = plain.trim();
            System.out.println("Plain text: "+plain);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(SimpleColumnarTechnique.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
