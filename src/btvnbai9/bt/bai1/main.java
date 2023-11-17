package btvnbai9.bt.bai1;


import java.util.ArrayDeque;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> arrInt = new ArrayDeque<>();
        arrInt.offer(1);
        arrInt.offer(2);
        arrInt.offer(3);
        arrInt.offer(4);
        arrInt.offer(5);
        for (Integer s:arrInt
             ) {
            System.out.println(arrInt.poll());
        }

    }
}
