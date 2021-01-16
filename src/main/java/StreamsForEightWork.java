import java.math.BigInteger;
import java.util.stream.Stream;

public class StreamsForEightWork {

    /**
     * упрощение за счет стрима
     */
    public static void main(String[] args) {

        Stream.of(3, 13, 25, 39, 41, 54)
                .map(StreamsForEightWork::factorialForMassive)
                .forEach(System.out::println);

    }

    /**
     * вычисление факториала
     */
    static BigInteger factorialForMassive(int x) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
