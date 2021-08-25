import java.util.*;

public class addlist {
    public static void main(String[] args) {
        LinkedList<Integer> addll = new LinkedList<Integer>();
        addll.addFirst(1);
        addll.addLast(11);
        System.out.println("first list : " + addll);

        //adding a specific position in list 
        addll.add(1,2);
        addll.add(2,3);

        System.out.println("second updated list : " + addll);

        //creating second list and adding to first list at specific postion
        LinkedList<Integer> all = new LinkedList<Integer>();
        all.add(4);
        all.add(5);
        all.add(6);
        all.add(7);
        all.add(8);
        all.add(9);
        all.add(10);
        addll.addAll(3,all);
        System.out.println("updated list with second list: " + addll);

        //removing items from the list
        addll.remove(2);
        System.out.println("removed 2 " + addll);
        Iterator i = addll.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }








        
    }
}
