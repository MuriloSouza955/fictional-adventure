package streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;


        Stream<String>lang = Stream.of("Java ", "Lua ", "JS \n");
        lang.forEach(print);

        String[] maisLang = {"Pyton ", "Lisp ", "Pearl ", "Go\n"};

        Stream.of(maisLang).forEach(print);
        Arrays.stream(maisLang).forEach(print);
        Arrays.stream(maisLang, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

/*        Stream.generate( () -> "a").forEach(print);
 *        Stream.iterate(0, n -> n+1).forEach(println);
*/
    }
}
