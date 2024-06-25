import java.util.Scanner;

public class ComparePass {
    public static void main(String[] args){
        ComparePass obj = new ComparePass();
        Scanner sc = new Scanner(System.in);

        String oldPass = sc.nextLine();
        String newPass = sc.nextLine();

        sc.close();

        obj.comparison(oldPass, newPass);

    }
    public Boolean comparison(String pass1, String pass2){
        int len1 = pass1.length();
        int len2 = pass2.length();
        int min = ((len1 < len2)?len1:len2);
        int max = ((len1 > len2)?len1:len2);
        
        if(pass1.equals(pass2)){      //Checking whether both passwords are same.
            System.out.println("Both passwords are same");
            return false;
        } 

        if((max-min) > 3){        
            System.out.println("Passwords are different");
            return true;
        }
        int flag = 0;
        int diff = max - min;
        for(int i = 0; i < min; i++)    
        {
            if(pass1.charAt(i)!=pass2.charAt(i)){     //Checking strings char by char.
                flag += 1;
            }
        }
        flag += diff;
        if(flag <= 3){
            System.out.println("Password must be differ atleast by three charcters");
            return false;
        } 
        else{
            System.out.println("Congratulations!!! your password changed successfully....");
            return true;
        }
    }
}
