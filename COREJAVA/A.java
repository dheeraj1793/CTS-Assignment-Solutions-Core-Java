import java.util.*;
public class A {
   
    public static int findKthSmallestElement(int[] array, int k) {

        PriorityQueue priorityQueue = new PriorityQueue();

        for (int i = 0; i < array.length; i++) { 
		priorityQueue.offer(array[i]); } 
		int currentNo = 0; 
		while (k > 0) {
            currentNo = Integer.parseInt(priorityQueue.poll());
            k--;
        }

        return currentNo;
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
		System.out.print("N= ");
        int total_num = scanner.nextInt();

        int[] num_array = new int[total_num];
		System.out.print("Array=");

        for (int i = 0; i < total_num; i++)
            num_array[i] = scanner.nextInt();

        System.out.println("Enter k : ");
        int k = scanner.nextInt();

        System.out.println("Smallest element for k = " + k + " : "
                + findKthSmallestElement(num_array, k));
    }
}