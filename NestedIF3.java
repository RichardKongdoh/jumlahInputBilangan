package nestedif3;

import java.util.Scanner;

public class NestedIF3 {

    
    public static void main(String[] args) {
      int a,x,y,z;
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("masukkan angka = ");
        a = key.nextInt();
        if (a <=1000 && a >= 0){
            x = a % 10;
            a = a / 10;           
            
            if (a <= 100){
                y = a % 10;
                a = a / 10; 
                
                if (a <= 10){
                    z = a % 10;                
                    
                    System.out.println(x+y+z);
                }           
            }
        } else {
            System.out.println("inpuet angka <= 1000 atau >=0");
        }
    }
    
}
