import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class sortlist {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("raju","1","78","amber","bat", "c");
        List<String> sortedlList = list1.stream().sorted().collect(Collectors.toList());
        sortedlList.forEach(System.out::println);
        
    }
}
