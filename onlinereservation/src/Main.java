import java.io.BufferedReader;
import java.io.FileReader;
//import java.text.DateFormat;
//import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

 class verifyuserlogin extends reservation
{

void log (){

        Scanner sc = new Scanner(System.in);

            String username, password;
            System.out.print(" Enter Username :");
            username = sc.nextLine();
            System.out.print(" Enter Password :");
            password = sc.nextLine();
            String filepath = "data.txt";
            boolean loginsuccess = verifyuserlogin(username, password, filepath, ",");
            System.out.println(loginsuccess);

        }

public static boolean verifyuserlogin(String username,String password,String filepath,String delimiter)
{
String currentline;
String data[];
try {
    FileReader fr=new FileReader(filepath);
    BufferedReader br=new BufferedReader(fr);
    while ((currentline=br.readLine() )!=null)
    {
        data=currentline.split(delimiter);
       if (data[0].equals(username) && data[1].equals(password))
       {

           System.out.println("login successfull");


           return true;


       }
    }
}
catch (Exception e)
{
    System.out.println("login unsuccessfull");
}
return false;
}
}

class reservation {
    Scanner sc = new Scanner(System.in);
    static boolean[] seats = new boolean[10];

    void viewseat()
    {
        for (int i = 0; i<seats.length; i++)
        {
            if (seats[i])
            {
                System.out.print(" x ");
            }
            else
            {
                System.out.print(i+1+" ");
            }
            System.out.print(" ");
        }
    }

