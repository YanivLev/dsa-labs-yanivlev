//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Yaniv Lev
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;
    System.out.print("Array: ");
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    System.out.print("Reversed Array: ");
    for (int j = nums.length-1; j>=0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    System.out.println("First: " + nums[0] + ", "
     + "Last: " + nums[nums.length-1]);

    System.out.println("Increment num: " + lab.increment(1));
    System.out.println("Max out of 2 nums: " + lab.max(2,3));
    System.out.println("Min out of 2 nums: " + lab.min(2,3));
    System.out.println("Sum of an array: " + lab.sum(nums));
    System.out.println("Average of an array: " + lab.average(nums));
    System.out.println("Max num of an array: " + lab.max(nums));
    System.out.println("Min num of an array: " + lab.min(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    }
    return b;
  }

  public int sum(int[] nums){
    int sum = 0;
    for(int i=0; i<nums.length; i++) {
        sum += nums[i];
    }
    return sum;
  }

  public int average(int[] nums) {
    int sum = 0;
    for (int num: nums) {
      sum += num;
    }
    return sum/nums.length;
  }

  public int max(int[] nums) {
    int max = nums[0];
    for (int i=1; i<nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int[] nums) {
    int min = nums[0];
    for (int i=1; i<nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}