import java.sql.SQLOutput;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String name = "gjfhjf@gmail.com";

        Optional<String> optionalName = Optional.of(name);
          optionalName.ifPresent(System.out::println);

        String na = null;
        Optional<String> optional = Optional.ofNullable(na);
        String defaultoptional =  optional.orElseGet(() ->"eufd@gmail.com");
        System.out.println(defaultoptional);

        Optional<String> optional2 = Optional.empty();

        Optional<String> optional3 = Optional.ofNullable(na);
        //String Objectoptional = optional3.orElseThrow(()->new IllegalArgumentException("Email is not exist"));
        //System.out.println(Objectoptional);


        System.out.println(optionalName);


        if(optional2.isPresent()) {
            System.out.println(optional.get());
        }else{
            System.out.println("Not found");
        }

    }
}