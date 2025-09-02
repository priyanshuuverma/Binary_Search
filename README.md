## Binary Search – Why, Where, and How

# As we know, Linear Search has a time complexity of O(n) because it checks each element one by one. But there is a much better approach: Binary Search, which is significantly faster on sorted data. Time Complexity Comparison

                                                Constant → O(1)
                                                
                                                Log-logarithmic → O(log log n)
                                                
                                                Logarithmic → O(log n)
                                                
                                                Linear → O(n)

# Among these, the fastest is O(1) (direct access, like arr[index]), but in searching problems, it is not possible to always achieve O(1). Therefore, we aim to get as close as possible to it, and the best we can achieve in searching is O(log n) using Binary Search. Binary Search reduces the search space by half at every step, making it much more efficient compared to Linear Search.
