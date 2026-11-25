
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}


public class methodrefernceDemo{

    public static int addition(int a,int b){
        return a+b;
    }

    public void display(String msg ){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        //lambda expression
         Function<Integer,Double> function = (input)-> Math.sqrt(input);
           System.out.println(function.apply(1));


        //method reference (static method)
        Function<Integer, Double> functionMethodref = Math::sqrt;
        System.out.println(functionMethodref.apply(3));

        methodrefernceDemo demo = new methodrefernceDemo();

        Printable printable = (msg)-> demo.display(msg);
         printable.print("Hello World");

         // reference to an instance method of particular object (non static method)
        Printable printable2 = demo::display;
        printable2.print("Hello World");

        Function<String,String> Strfn = (input)-> input.toLowerCase();
        System.out.println(Strfn.apply("OFF"));

        //Reference to an instance method of arbitray object of specific
           Function <String,String> Strgfunc = String::toLowerCase;
        System.out.println(Strgfunc.apply("UA"));








    }








}
