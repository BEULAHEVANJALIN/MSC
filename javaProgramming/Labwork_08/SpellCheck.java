import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpellCheck {

    static class Tuple implements Comparator<Tuple> {
        String _1;
        String _2;
        int _3;

        Tuple(String one,String two,int three){
            _1 = one;
            _2 = two;
            _3 = three;
        }

        @Override
        public int compare(Tuple o, Tuple t) {
            return o._3 - t._3;
        }
    }

    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        var table = new int[str1.length()+1][str2.length()+1];

        // initialise column 0
        for (int i=0;i <= str1.length();i++) {
            table[i][0] = i;
        }

        // initialise row 0
        for (int i=0;i <= str2.length();i++) {
            table[0][i] = i;
        }

        for (int i=1; i <= str1.length();i++) {
            for(int j=1; j<= str2.length(); j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1];
                }else {
                    table[i][j] = 1 + Math.min(
                            table[i-1][j-1], Math.min(
                                    table[i][j-1],
                                    table[i-1][j])
                    );
                }
            }
        }
        return table[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        File f = new File("enable1.txt");
        ArrayList<String> dictionary = new ArrayList<>(172820);
        Scanner input = new Scanner(System.in);

        try {
            Scanner reader =  new Scanner(f);
            while(reader.hasNextLine()) {
                dictionary.add(reader.next());
            }
            reader.close();
        }catch(FileNotFoundException e) {
            System.out.println(e.toString());
        }

        while (true) {
            System.out.println("Enter text");
            var dictStream = dictionary.parallelStream();
            var word = input.next();
            var suggestions =
                    dictStream.map(x -> new Tuple(word,x,levenshteinDistance(x,word))).
                    sorted(
                            (x,y) -> x.compare(x,y)
                    ).
                    limit(5).
                    collect(Collectors.toList());
            System.out.println("the suggestions are .....");
            for (Tuple s : suggestions) {
                System.out.println(s._2);
            }
            System.out.println();
        }

    }
}

