"""
Stop gninnipS My sdroW!
Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"y  --> "He wollef sroirraw" 
"This is a test        --> "This is a test" 
"This is another test" --> "This is rehtona test"

"""
def gninnipS_my_sdroW(sentence):
    words = sentence.split()#Divide la cadena en una lista de palabras
    reversed_words = [word[::-1] if len(word) >= 5 else word for word in words]#Invierte el orden de las palabras con 5 o más letras y mantiene las otras sin cambios
    return ' '.join(reversed_words)#Une las palabras usando espacios
print(gninnipS_my_sdroW("Hey fellow warriors"))
