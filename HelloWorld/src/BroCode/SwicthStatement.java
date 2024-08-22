package BroCode;

public class SwicthStatement {
    public static void main(String[]args){
        String day = "Sunday";

        switch(day){
            case "Sunday": System.out.println("it is Sunday");
            break;
            case "Monday": System.out.println("it is Monday");
            break;
            case "Tuesaday": System.out.println("it is Tuesaday");
                break;
            case "Wednesday": System.out.println("it is Wednesday");
                break;
            case "Thursday": System.out.println("it is Thursday");
                break;
            case "Friday": System.out.println("it is Friday");
                break;
            case "Saturday": System.out.println("it is Saturday");
                break;
            default:
                System.out.println("That is not a day");
        }
    }
}
