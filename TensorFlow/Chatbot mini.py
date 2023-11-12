import speech_recognition as sr
import webbrowser
from gtts import gTTS
import os

# Configura el reconocimiento de voz
r = sr.Recognizer()

def speak(text):
    tts = gTTS(text=text, lang='es')
    tts.save("audio.mp3")
    os.system("mpg123 audio.mp3")

def recognize_speech():
    with sr.Microphone() as source:
        print("Di algo...")
        audio = r.listen(source)

    try:
        # Utiliza Google Speech Recognition para convertir el audio en texto
        text = r.recognize_google(audio, language="es-ES")
        print("Has dicho esto care chimba: " + text)
        return text.lower()
    except sr.UnknownValueError:
        print("No se pudo reconocer el audio.")
    except sr.RequestError as e:
        print("Error al realizar la solicitud a Google Speech Recognition service; {0}".format(e))

def process_command(command):
    if "buscar" in command:
        search_query = command.replace("buscar", "")
        search_query = search_query.strip()
        search_url = "https://www.google.com/search?q=" + search_query
        webbrowser.open(search_url)
        speak("Buscando " + search_query)
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

# Configura cómo quieres que el asistente se refiera a ti
tu_nombre = "care chimba"

while True:
    command = recognize_speech()
    
    if command:
        if tu_nombre in command:
            command = command.replace(tu_nombre, "")
            speak("Sí, " + tu_nombre)
        process_command(command)
