 import java.util.*;
 class books{
     int id , quantity;
     String name , author ,genre;

    public books(int myid , int myquantity , String myname , String myauthor,String mygenre){
        id = myid;
        quantity = myquantity;
        name = myname;
        author = myauthor;
        genre = mygenre;
    }
 }



public class examplelist {
    public static void main(String[] args) {
        List<books>list = new LinkedList<books>();
        books b1 = new books(1, 10, "harry potter", "j.k.rowling", "adventure");
        books b2 = new books(2, 22, "game of thrones", "george martin", "drama");


        list.add(b1);
        list.add(b2);

        for (books b : list){
            System.out.println(b.id + "    " + b.quantity + "   " + b.name + "   " + b.author + "    " + b.genre);
        }
    }
}
