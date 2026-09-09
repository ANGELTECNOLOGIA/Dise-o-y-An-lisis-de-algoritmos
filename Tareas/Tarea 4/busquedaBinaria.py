def busquedaBinaria(lista, lim_inf, lim_sup, buscado):

    if lim_sup >= lim_inf:

        medio = lim_inf + (lim_sup - lim_inf) // 2

        if lista[medio] == buscado:
            return medio

        elif lista[medio] > buscado:
            return busquedaBinaria(lista, lim_inf, medio - 1, buscado)
      
        else:
            return busquedaBinaria(lista, medio + 1, lim_sup, buscado)

    else:
        return -1

if __name__ == '__main__':
    # Lista de 10 elementos
    #lista = [x*2 for x in range(1, 11)]

    # Lista de 100 elementos
    #lista = [x*2 for x in range(1, 101)]

    # Lista de 1000 elementos
    #lista = [x*2 for x in range(1, 1001)]

    # Lista de 10000 elementos
    #lista = [x*2 for x in range(1, 10001)]

    # Lista de 100000 elementos
    #lista = [x*2 for x in range(1, 100001)]

    # Lista de 1000000 de elementos
    #lista = [x*2 for x in range(1, 1000001)]

    buscado = int(input("Ingrese el elemento a buscar: "))
    
    resultado = busquedaBinaria(lista, 0, len(lista)-1, buscado)
    
    if resultado != -1:
        print(f"El elemento {lista[resultado]} se encontró en la posición {resultado}")
    else:
        print("Este elemento no se encuentra en la lista")
