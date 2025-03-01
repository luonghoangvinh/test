import java.util.*;
public class App {
    public void method1(String s)
    {
        if(s.length()>0) 
        {
            System.out.println(s);
            String[] sArray=s.split(" ");
            for(int i=0;i<sArray.length;i++)
            {

                System.out.println(sArray[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner Myobj= new Scanner(System.in);
        String n;
        n =Myobj.nextLine();
        App app= new App();
        System.out.println("ok ");
        app.method1(n);
        
    }
}

class Test{
    public void method1()
    {
        System.out.println("hello");
    }
}