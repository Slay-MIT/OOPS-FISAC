import java.util.Scanner;
import java.lang.Math;

/*tomorrow:
 total variable
 refine
 readable
 divide code 
 remove hardcodes
*/

interface details {
    void display();
    String city = "Manipal";
    String code ="KA20"; 
    Scanner dis = new Scanner(System.in);
    int total = 15;
    User[] list = new User[total];
}

class User implements details {
    char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static int a = -1;
    static int b = 0;
 
    String agency;
    String name;
    int idno=1;
    String vehiclemodel;
    String vehicletype;
    int numberplate;
    String finalnumberplate;
    int price;
    int tax;
    int pay;
    char new_ask;
    User() {
        a++;
        b++;
        idno++;
    }
    void form_filling() { 
        System.out.println("Enter your name: ");
        name = dis.nextLine();
        System.out.println("Enter the name of the agency:\n1. AUTONOMOUS BODY\n2. CENTRAL GOVERNMENT\n3. CHARITABLE TRUST\n4. DRIVING TRAINING SCHOOL\n5. DIVYANGJAN\n6. EDUCATIONAL INSTITUTE\n7. FIRM\n8. GOVERNMENT UNDERTAKING\n9. INDIVIDUAL\n10. LOCAL AUTHORITY\n11. MULTIPLE OWNER\n12. OTHERS\n13. POLICE DEPARTMENT\n14. STATE GOVERNMENT\n15. STATE TRANSPORT CORPORATION OR DEPARTMENT] ");
        agency = dis.nextLine();
        System.out.println("Enter the vehicle model: ");
        vehiclemodel = dis.nextLine();
        System.out.println("Enter the type of the vehicle: \nLMV (Light Motor Vehicle)\nMCWG (Motor Cycle With Gear) \nMCWOG (Motor Cycle Without Gear/ Scooter) \nHMV (Heavy Motor Vehicle) ");
        vehicletype = dis.nextLine();
        System.out.println("Enter the off-road price of your vehicle: ");
        price = dis.nextInt();
        tax = (int)0.12*price;
        numberplate = (int)(Math.random() * 10000);
        String str = Integer.toString(numberplate);
        finalnumberplate = code + arr[a] + arr[b] + numberplate;
        System.out.println(finalnumberplate);
        if(a==24 || b==24) {
            a=0;
            b=-1;
        }
        payment_details();
        char b;
        System.out.println("Do you wish to register another vehicle? (y/n)");
        new_ask = dis.next().charAt(0);
        if(new_ask=='y') {
         form_filling();
        }
        else {
         return;
        }
        
    }
    void payment_details() {
        System.out.println("Enter the method of Payment - 1. UPI, 2. Bank Transfer ");
        pay = dis.nextInt();
        System.out.println("Total amount due for registration is Rs."+tax);
        if(pay==1) {
           System.out.println("Pay the amount to - UPI ID: manipalrto@upi");
            
        }
        else if(pay==2) {
            System.out.println("Pay the amount to -\nCANARA BANK, GROUND FLOOR,\nPAVITHRA RESIDENCY OPP:MIT MANIPAL KARKALA MAIN ROAD,\nMANIPAL-576104 KA\nIFSC Code CNRB0003085");
        }
        else {
            System.out.println("Invalid Input!");
        }
        
    }
    
    public void display() {
        return;
    }
}
public class vehiclereg  {  
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inp;
        char a = 'y';
        int index=0;
        User[] obj1 = new User[15];
        System.out.println("1.User\n2.Admin\n3.Exit");
        inp = sc.nextInt();
        while(inp!=3) {
        if(inp==1) {
            System.out.println("Do you wish to register your vehicle (y/n)");
            a = sc.next().charAt(0);
            if(a=='y') {
                obj1[index] = new User();
                obj1[index].form_filling();
                index++;
            }
        }
        else if(inp==2){
            admin obj2 = new admin(obj1);
            //adminsearch obj3 = new adminsearch();
            obj2.ask();
        }
        //admin obj2 = new admin(obj1);
        //adminsearch obj3 = new adminsearch();
        //obj2.ask();
        
    }
        }

    }

class admin implements details{

    User[] ob = new User[total];
    int i;
    public void display(){return;}

    admin(User obj[]){
        for(i=0; i<total; i++){
            ob[i] = obj[i];
        }

        //to be removed later

       // System.out.println(ob[0].name);
    }
    //class adminsearch extends admin{

        // adminsearch(){
        //     super(list);
        // }    
        
        void display(int i){
            System.out.println("Name: "+ob[i].name+"\nVehicle Type: "+ob[i].vehicletype+"Number Plate: "+ob[i].finalnumberplate+"\n");
        }

        void ask(){
            //System.out.println(ob[0].name);
            System.out.println("enter 1 to search car types \nenter 2 to search number plate");
            int ch;
            String t;
            String n;
            ch = dis.nextInt();
            if(ch==1){
                System.out.println("enter type to be searched: ");
                t = dis.next();
                types(t);
            } 
            else if(ch==2){
                System.out.println("enter number to be searched: ");
                n = dis.next();
                number(n);               
            }
        }

        void types(String type){
            int i;
            for(i=0; i<1; i++){
                if(ob[i].vehicletype.equals(type)) display(i);
            }
        }

        void number(String number){
            int i;
            for(i=0; i<1; i++){
                if(number.equals(ob[i].finalnumberplate)) display(i);
            }
        }
    //}

    void doshit(){
        int ch;
        System.out.println("enter 1 to see list of users \nenter 2 to see types of cars");
        ch = dis.nextInt();
        switch(ch){
            case 1:
            break;

            case 2:
            //adminsearch a = new adminsearch();
           // a.ask();
            break;
        }
    }
}



/*
 user
 admin
 exit

 1 -

 register your vehicle
 contact details
 go back to previous menu

 1 -

 form filling
 car registered!


 */
