import java.util.Scanner;
import java.lang.Math;
interface details {
    void display();
    String city = "Manipal";
    String code ="KA20";
    Scanner dis = new Scanner(System.in);
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
    User() {
        a++;
        b++;
        idno++;
    }
    void form_filling() {
        System.out.println("Enter your name: ");
        name = dis.nextLine();
        System.out.println("Enter the name of the agency: ");
        agency = dis.nextLine();
        System.out.println("Enter the vehicle model: ");
        vehiclemodel = dis.nextLine();
        System.out.println("Enter the type of the vehicle: \nLMV (Light Motor Vehicle)\nMCWG (Motor Cycle With Gear) \nMCWOG (Motor Cycle Without Gear/ Scooter) \nHMV (Heavy Motor Vehicle) ");
        vehicletype = dis.nextLine();
        numberplate = (int)(Math.random() * 10000);
        String str = Integer.toString(numberplate);
        System.out.println(numberplate);
        finalnumberplate = code + arr[a] + arr[b] + numberplate;
        System.out.println(finalnumberplate);
        if(a==24 || b==24) {
            a=0;
            b=-1;
        }

    }
    public void display() {
        return;
    }
}
public class vehiclereg {
    public static void main(String args[]) {
        User[] obj1 = new User[4];
        obj1.form_filling();

    }
}

class admin implements details{
    admin(User obj1[]) {
    }
    class adminsearch extends admin{

        void display(User ob){
            System.out.println("name: "+ob.name+"\nvehicle type: "+ob.vehicletype+"number plate: "+ob.numberplate+"\n");
        }

        void ask(User list[], int total){
            System.out.println("enter 1 to search car types \nenter 2 to search number plate");
            int ch;
            ch = dis.nextInt();
            if(ch==1){
                System.out.println("enter type to be searched: ");
                String t;
                t = dis.nextLine();
                types(list, total, t);
            } 
            else if(ch==2){
                System.out.println("enter number to be searched: ");
                String n;
                n = dis.nextLine();
                number(list, total, n);               
            }
        }

        void types(User list[], int total, String type){
            int i;
            for(i=0; i<total; i++){
                if(list[i].vehicletype==type) display(list[i]);
            }
        }

        void number(User list[], int total, String number){
            int i;
            for(i=0; i<total; i++){
                if(number.equals(list[i].numberplate)) display(list[i]);
            }
        }
    }

    void doshit(){
        int ch;
        System.out.println("enter 1 to see list of users \nenter 2 to see types of cars");
        ch = dis.nextInt();
        switch(ch){
            case 1:
            break;

            case 2:
            adminsearch a = new adminsearch();
            a.ask(obj1[], obj1.idno);
            break;
        }
    }
}