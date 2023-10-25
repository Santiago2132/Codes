'''
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
'''

def who_likes_it(nombres):
    if len(nombres) == 0:
        print("no one likes this")
    elif len(nombres) == 1:
        print(f"{nombres[0]} likes this")
    elif len(nombres) == 2:
        print(f"{nombres[0]} and {nombres[1]} like this")
    elif len(nombres) == 3:
        print(f"{nombres[0]}, {nombres[1]} and {nombres[2]} like this")
    else:
        print(f"{nombres[0]}, {nombres[1]} and {len(nombres)-2} others like this")

# Ejemplos de uso
who_likes_it([])                                # Output: "no one likes this"
who_likes_it(["Peter"])                         # Output: "Peter likes this"
who_likes_it(["Jacob", "Alex"])                 # Output: "Jacob and Alex like this"
who_likes_it(["Max", "John", "Mark"])           # Output: "Max, John and Mark like this"
who_likes_it(["Alex", "Jacob", "Mark", "Max"])  # Output: "Alex, Jacob and 2 others like this"

print('This {food} is {adjective}.'.format(food='spam', adjective='absolutely horrible'))
