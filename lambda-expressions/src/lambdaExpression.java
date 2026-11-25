package com.java.lambda;


@FunctionalInterface
interface shape {
    void draw();
}

//class
class rectangel implements shape {

    @Override
    public void draw() {
        System.out.println("rectangel.draw()");
    }
}
//class
    class circle implements shape {
        @Override
        public void draw() {
            System.out.println("circle.draw()");
        }
    }


//main
    public class lambdaExpression {
        public static void main(String[] args) {


            shape rectangel = () ->
                    System.out.println("rectangel.draw(UA)");

            rectangel.draw();


            shape circle = () ->
                    System.out.println("circle.draw(OFF)");


            print(circle);

        }
        private static void print(shape shappe) {
            shappe.draw();
        }
    }
