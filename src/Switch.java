import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int daysInMonth;	
		int months = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter days in the month");
		daysInMonth=keyboard.nextInt();
        String monthName;
        
        if(daysInMonth==28||daysInMonth==29){
        months = 1;	
        }
        else if(daysInMonth==30){
        	months = 2;
        }
        else if (daysInMonth==31){
        	months=3;
        }
        else{
        	System.out.print("Invalid response");
        }
        
        switch (months) {
            case 1:  monthName = "Feb";//28
                     break;
            case 2:  monthName = "Apr, June, Sept, Nov";//30
                     break;
            case 3:  monthName = "March,  May, Jul, Aug, Oct, Dec";//31
                     break;
           
            default: monthName = "Unknown";
                     break;
        }
        System.out.println(monthName);
	}

}
