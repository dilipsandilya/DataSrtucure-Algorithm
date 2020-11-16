package com.datastructure.searching_algorithm;
/**
 * 1. find the mid of the sorted array by breaking it into two parts
 * 2. check whether arr[mid]<=searching element. If yes then consider right dubarray and repeat step 1 again else 
 * consider left subarray and repeat step 1 till we find the key.
 * @author DILIP KUMAR
 *
 */
public class BinarySearch
{
  public static int binarySearch(int[] arr, int key)
  {
    int length = arr.length-1,low = 0;
    while(low < length)
    {
      int mid = low +(length - low)/2;

      if(arr[mid] == key)
        return mid;
      else if(arr[mid] < key )
        low = mid + 1;

      else if(arr[mid] > key)
        low = mid -1;
    }
    return -1;
  }
  public static void main(String[] args)
  {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,89,90,101,150,160,170,180,250,500,1000};

    int key = 180;
    int keyIndex = binarySearch(arr, key);

    if(keyIndex != -1)
      System.out.println("Element " + key + " is found at index = " + keyIndex);
    else
      System.out.println("Element " + key + " is not found.");
  }

}
