alfabeto = "abcdefghijklmnñopqrstuvwxyz"

with open("mensajeCifrado.txt", "r", encoding="utf-8") as archivo:
    cifrado = archivo.read()

cifrado = cifrado.lower()  

resultado = ""  

for clave in range(0, 27):          
    for letra in cifrado:         
        if letra in alfabeto:
            indice = alfabeto.index(letra)            
            nuevo_indice = (indice - clave) % 27       
            resultado += alfabeto[nuevo_indice]        
        else:
            resultado += letra                        

    print("Clave", clave, ":", resultado)              
    resultado = ""                                     
