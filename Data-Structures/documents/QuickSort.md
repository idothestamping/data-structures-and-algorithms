# Lecture Notes: QuickSort 

## Overview
Quicksort (sometimes called partition-exchange sort) is an efficient comparison sorting algorithm, serving as a systematic method for placing the elements of a random access file or an array in order.

## Learning Objective
As a result of completing this Lecture, students will:
- Continue to expand on their understanding of sorting algorithm using quick sort method.

## Diagram
Ref: https://www.geeksforgeeks.org/quick-sort/
![MergeSort Diagram](https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)

### Animated Diagram
![MergeSort Diagram](https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif)

## Algorithm
- Worst case performance: O(n^2)
- Best case performance: Ω(n log(n))

## Pseudocode

````
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
````


## Readings and References
Watch
* [MergeSort Youtube Video](https://www.youtube.com/watch?v=PgBzjlCcFvc)

Read
* [Rune Stone Academy](https://runestone.academy/runestone/static/pythonds/SortSearch/TheQuickSort.html)
* [Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/quick-sort/a/overview-of-quicksort)

Bookmark
* [wiki](https://en.wikipedia.org/wiki/Quicksort)
* [Hackerearth](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)

## Code
* [QuickSort](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/SortingAlgo/QuickSort.java)

