import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Set up data with String Arrays
        String[] Month_31 = {
                "January", "Jan.", "Jan", "1",
                "March", "Mar.", "Mar", "3",
                "May", "5",
                "July", "Jul", "7",
                "August", "Aug.", "Aug", "8",
                "October", "Oct.", "Oct", "10",
                "December", "Dec.", "Dec", "12"
        };

        String[] Month_30 = {
                "April", "Apr.", "Apr", "4",
                "June", "Jun", "6",
                "September", "Sept.", "Sep", "9",
                "November", "Nov.", "Nov", "11"
        };

        String[] Month_2 = {"February", "Feb.", "Feb", "2"};



        while(true) {

            int inputYear;
            while(true){

                // Read year from user
                System.out.print("Enter Year: ");
                Scanner sYear = new Scanner(System.in);
                inputYear = sYear.nextInt();

                // If year of input is wrong (<=0) then read again
                if(inputYear > 0) break;
            }

            // Read month from user
            System.out.print("Enter Month: ");
            Scanner month = new Scanner(System.in);
            String strMonth = month.nextLine();

            // Loop through an array to find month
            for(String s : Month_31) {
                if(s.equals(strMonth)) {
                    System.out.println("Thang " + s + " Nam " + inputYear + " So ngay trong thang la: 31");
                    System.exit(0);
                }
            }

            // Loop through an array to find month
            for(String s : Month_30) {
                if(s.equals(strMonth)) {
                    System.out.println("Thang "+ s +" Nam " + inputYear + " So ngay trong thang la: 30");
                    System.exit(0);
                }
            }

            // Loop through an array to find month
            for(String s : Month_2) {
                if(s.equals(strMonth)) {
                    // Check Feb : 28 or 29
                    if(inputYear % 4 == 0 && inputYear % 100 != 0) {
                        System.out.println("Month " + s + " Year " + inputYear + " number of days in the month: 29");
                        System.exit(0);
                    }else {
                        System.out.println("Month " + s + " Year " + inputYear + " number of days in the month: 28");
                        System.exit(0);
                    }
                }
            }

            System.out.println("NOT EXIST\n");

        }

    }
}