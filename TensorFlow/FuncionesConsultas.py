import requests

def buscar_en_duckduckgo(query):
    url = "https://api.duckduckgo.com/?q=" + query + "&format=json"
    response = requests.get(url)
    data = response.json()

    # Extraer los resultados relacionados
    resultados = data.get('RelatedTopics', [])

    # Crear una lista de tuplas (origen, concepto), ignorando los resultados sin URL
    lista_resultados = [(res.get('FirstURL'), res.get('Text')) for res in resultados if res.get('FirstURL') is not None]

    # Ordenar la lista por origen
    lista_resultados.sort(key=lambda x: x[0])

    return lista_resultados

# Uso de la función
resultados = buscar_en_duckduckgo("Python")
for origen, concepto in resultados:
    print(f"Origen: {origen}, Concepto: {concepto}")
