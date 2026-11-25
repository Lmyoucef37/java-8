import org.w3c.dom.ls.LSOutput;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamFilter {

    public static void main(String[] args) {
        List<Product> productList = getProductList();

        // 1. Filter products with price > 3000, then print "id name"
        productList.stream()
                .filter(product -> product.getPrice() >= 3000f)
                .map(product -> product.getId() + " " + product.getName())
                .forEach(System.out::println);

        // 2. Sort by price (ascending) and print
        productList.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        long count = Stream.of(12, 34, 6, 2, 1, 0, 6).count();
        System.out.println(count);


          Integer min = Stream.of(12, 34, 6, 2, 1, 0, 6)
                .min(Integer::compareTo)
                .get();
         System.out.println(min);

        Integer max = Stream.of(12, 34, 6, 2, 1, 0, 6)
                .max(Integer::compareTo)
                .get();
        System.out.println(max);

        IntSummaryStatistics stats = Stream.of(12, 46, 6, 2, 1, 5, 8)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Minimum: " + stats.getMin());
        System.out.println("Maximum: " + stats.getMax());
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());

        BiFunction<Product,Product,Float> bifn = (t,u)->(t.getPrice()+u.getPrice());
                System.out.println(bifn.apply(productList.get(0),productList.get(4)));


    }

    private static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, 132213f, "hp")); //index0
        productList.add(new Product(2, 14348f, "fdgfd"));
        productList.add(new Product(3, 97163f, "dkfa"));
        productList.add(new Product(4, 2657f, "cvrf"));
        productList.add(new Product(5, 49213f, "UA")); //index4
        return productList;
    }
}