
///package pack;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
class PAIR
{
    int value,times;
    public PAIR(int v,int t)
    {
        value = v;
        times = t;
    }
}


public class ComparatorExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(45);
        ali.add(6);
        ali.add(34);
        ali.add(45);
        ali.add(12);
        Collections.sort(ali,new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                return b-a;
            }
        });
        /*

        b-a = descending
        a-b = ascending
         */
        for(Integer i : ali) System.out.print(i + " ");
        System.out.println();


        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(6);
        al.add(34);
        al.add(45);
        al.add(12);

        Collections.sort(al,new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                return a-b;
            }
        });
        for(Integer i : al) System.out.print(i + " ");
        System.out.println();

        LinkedList<PAIR> p = new LinkedList<PAIR>();
        p.add(new PAIR(45,3));
        p.add(new PAIR(4,33));
        p.add(new PAIR(15,32));
        p.add(new PAIR(18,9));
        Collections.sort(p,new Comparator<PAIR>(){
            public int compare(PAIR p1,PAIR p2)
            {
                return p2.times - p1.times;
            }
        });
        for(PAIR pair : p) System.out.println("("+pair.value+","+pair.times+")");
    }
}
