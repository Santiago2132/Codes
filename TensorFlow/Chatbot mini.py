import speech_recognition as sr
import webbrowser
from gtts import gTTS
import os
import time
import requests


# Configura el reconocimiento de voz
r = sr.Recognizer()

def speak(text):
    tts = gTTS(text=text, lang='es')
    tts.save("audio.mp3")
    #os.system("mpg123 audio.mp3")

def recognize_speech():
    with sr.Microphone() as source:
        # Ajusta el umbral de energía para el ruido ambiental
        r.adjust_for_ambient_noise(source)
        print("<--Di algo-->")
        audio = r.listen(source)

    try:
        # Utiliza Google Speech Recognition para convertir el audio en texto
        text = r.recognize_google(audio, language="es-ES")
        print("Has dicho esto: " + text)
        return text.lower()
    except sr.UnknownValueError:
        print("No se pudo reconocer el audio.")
    except sr.RequestError as e:
        print("Error al realizar la solicitud a Google Speech Recognition service; {0}".format(e))

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

def process_command(command):
    if "buscar" or "busca" in command:
        if("buscar" in command):
            search_query = command.replace("buscar", "")
        else:
            search_query = command.replace("busca", "")
        search_query = search_query.strip()
        # Use DuckDuckGo search function
        resultados = buscar_en_duckduckgo(search_query)
        for origen, concepto in resultados:
            print(f"Origen: {origen}, Concepto: {concepto}")
    elif "abrir" in command:
        app_name = command.replace("abrir", "")
        app_name = app_name.strip()
        if "navegador" in app_name:
            webbrowser.open("https://www.google.com")
            speak("Abriendo el navegador")
        elif "editor de texto" in app_name:
            webbrowser.open("https://www.example.com")
            speak("Abriendo el editor de texto")
        # Agrega más condiciones aquí para abrir otras aplicaciones
'''
# Configura cómo quieres que el asistente se refiera a ti
tu_nombre = "Santiago"

# Configura el comando de activación
comando_activacion = "activar asistente"

# El asistente te saluda al inicio
speak("Hola " + tu_nombre + ", estoy listo para ayudarte. Dime " + comando_activacion + " para empezar.")
'''
tu_nombre = "Santiago"

while True:

    texto_reconocido = recognize_speech()

    if texto_reconocido:
        if tu_nombre in texto_reconocido:
            texto_reconocido = texto_reconocido.replace(tu_nombre, "")
            speak("Sí, " + tu_nombre)
        process_command(texto_reconocido)