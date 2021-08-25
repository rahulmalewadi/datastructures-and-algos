import java.util.*;

public class linkdlist {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("a");
        al.add("p");
        al.add("p");
        al.add("l");
        al.add("e");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
