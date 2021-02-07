// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-6
// Date : 02/08/2020
// printing an ARRAY after removing all duplicate values with original order preserved.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class RemoveDuplicatesTheRightWay {
    public static List<Integer> removeDuplicates(List<Integer> array) {
        Set<Integer> elements = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        // elements variable is of type Set eventhough the object it refers to is of type Hashset
        // This is allowed because HashSet is also a Set
        for (int e: array) {
            if (!elements.contains(e)) {
                elements.add(e);
                result.add(e);
            }
        }
        /* for (int e: array) {
             if (!result.contains(e)) {
                 result.add(e);
             }
         	} // space complexity is n because sizeof(result) <=n	*/
        return result;
    }	
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            array.add(random.nextInt(5));	// 0 to 5
        }
        System.out.println(array);
        System.out.println(removeDuplicates(array));
    }
}