package HASHING;

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();

        for (int k : arr1) {
            set.add(k);
        }
        for (int j : arr2) {
            set.add(j);
        }

        System.out.println("Union =" + set.size());

        //intersection:
        set.clear();
        for (int j : arr1) {
            set.add(j);
        }
        int count=0;
        for (int j : arr2) {
            if (set.contains(j)) {
                count++;
                set.remove(j);
            }
        }

        System.out.println("Intersection =" + count);
    }
}
