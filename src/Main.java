import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(0,1,2));
        System.out.println(symmetricDifference(set1, set2));
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> set3 = new HashSet<>(set1);
        for (Integer integer : set2) {
            if (set3.contains(integer)) set3.remove(integer);
            else set3.add(integer);
        }
        return set3;
    }
}