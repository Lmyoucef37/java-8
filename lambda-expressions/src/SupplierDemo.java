import java.time.LocalDateTime;
import java.util.function.Supplier;


public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<LocalDateTime> SupplierImpl = () -> LocalDateTime.now();
        System.out.println(SupplierImpl.get());
    }
}






