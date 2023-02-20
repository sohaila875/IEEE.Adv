
package javaapplication45;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class JavaApplication45 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
            int option;
            Scanner in =new Scanner(System.in);
            Geometry G1 = new Geometry();
           
            
                System.out.println("1.Calculate the Area of a Circle ");
                System.out.println("2.Calculate the Area of a Rectangle ");
                System.out.println("3.Calculate the Area of a Triangle ");
                System.out.println("4.Quit");
                System.out.println("Enter Your Choice (1-4)");
                option=in.nextInt();
                PrintWriter pr=new PrintWriter("out.txt");
                if(option==1||option==2||option==3||option==4){
                  
                    
                switch(option){
                    case 1:{
                        System.out.println("Enter Radius");
                        double r=in.nextDouble();
                        System.out.println(G1.circleArea(r));
                        double t=G1.circleArea(r);
                        pr.print(t);
                        pr.flush();
                        
                        break;
                    }
                    case 2:{
                        System.out.println("Enter length");
                        double l=in.nextDouble();
                        System.out.println("Enter width");
                        double w=in.nextDouble();
                        System.out.println(G1.rectangleArea(l,w));
                        
                        break;
                    }
                    case 3:{
                        System.out.println("Enter height");
                        double h=in.nextDouble();
                        System.out.println("Enter base");
                        double b=in.nextDouble();
                        System.out.println(G1.triangleArea(h, b));
                        break;
                    }
                    case 4:{
                        break;
                    }
                    default:
                        System.out.println("Invalid Option");
                        
                }
                 
            
                }
                else{
                    System.out.println("in valid option");
                }
            
        }
        catch(InValidAmontExeption iae){
            System.out.println(iae.getMessage());
        }
    }
    
}
