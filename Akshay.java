import java.util.*;

class Akshay
{
    int a;
    Akshay(){
        a=10;
        System.out.println("This is default constructor \n Value of A = "+a);
    }
    Akshay(int a)
    {
        this.a=a;
        System.out.println("This is parameterized constructor \n Value of A = "+this.a);
    }
}
class overl
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = Integer.parseInt(sc.nextLine());
        Akshay d = new Akshay();
        Akshay k = new Akshay(a);
    }
}
