import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
       
       
       //creating new hashmap called phonebook
        HashMap<String ,Long>phonebook = new HashMap<String ,Long>();


        //adding key-value to the phonebook
       phonebook.put("rahul", 7972840112L);
       phonebook.put("Vishal", 7972897867L);
       phonebook.put("sheth", 1234567897L);
       phonebook.put("boss", 9092840112L);
      
      //removing element from hashmap based on key
       phonebook.remove("sheth");

       //replacing a value from hashmap
       phonebook.replace("boss", 9092840112L, 8793515000L);


       //printing values  ...
       System.out.println("iterating hashmap ....");
       for (Map.Entry m : phonebook.entrySet()){
           System.out.println(m.getKey() + "  " + m.getValue());
       }

    }
}
