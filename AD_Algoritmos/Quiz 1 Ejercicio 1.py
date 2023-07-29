suma = 0 #ta
n = 0 #ta
NotasMPr = 0#ta
aprob = 0#ta
reprob = 0#ta
mayor = 0#ta
menor = 5#ta
mayores = []
mayoresN = []
menores = []
menoresN =[] 
n = int(input("Ingrese la cantidad de estudiantes: "))
ValNotas = []
names = []
for i in range(n):#ta + tc*n + to
    names.append(input("Ingrese el nombre del estudiante: "))
    ValNotas.append(int(input(" Ingrese la Nota del estudiante: ")))    
    suma = suma + ValNotas[i]#(ta + to) *i
    if(mayor<ValNotas[i]):# tc * i
        mayor = ValNotas[i]# ta * i
    if(menor>ValNotas[i]):# tc * i
        menor = ValNotas[i]#ta * i
promedio = suma/n#to 
for i in range(n):#ta + tc*n + to
    if ValNotas[i] > promedio: #tc * i
        NotasMPr = NotasMPr + 1 #(ta + to) * i
    if float(ValNotas[i]) > 3.5:# tc * i
        aprob = aprob + 1# (ta + to)*i
    if float(ValNotas[i]) < 3.5:# tc * i
        reprob = reprob + 1#(ta + to) * i
    if float(ValNotas[i]== mayor):# tc * i
        mayores.append(ValNotas[i])#ta * i
        mayoresN.append(names[i])#ta * i
    if float(ValNotas[i] == menor):#tc * i
        menores.append(ValNotas[i])#ta * i
        menoresN.append(names[i])#ta * i
aprob = (aprob / n)*100#ta + 2to
reprob = (reprob / n)*100# ta + 2to

#Complejidad temporal = 7ta + ta + tc*n + to + (ta + to) *i   + tc * i + ta * i + tc * i + ta * i + ta + tc*n + to + tc * i + (ta + to) * i
#  + tc * i + (ta + to)*i + tc * i + (ta + to)*i + tc * i + ta * i + ta * i+ ta * i + ta + 2to + ta + 2to + tc * i

#Agrupado seria = (7ta + ta + to + 2to) + (tc * 4n + tc * 6i + ta * 4i + to * 4)

#Impresion de datos
print("El promedio es: ", promedio)
print("Mayores al promedio: ", NotasMPr)
print("Porcentaje de reprobados: ", aprob)
print("Procentaje de aprobados: ", reprob)
print(" Mejores notas: ", mayores,mayoresN)
print(" Peores Notas: ", menores, menoresN)