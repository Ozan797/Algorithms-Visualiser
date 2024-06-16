# Algorithm Visualiser

## Overview

This project is a command-line application in Java that visualises various sorting and searching algorithms. The purpose is to help understand the step-by-step process and performance of each algorithm.

## Algorithms Included

### Sorting Algorithms

1. **Bubble Sort**
    - **Explanation**: Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
    - **Time Complexity**:
        - Best Case: O(n)
        - Average Case: O(n^2)
        - Worst Case: O(n^2)
    - **Space Complexity**: O(1)

2. **Selection Sort**
    - **Explanation**: Divides the input list into two parts: the sublist of items already sorted, which is built up from left to right, and the sublist of items remaining to be sorted. Finds the smallest element from the unsorted sublist and swaps it with the leftmost unsorted element.
    - **Time Complexity**: O(n^2) in all cases
    - **Space Complexity**: O(1)

3. **Insertion Sort**
    - **Explanation**: Builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
    - **Time Complexity**:
        - Best Case: O(n)
        - Average Case: O(n^2)
        - Worst Case: O(n^2)
    - **Space Complexity**: O(1)

4. **Merge Sort**
    - **Explanation**: Divides the unsorted list into n sublists, each containing one element, then repeatedly merges sublists to produce new sorted sublists until there is only one sublist remaining.
    - **Time Complexity**: O(n log n) in all cases
    - **Space Complexity**: O(n)

5. **Quick Sort**
    - **Explanation**: Selects a 'pivot' element from the array and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
    - **Time Complexity**:
        - Best Case: O(n log n)
        - Average Case: O(n log n)
        - Worst Case: O(n^2)
    - **Space Complexity**: O(log n)

### Searching Algorithms

1. **Binary Search**
    - **Explanation**: Searches a sorted array by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
    - **Time Complexity**: O(log n) in all cases
    - **Space Complexity**: O(1)

2. **Linear Search**
    - **Explanation**: Checks each element of the list sequentially until a match is found or the whole list has been searched.
    - **Time Complexity**:
        - Best Case: O(1)
        - Average Case: O(n)
        - Worst Case: O(n)
    - **Space Complexity**: O(1)

3. **Jump Search**
    - **Explanation**: Searches for an element in a sorted array by jumping ahead by fixed steps or blocks and then performing a linear search within the block.
    - **Time Complexity**: O(√n) in all cases
    - **Space Complexity**: O(1)

4. **Exponential Search**
    - **Explanation**: Finds the range where the element may be present and then uses binary search within that range. Starts with the first element and doubles the size of the range every time.
    - **Time Complexity**: O(log n)
    - **Space Complexity**: O(log n) due to the call stack for binary search

## How to Run

1. **Compile the Project**:
   Navigate to the `src` directory and run:
   ```sh
   javac cli/Main.java sorting/BubbleSort.java sorting/SelectionSort.java sorting/InsertionSort.java sorting/MergeSort.java sorting/QuickSort.java searching/BinarySearch.java searching/LinearSearch.java searching/JumpSearch.java searching/ExponentialSearch.java
