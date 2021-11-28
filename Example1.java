package lesson27;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class Example1 {
    public static void main(String[] args) throws IOException {
        Shape shape1 = new Shape("circle");
        Shape shape2 = new Shape("square");
        Shape shape3 = new Shape("rhombus");
        IShare iShare;
        iShare = (shape) -> {
            if (shape.getName().equals("square"))
                return shape.toString();
            else
                return "The shape is not a square";
        };
        System.out.println(iShare.getSquare(shape1) + "\n" + iShare.getSquare(shape2) + "\n" + iShare.getSquare(shape3));
        System.out.println("----------------------------------\n" + "Second exercise:");
        IOperation operation = (a, b) -> {
            if (a < b) {
                System.out.println("a<b, a = " + a);
                return a;
            } else if (b < a) {
                System.out.println("b<a, b = " + b);
                return b;
            } else {
                System.out.println("0");
                return 0;
            }
        };
        operation.comparison(5, 8);
        System.out.println("----------------------------------\n" + "Third exercise:");
        String[] text1 = new String[3];
        text1[0] = "XX FKFOGKlfkmlkvkml dkfklokfkdp, efjfjjkdjkdfkd.";
        text1[1] = "SMVSmckdm XXckvokvkv, dvkdXXnkn: vdcds, XX, cdvds!";
        text1[2] = "XXHNJ, hjhj kjk.";

        Text first = new Text(text1);
        Search search = (string -> {
            if (string.matches("XX.*")) {
                System.out.println(string);
            }
        });
        first.getStrings(text1, search);
        System.out.println("----------------------------------\n" + "Fourth exercise:");
        Predicate<Integer> positive = i -> i > 0;
        Integer[] numbers = {1, -3, 7, -44, 2, 5, 8};
        for (Integer number : numbers) {
            if (positive.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println("----------------------------------\n" + "Fifth exercise:");
        UnaryOperator<Integer> squaring = i -> i * i;
        for (Integer number : numbers) {
            Integer numberSquared = squaring.apply(number);
            System.out.print(numberSquared + " ");
        }
//        System.out.println("\n----------------------------------\n");
//        ArrayList<String> strings1 = new ArrayList<>();
//        strings1.add("In the morning I ");
//        strings1.add("For supper we had ");
//        ArrayList<String> strings2 = new ArrayList<>();
//        strings2.add("have breakfast");
//        strings2.add("pancakes with jam");
//        System.out.println(strings1.toString() + "\n" + strings2.toString());
//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println("----------------------------------\n" + "Sixth exercise:");
//Function<String, Integer> convert =
    }
    }




