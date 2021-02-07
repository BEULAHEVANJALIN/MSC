// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-6
// Date : 02/08/2020
// Removing of duplicate elements from the array without original order preservation by maintain the second appearance
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SecondAppearance {

    public static List<Integer> secondAppearance (List<Integer> array) {

        Map<Integer,Integer> frequency = new HashMap<>();
        Map<Integer,Integer> secondIndx = new HashMap<>();

        for (int i=0; i < array.size(); i++) {
            int e = array.get(i);
            if (frequency.containsKey(e)) {
                frequency.put(e,frequency.get(e)+1);

            } else {
                frequency.put(e,1);
            }

            if (frequency.get(e) == 2) {
                secondIndx.put(e, i);
            }
        }
        List<Integer> result = new ArrayList<>();

        for (int i =0; i<array.size();i++) {
            int e = array.get(i);

            if (secondIndx.containsKey(e)) {
                if (i == secondIndx.get(e)) {
                    result.add(e);
                }
            } else {
                // elements with no duplicates
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i < 15; i++) {

            array.add(random.nextInt(7));            // 0 to 7
        }
        System.out.println(array);
        System.out.println(secondAppearance(array));
    }
}