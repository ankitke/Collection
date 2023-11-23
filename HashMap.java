import java.util.*;
class HMap
{
    public static void main(String args[])
    {
        HashMap hm1=new HashMap();
        hm1.put(01, "Ankit");
        hm1.put(02, "Rohit");
        hm1.put(03, "Rahul");
       // hm1.put(02, "Ankit");
        System.out.println(hm1);
        
        HashMap hm2=new HashMap();
        hm2.put("Ankit", "Keshri");
        hm2.put("Rohit", 02);
        hm2.put("Pryanshi", 10);
        hm2.put(null, null);
        System.out.println(hm2);
    }
}