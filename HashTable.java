import java.util.*;
class HTable
{
    public static void main(String args[])
    {
        Hashtable ht=new Hashtable();
        ht.put(01, "Raman");
        ht.put(02, "Aman");
        ht.put(03, "Subham");
       // ht.put(null, "Alok");         //null value is not allowed
       
       ht.putIfAbsent(2, "Aman");
        System.out.println(ht);
    }
}