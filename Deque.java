import java.util.*;
class Deq
{
    public static void main(String args[])
    {
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);
        
        ad1.addFirst(10);
        ad1.addLast("Ak");
        System.out.println(ad1);
        
        ad1.offer(14);
        ad1.offerLast(10);
        ad1.offerFirst(500);
        System.out.println(ad1);
    }
}