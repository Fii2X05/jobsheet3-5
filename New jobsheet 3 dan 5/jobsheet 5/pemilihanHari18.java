import java.util.Scanner;

public class pemilihanHari18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;
        System.out.print("input day name: ");
        dayName = sc.nextLine();
    
        switch (dayName.toLowerCase()){
            case "Monday":
            case "Tuesday":
            case "wednesday":
            case "Thursday":
            case "Friday":
                dayType = "Weekday";
                break;
            case "Saturday":
            case "Sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
    
    
            System.out.println(dayName + "is a" + dayType);
            
        } 
    }
}