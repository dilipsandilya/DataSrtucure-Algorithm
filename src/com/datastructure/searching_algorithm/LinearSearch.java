package com.datastructure.searching_algorithm;

public class LinearSearch
{
  private static int linearSearch(int[] arr, int key)
  {

    for(int index = 0; index<arr.length; index++)
    {
      if(arr[index] == key)
        return index;
    }
    //returning -1 if key will not get match in array.
    return -1;
  }

  public static void main(String[] args)
  {
    int [] arr = {12,45,89,7,890,6,324,780,90,756,23};
    int keyToSearch = 234;
    int keyIndex = linearSearch(arr, keyToSearch);
    
    if(keyIndex != -1)
      System.out.println("Search Element "+ keyToSearch + " is found at index " + keyIndex);
    else
      System.out.println("Search Element " + keyToSearch +" is not found.");

  }

}