    void reserve() {
        int trainno;


        String from, to,dt;


        System.out.println("==================================================");
        System.out.println(" Train no :     Train name       ");
        System.out.println(" 17630    :  Pune Nanded Express    ");
        System.out.println(" 12116    :  Siddheshwar SF Express");
        System.out.println(" 17412    :  Mahalaxmi Express ");
        System.out.println(" 20706    :  Jalna Vande Bharat Express ");
        System.out.println("==================================================");
        System.out.print("Enter train number :");
        trainno = sc.nextInt();


        if (trainno == 17630 || trainno == 12116 || trainno == 17412 || trainno == 20706) {
            if (trainno == 17630) {
                Random r=new Random();
                int pnr=r.nextInt();
                System.out.println(" 17630    :  Nanded Pune Express");
                System.out.print("verify ");
                String dt1=sc.nextLine();
                System.out.print("\n Select class from sl A1 , A2 , B1 , B2 ");
                String cl = sc.nextLine();
                if (cl.equals("sl") || cl.equals("A1") || cl.equals("A2") || cl.equals("B1") || cl.equals("B2")) {
                    viewseat();

                }else {
                    System.out.println("wrong choice");
                    reserve();
                }
                System.out.print(" date :");
                dt=sc.nextLine();

                System.out.print("\nselect from : ");
                from=sc.nextLine();
                System.out.print("\nSelect to :   ");
                to=sc.nextLine();
                try {
                    if (from.equals("Nanded") && to.equals("Jalna"))
                    {
                        System.out.println("price = 200.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is"+pnr);
                    }
                    if (from.equals("Nanded") && to.equals("Manmad"))
                    {
                        System.out.println("price = 260.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is"+pnr);
                    }
                    if (from.equals("Nanded") && to.equals("Pune"))
                    {
                        System.out.println("price = 320.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is " +pnr);
                    }
                }catch (Exception e){
                    System.out.println("wrong choice");
                }
            }

            if (trainno == 12116) {
                Random r=new Random();
                int pnr=r.nextInt();
                System.out.println(" 12116    :  Siddheshwar SF Express");
                System.out.print("verify ");
               String dt1=sc.nextLine();
                System.out.print("\n Select class from sl A1 , A2 , B1 , B2 ");
                String cl = sc.nextLine();
                    if (cl.equals("sl") || cl.equals("A1") || cl.equals("A2") || cl.equals("B1") || cl.equals("B2")) {
                        viewseat();

                    }else {
                        System.out.println("wrong choice");
                        reserve();
                    }
                System.out.print(" date :");
                dt=sc.nextLine();

                System.out.print("\nselect from : ");
                from=sc.nextLine();
                System.out.print("\nSelect to :   ");
                to=sc.nextLine();
               try {
                   if (from.equals("solapur") && to.equals("jeur"))
                   {
                       System.out.println("price = 200.0 RS");
                       System.out.println("Your ticket is booked. ");
                       System.out.println("Hope you enjoy the ride.");
                       System.out.println("your pnr number is"+pnr);
                   }
                   if (from.equals("solapur") && to.equals("pune"))
                   {
                       System.out.println("price = 260.0 RS");
                       System.out.println("Your ticket is booked. ");
                       System.out.println("Hope you enjoy the ride.");
                       System.out.println("your pnr number is"+pnr);
                   }
                   if (from.equals("solapur") && to.equals("csmt"))
                   {
                       System.out.println("price = 320.0 RS");
                       System.out.println("Your ticket is booked. ");
                       System.out.println("Hope you enjoy the ride.");
                       System.out.println("your pnr number is " +pnr);
                   }
               }catch (Exception e){
                   System.out.println("wrong choice");
               }



            }
         if (trainno == 17412) {

             Random r=new Random();
             int pnr=r.nextInt();
             System.out.println(" 17412    :  Mahalaxmi Express ");
             System.out.print("verify ");
             String dt1=sc.nextLine();
             System.out.print("\n Select class from sl A1 , A2 , B1 , B2 ");
             String cl = sc.nextLine();
             if (cl.equals("sl") || cl.equals("A1") || cl.equals("A2") || cl.equals("B1") || cl.equals("B2")) {
                 viewseat();

             }else {
                 System.out.println("wrong choice");
                 reserve();
             }
             System.out.print(" date :");
             dt=sc.nextLine();

             System.out.print("\nselect from : ");
             from=sc.nextLine();
             System.out.print("\nSelect to :   ");
             to=sc.nextLine();
             try {
                 if (from.equals("kolhapur") && to.equals("satara"))
                 {
                     System.out.println("price = 200.0 RS");
                     System.out.println("Your ticket is booked. ");
                     System.out.println("Hope you enjoy the ride.");
                     System.out.println("your pnr number is"+pnr);
                 }
                 if (from.equals("kolhapur") && to.equals("pune"))
                 {
                     System.out.println("price = 260.0 RS");
                     System.out.println("Your ticket is booked. ");
                     System.out.println("Hope you enjoy the ride.");
                     System.out.println("your pnr number is"+pnr);
                 }
                 if (from.equals("kolhapur") && to.equals("csmt"))
                 {
                     System.out.println("price = 320.0 RS");
                     System.out.println("Your ticket is booked. ");
                     System.out.println("Hope you enjoy the ride.");
                     System.out.println("your pnr number is " +pnr);
                 }
             }catch (Exception e){
                 System.out.println("wrong choice");
             }
         }

            if (trainno == 20706) {

                Random r=new Random();
                int pnr=r.nextInt();
                System.out.println(" 20706    :  Jalna Vande Bharat Express ");
                System.out.print("verify ");
                String dt1=sc.nextLine();
                System.out.print("\n Select class from sl A1 , A2 , B1 , B2 ");
                String cl = sc.nextLine();
                if (cl.equals("sl") || cl.equals("A1") || cl.equals("A2") || cl.equals("B1") || cl.equals("B2")) {
                    viewseat();

                }else {
                    System.out.println("wrong choice");
                    reserve();
                }
                System.out.print(" date :");
                dt=sc.nextLine();

                System.out.print("\nselect from : ");
                from=sc.nextLine();
                System.out.print("\nSelect to :   ");
                to=sc.nextLine();
                try {
                    if (from.equals("mumbai") && to.equals("aurangabad"))
                    {
                        System.out.println("price = 1289.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is"+pnr);
                    }
                    if (from.equals("mumbai") && to.equals("manmad"))
                    {
                        System.out.println("price = 2260.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is"+pnr);
                    }
                    if (from.equals("mumbai") && to.equals("jalna"))
                    {
                        System.out.println("price = 2820.0 RS");
                        System.out.println("Your ticket is booked. ");
                        System.out.println("Hope you enjoy the ride.");
                        System.out.println("your pnr number is " +pnr);
                    }
                }catch (Exception e){
                    System.out.println("wrong choice");
                }

            }
        } else {
            System.out.println(" wrong choice for train number");
        }


    }

