"""Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

array_diff([1,2],[1]) == [2]
If a value is present in b, all of its occurrences must be removed from the other:

array_diff([1,2,2,2,3],[2]) == [1,3]

Solution: The array_diff function can handle empty lists, duplicate values, and multiple occurrences of the same value. 
However, it may not be efficient for large inputs, as the time complexity is O(n^2) 
due to the use of the in operator in the list comprehension.
"""
def array_diff(a,b):
    return [item for item in a if item not in b]
print(array_diff([1,2],[1])) # Output: [2]
print(array_diff([1,2,2,3,5,6,7,2,3],[2])) # Output: [1, 3, 5, 6, 7, 3]

def array_diff(a, b):#Now time complexity reduced to O(n) for large inputs.
    b_set = set(b)
    return [item for item in a if item not in b_set]

print(array_diff([1,2],[1])) # Output: [2]
print(array_diff([1,2,2,3,5,6,7,2,3],[2])) # Output: [1, 3, 5, 6, 7, 3]

#Others solutions
def array_diff(a, b):
    #your code here
    return filter(lambda i: i not in b, a)

def array_diff(a, b):
    #your code here
    for i in range(len(b)):
        while b[i] in a:
            a.remove(b[i])
    return a

def array_diff(a, b):
    for n in b:
        while(n in a):
            a.remove(n)
    return a