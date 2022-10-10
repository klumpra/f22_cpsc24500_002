package funwithnumbersarray;

import java.util.Random;

public class FunWithNumbers {
    public static int count;
    public static int[] nums;
    public static int[] createOriginalList() {
        int[] nums = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            nums[i] = rnd.nextInt(100);
        }
        count = 5;
        return nums;
    }
    public static boolean isFull() {
        if (count == nums.length) {
            return true;
        } else {
            return false;
        }
    }
    public static void resize() {
        int[] result = new int[nums.length*2];
        for (int i = 0; i < count; i++) {
            result[i] = nums[i];
        }
        nums = result;
    }
    public static void append(int val) {
        if (isFull()) {
            resize();
        }
        nums[count] = val;
        count = count + 1;
    }
    public static void insert(int val, int pos) {
        if (isFull()) {
            resize();
        }
        if (pos >= count) {
            append(val);
        } else {
            for (int i = count; i > pos; i--) {
                nums[i] = nums[i-1];
            }
            nums[pos] = val;
            count = count + 1;
        }
    }
    public static void remove(int pos) {
        if (pos < count) {
            for (int i = pos; i < count-1; i++) {
                nums[i] = nums[i+1];
            }
            count = count - 1;
        }
    }
    public static void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int find(int val) {
        for (int i = 0; i < count; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public static void clear() {
        count = 0;
    }
    public static void main(String[] args) {
        nums = createOriginalList();
        System.out.println("Insert 17 at position 3");
        insert(17,3);
        print();
        System.out.println("Append 24");
        append(24);
        print();
        System.out.println("Remove value at position 2");
        remove(2);
        print();
        System.out.println("Find 24");
        int foundAt = find(24);
        if (foundAt == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at position " + foundAt);
        }
        System.out.println("Clear the list");
        clear();
        print();
    }
}

