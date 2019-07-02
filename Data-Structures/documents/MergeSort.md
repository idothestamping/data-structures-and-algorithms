# Lecture Notes: MergeSort 

## Overview
MergeSort is an efficient, general-purpose, comparison-based sorting algorithm. 

## Learning Objective

As a result of completing this Lecture, students will:
- Continue to expand on their understanding of sorting algorithm using merge sort method.

## Diagram
Ref: https://www.geeksforgeeks.org/merge-sort/
![MergeSort Diagram](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png)

![MergeSort Diagram](https://i.stack.imgur.com/YlHqG.gif)

## Algorithm
- Worst case performance O(n*log(n))
- Best case performance O(n)
- Average case performance O(n)

## Pseudocode

````
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
````


## Readings and References
Watch
* [MergeSort Youtube Video](https://www.youtube.com/watch?v=JSceec-wEyw)

Read
* [Rune Stone Academy](https://runestone.academy/runestone/static/pythonds/SortSearch/TheMergeSort.html)
* [Common Laounge](https://www.commonlounge.com/discussion/b1f0950472c94411befbcd88bf964204)

Bookmark
* [wiki](https://en.wikipedia.org/wiki/Merge_sort)
* [Hackerearth](https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/)

## Code
* [MergeSort](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/SortingAlgo/MergeSort.java)

