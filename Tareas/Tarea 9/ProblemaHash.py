arr = {2:0, 14:1, 6:2, 11:3, 8:4, 15:5, 7:6}
obj = 9

for valor in arr.keys():
  complemento = obj - valor

  if(complemento in arr):
    print("Los indices que suman el valor de", obj, "son:",arr[valor], "y", arr[complemento])
