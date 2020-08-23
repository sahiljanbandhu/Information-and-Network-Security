
package vernamcipher;

import java.util.Scanner;

public class VernamCipher {

    
    public static void main(String[] args) {
        System.out.println("VERNAM CIPHER");
        System.out.println("Practical performed by <name>");
        VernamCipher v =new VernamCipher();
	Scanner s=new Scanner(System.in);
	System.out.println("Input Data to encypt:");
        String str = s.nextLine();
	System.out.println("Input the Pad");
	String pad =s.nextLine();
        String encrypted = v.encrypt(str, pad);
	System.out.println("Encrypted Data :" + encrypted);
        String decrypted = v.decrypt(encrypted, pad);
	System.out.println("Decrypted Data:" + decrypted);

    }

    String encrypt(String str, String pad) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int ve = str.charAt(i);
            ve=ve-97;
            
		int p=pad.charAt(i);
                p=p-97;
                 
		ve = ve + (p % 26);
                 
                if (ve > 26){
                    ve = ve - 26;
                }
                ve=ve+97;
                encrypted += (char) ve;
        }
        return encrypted;
    }
    String decrypt(String str, String pad) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int vd = str.charAt(i);
            vd=vd-97;
            
		int p=pad.charAt(i);
                
                p=p-97;
               
                vd = vd - (p % 26);
               
                if (vd < 0) {
                    vd = vd + 26;
                }
                vd=vd+97;
                decrypted += (char) vd;
        }
        return decrypted;
    }

}
    

