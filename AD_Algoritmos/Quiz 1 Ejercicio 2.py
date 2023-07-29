array = list(map(int, input("Ingrese los valores del array separados por espacios: ").split()))
valor_a_borrar = int(input("Ingrese el valor que desea borrar: "))
array_original = array.copy()
array_resultante = [i for i in array if i != valor_a_borrar]
num_borrados = len(array) - len(array_resultante)
print(f"Se han borrado {num_borrados} ocurrencias del valor {valor_a_borrar}")
print(f"Array original: {array_original}")
print(f"Array resultante: {array_resultante}")