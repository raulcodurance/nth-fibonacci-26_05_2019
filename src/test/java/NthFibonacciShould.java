import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NthFibonacciShould {

    // F0	F1	F2	F3	F4	F5	F6	F7	F8
    // 0	1	1	2	3	5	8	13	21

    @Test
    public void return_0_as_string_when_generate_0_th_fibonacci_numbers() {

        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.generate(0), is("0"));
    }
}