    // cancel ticket

    void cancel(){ String name,from,to;
        int noofseats,pnr,trainno;
        System.out.print("Enter train number :");
        trainno = sc.nextInt();


        if (trainno == 17630 || trainno == 12116 || trainno == 17412 || trainno == 20706) {
            if (trainno == 17630){

        System.out.println("Enter number of seats you want to cancel :");
        noofseats=sc.nextInt();
        for (int i=0;i<noofseats;i++)
        {
            System.out.println("enter the seat number you want to cancel:");
            int seatnumber=sc.nextInt();
            System.out.println("------------------enter passenger details :----------------------");
            System.out.println("enter passenger's name: ");
            name=sc.next();

            System.out.println("From :");
            from=sc.next();
            System.out.println("To :");
            to=sc.next();
            if (name.equals(name)  && from.equals(from) && to.equals(to))
            {
                if (seatnumber < 1 || seatnumber > 10) {
                    System.out.println("wrong choice");
                } else if (!seats[seatnumber - 1]) {
                    System.out.println("seat not reserved");
                } else {
                    seats[seatnumber - 1] = false;
                    System.out.println("reservation canceled");
                }
                System.out.println("ticket cancelled ..");
                if (from.equals("nanded") && to.equals("jalna"))
                {
                    System.out.println("Refund = 180.0 RS");
                }
                else if (from.equals("nanded") && to.equals("manmad"))
                {
                    System.out.println("Refund = 220.0 RS");
                }
                else if(from.equals("nanded") && to.equals("pune"))
                {
                    System.out.println("Refund = 260.0 RS");
                }
            }
            else {
                System.out.println("enter right details ");

            }
            }

        }
        }

        if (trainno == 12116){

            System.out.println("Enter number of seats you want to cancel :");
            noofseats=sc.nextInt();
            for (int i=0;i<noofseats;i++)
            {
                System.out.println("enter the seat number you want to cancel:");
                int seatnumber=sc.nextInt();
                System.out.println("------------------enter passenger details :----------------------");
                System.out.println("enter passenger's name: ");
                name=sc.next();

                System.out.println("From :");
                from=sc.next();
                System.out.println("To :");
                to=sc.next();
                if (name.equals(name)  && from.equals(from) && to.equals(to))
                {
                    if (seatnumber < 1 || seatnumber > 10) {
                        System.out.println("wrong choice");
                    } else if (!seats[seatnumber - 1]) {
                        System.out.println("seat not reserved");
                    } else {
                        seats[seatnumber - 1] = false;
                        System.out.println("reservation canceled");
                    }
                    System.out.println("ticket cancelled ..");
                    if (from.equals("solapur") && to.equals("jeur"))
                    {
                        System.out.println("Refund = 180.0 RS");
                    }
                    else if (from.equals("solapur") && to.equals("pune"))
                    {
                        System.out.println("Refund = 220.0 RS");
                    }
                    else if(from.equals("solapur") && to.equals("csmt"))
                    {
                        System.out.println("Refund = 260.0 RS");
                    }
                }
                else {
                    System.out.println("enter right details ");

                }
            }

        }
    }

    }


    public class Main {
        public static void main(String[] args) {
            verifyuserlogin l = new verifyuserlogin();
            l.log();
            reservation r = new reservation();


            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("-----------------Enter your choice : -------------");
                System.out.println("1.View Seat Arrangement :");
                System.out.println("2.Book ticket :");
                System.out.println("3.Cancel your Reservation:");
                System.out.println("4.Exit :");
                int op=sc.nextInt();
                switch(op)
                {
                    case 1 -> l.viewseat();



                    case 2 ->l.reserve();


                    case 3-> l.cancel();



                    case 4->System.exit(0);


                    default -> System.out.println(" koi itta galat kese ho sakta hai bhai ");


                }
            }
        }
    }
