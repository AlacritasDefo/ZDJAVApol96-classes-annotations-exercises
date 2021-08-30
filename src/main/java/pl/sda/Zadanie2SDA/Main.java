package pl.sda.Zadanie2SDA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Integer[] t1 = {2,4,5,8,6,1,6,0,10,8};

    Checker<Integer> checker = new Checker<Integer>() {
        @Override
        public boolean check(Integer integer) {
            return integer%2!=0;
        }
    };

        System.out.println(countIf(t1, checker));
    }


    public static <T> int countIf(T[] tab, Checker<T> checker) {
        return (int) Arrays.stream(tab)
                .filter(checker::check)
                .count();
    }
}
