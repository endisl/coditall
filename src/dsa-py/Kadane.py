def max_subset_adjacent_sum(arr):
    max_ending_here = arr[0]
    max_so_far = arr[0]
    for i in range(len(arr)):
        num = arr[i]
        max_ending_here = max(num, max_ending_here + num)
        max_so_far = max(max_so_far, max_ending_here)

    return max_so_far
