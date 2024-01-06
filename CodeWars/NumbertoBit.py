"""
Bit Counting
Write a function that takes an integer as input, and returns the number of bits that 
are equal to one in the binary representation of that number. You can guarantee that 
input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should
return 5 in this case
"""
def count_bits(number):
    # Verificar si el número no es positivo
    if number < 0:
        print("It's not a non-negative integer")
        return -1
    binary_representation = bin(number)[2:]
    count_ones = binary_representation.count('1')
    return count_ones
print(count_bits(123334))