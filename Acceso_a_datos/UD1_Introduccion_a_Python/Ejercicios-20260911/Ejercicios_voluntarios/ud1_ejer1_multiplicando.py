try:
    dato = int(input("Dáme un número entero del 1 al 10: "))
except ValueError:
    print("Error. El dato no es un entero.")
except ZeroDivisionError:
    print("Error. El dato debe ser distinto de cero.")
except:
    print("\nError genérico.")
else:
    print("\nTABLA DE MULTIPLICAR DEL Nº ", dato, " :")
    for i in range(10):
        if i < 9:
            print("", i + 1, " *  ", dato, " =  ", dato * (i + 1))
        else:
            print(i + 1, " *  ", dato, " =  ", dato * (i + 1))
finally:
    exit()
