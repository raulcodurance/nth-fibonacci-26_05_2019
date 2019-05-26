import java.util.Arrays;
import java.util.stream.Collectors;

public class Fibonacci {
    public String generate(int nthNumber) {

        int[] sequence;

        if(nthNumber == 0){
            return "0";
        }else if(nthNumber == 1) {

            return "0 1";

        }else {

            sequence  = new int[nthNumber+1];
            sequence[0] = 0;
            sequence[1] = 1;
        }


        int counter = 2;
        while(counter <= nthNumber){

            sequence[counter] = sequence[counter-1] + sequence[counter-2];
            counter++;
        }

        return Arrays.stream(sequence)
                .boxed()
                .map(Object::toString)
                .collect(Collectors.joining(" "));

    }
}
