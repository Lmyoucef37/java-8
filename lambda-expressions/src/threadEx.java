public class threadEx  {
    public static void main(String[] args) {

        threadImpl thread = new threadImpl();
        thread.run();


        Runnable threadImpl = () -> System.out.println("thredImpl");
               Thread t1 = new Thread(threadImpl);
                t1.start();

    }
}
