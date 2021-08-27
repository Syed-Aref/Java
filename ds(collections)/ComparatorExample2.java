import java.util.ArrayList;
import java.util.Comparator;

class ClassA{
    int x,y;
    ClassA(int x,int y){
        this.x = x;
        this.y = y;
    }


}

class ClassA_Comparator implements Comparator<ClassA> {

    public int compare(ClassA a1,ClassA a2)
    {
        if(a1.x != a2.x) return a1.x - a2.x;
        else return a1.y - a2.y;
    }
}


public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<ClassA> al = new ArrayList<>();

        al.add( new ClassA(12,345) );
        al.add( new ClassA(23,131) );
        al.add( new ClassA(2424,131) );
        al.add( new ClassA(1,1) );

        System.out.println("Before sorting");
        for(ClassA ca : al){
            System.out.println("("+ca.x+" , "+ca.y+")");
        }
        System.out.println("Before sorting");
        System.out.println();

        al.sort(new ClassA_Comparator());

        System.out.println("After sorting");
        for(ClassA ca : al){
            System.out.println("("+ca.x+" , "+ca.y+")");
        }


    }
}
