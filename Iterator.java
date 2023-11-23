import java.util.*;
class Iterator
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(100);
        al.add(30);
        al.add(50);
        al.add(20);
        System.out.println(al);
        
        // for(Object o: al)
        // {
        //     System.out.println(o);
        // }
        
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous);
        }
    }
}