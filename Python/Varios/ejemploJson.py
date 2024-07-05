import json

# Un diccionario de Python
data = {
    "name": "Juan",
    "age": 30,
    "city": "Madrid"
}

# Convertir el diccionario a una cadena JSON
json_string = json.dumps(data)
print("Cadena JSON:", json_string)

# Convertir la cadena JSON de nuevo a un diccionario de Python
data_dict = json.loads(json_string)
print("Diccionario de Python:", data_dict)
