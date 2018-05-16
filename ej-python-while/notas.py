print("Notas de estudiantes")
# Declaracion de variables
contador = 1
limite = 4
promedio = 0

cadena = "{0}\t{1}\t{2}\t{3}\t{4}\n".format("Nombres", "Nota 1", "Nota 2", "Nota 3", "Promedio")
while contador<=limite:
	# Ingreso de valores por teclado
    nombre = input("Ingrese su nombre: \n")
    nota1 = int (input("Ingrese su nota 1: \n"))
    nota2 = int (input("Ingrese su nota 2: \n"))
    nota3 = int (input("Ingrese su nota 3\n"))
   	# Calculo de promedio de notas
    suma = int (nota1 + nota2 + nota3)
    promedio = suma / 3
    
    cadena = "{0}{1}\t{2}\t\t{3}\t\t{4}\t\t{5}\n".format(cadena, nombre, (nota1), (nota2), (nota3), float (promedio))
   
    contador = contador + 1 # incremento contador
print(cadena)