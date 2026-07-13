# Linear Search in Java

## Problem
Given an integer array `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

## Solution
This solution uses **Linear Search**, where each element of the array is checked one by one until the target is found.

### Algorithm
1. Traverse the array from the first element to the last.
2. Compare each element with the target.
3. If the target is found, return its index.
4. If the loop completes without finding the target, return `-1`.


## Example

### Input
```text
nums = [4, 2, 7, 1, 9]
target = 7
```

### Output
```text
2
```

### Explanation
The target `7` is present at index `2`.

---

### Input
```text
nums = [4, 2, 7, 1, 9]
target = 5
```

### Output
```text
-1
```

### Explanation
The target `5` is not present in the array.

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

## Notes
- Works for both sorted and unsorted arrays.
- For a sorted array, **Binary Search** provides a better time complexity of **O(log n)**.
