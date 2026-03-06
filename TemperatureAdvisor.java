import java.util.Scanner;
public class TemperatureAdvisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current temperature in celcius ");
        int temperature = sc.nextInt();

        if(temperature > 35){
         System.out.print("It's too hot! ");
        }
        else if(temperature >= 25){
         System.out.print("It's warm! ");
        }
        else if(temperature >= 15){
            System.out.print("It's pleasant! ");
        }
        else {
        System.out.println("It's cold! ");
        }
        sc.close();

    }
}
