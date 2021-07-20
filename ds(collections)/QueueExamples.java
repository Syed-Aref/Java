import java.util.Queue;
import java.util.LinkedList;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(34);
        q.add(56);

        while (q.size()!=0){
            System.out.println(q.peek());
            q.remove();
        }

        q.add(43);
        q.add(89);

        while (q.size()!=0){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
