import java.util.*;
class ArrList
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        
        ArrayList al2=new ArrayList();
        al2.add("pw");
        al2.add(20);
        al2.add('h');
        System.out.println(al2);
        
        ArrayList al3=new ArrayList();
        al3.add(30);
        al3.add("Ankit");
        al3.add(56);
        
        al3.addAll(al2);
        System.out.println(al3);
        al3.addAll(al);
        System.out.println(al3);
        
    }
}