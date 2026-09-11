def valida_opcion():
    '''
    Función que valida si la opción ingresada es correcta.
    '''
    print("-------------------------------")
    print("-------------------------------")
    print("    GAMIFICACIÓN EN EL AULA    ")
    print("-------------------------------")
    print("-------------------------------")
    print(" 1 - Cargar datos en el fichero")
    print(" 2 - Imprimir datos")
    print(" 3 - Jugar")
    print(" 4 - Guardar datos")
    print(" 5 - Cambiar contraseña")
    print(" 0 - Salir")
    print("-------------------------------")
    opcion = input("Dame la opción: ")

    while opcion not in ["0", "1", "2", "3", "4", "5"]:
        print("Por favor, vuelve a intentarlo.")
        opcion = input("Dame la opción: ")

    print("\nLa opción seleccionada es: ", opcion)

valida_opcion()