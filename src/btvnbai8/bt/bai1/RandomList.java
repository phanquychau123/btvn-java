package btvnbai8.bt.bai1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RandomList {
    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList();
        System.out.println("danh sach so nguyen ngau nhien la");
        System.out.println(randomList);
        int maxElement = Collections.max(randomList);
        System.out.println("gia tri lon nhat trong danh sach :" + maxElement);

    }

    private static List<Integer> generateRandomList() {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomValue = (int) (Math.random() * 100);
            System.out.println(randomValue);
            randomList.add(randomValue);
        }
        return randomList;
    }
}