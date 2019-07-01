# Lecture Notes: InsertionSort 

## Overview

   Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

## Learning Objective

As a result of completing this Lecture, students will:
- Continue to expand on their understanding of sorting algorithm using insertion method

## Diagram
![InsertsionSort Diagram](https://www.studytonight.com/data-structures/images/basic-insertion-sort.png)

![InsertsionSort Diagram](https://camo.githubusercontent.com/64ba2bcbd5c11779657e40a1d03d0ea691f6fa57/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f632f63632f4d657267652d736f72742d6578616d706c652d33303070782e676966)

## Algorithm
- Worst case performance O(n^2)
- Best case performance O(n)
- Average case performance O(n^2)

## Pseudocode
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp


## Readings and References
Watch
* [InsertsionSort Youtube Video](https://www.youtube.com/watch?v=mXA1ICs3K4Y)

Read
* [Java Point](https://www.javatpoint.com/insertion-sort-in-java)
* [Baeldung](https://www.baeldung.com/java-insertion-sort)

Bookmark
* [wiki](https://en.wikipedia.org/wiki/Insertion_sort)
* [Hackerearth](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/tutorial/)