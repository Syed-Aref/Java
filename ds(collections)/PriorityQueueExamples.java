import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueExamples {
    public static void main(String[] args) {

        /// Ascending-ordered integer queue
        /// Default order is also ascending order
        PriorityQueue< Integer > pq1 = new PriorityQueue<>( new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                return a-b;
            }
        });
        // a-b => Ascending order

        pq1.add(89);
        pq1.add(56);
        pq1.add(98);
        pq1.add(23);

        while (pq1.size()!=0){
            System.out.println(pq1.peek());
            pq1.poll();
        }


        /// Descending ordered integer queue
        PriorityQueue< Integer > pq2 = new PriorityQueue<>( new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                return b-a;
            }
        });
        // b-a => Descending order

        pq2.add(89);
        pq2.add(56);
        pq2.add(98);
        pq2.add(23);
        System.out.println("-------------------");
        while (pq2.size()!=0){
            System.out.println(pq2.peek());
            pq2.poll();
        }

        /// Descending ordered String queue
        PriorityQueue< String > pqs = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               int i = 0;
               for(;i<Math.min( o1.length(),o2.length() );i++){
                   if( o1.charAt(i)==o2.charAt(i) ) continue;
                   return (o2.charAt(i)+0)-(o1.charAt(i)+0);
               }
               if(o1.length()==o2.length()) return 0;
               if( i==o1.length() ){
                   return (o2.charAt(i)+0) - (-1);
               }
               else {
                   return -1 - (o1.charAt(i));
               }

            }
        });

        pqs.add("zzz");
        pqs.add("zzz");
        pqs.add("zzzb");
        pqs.add("aa");
        pqs.add("a");

        System.out.println("-------------------");
        while (pqs.size()!=0){
            System.out.println(pqs.peek());
            pqs.poll();
        }




    }
}
