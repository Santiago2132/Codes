import os
import pyttsx3

parlante = pyttsx3.init()
voice_id = 'HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\Voices\Tokens\TTS_MS_EN-US_ZIRA_11.0'  # voz en ingles
# voice_id='HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\Voices\Tokens\TTS_MS_ES-MX_SABINA_11.0' #voz en español
parlante.setProperty('voice', voice_id)
parlante.setProperty('rate', 120)  # 1 muy despacio --  150 normal -- 300 muy rápido

archivo_ruta = 'C:/visual_studio/voz/ingles_01.txt'

try:
    with open(archivo_ruta, 'r', encoding="utf_8") as archivo:
        text = archivo.read()
        os.system("cls")  # borra la pantalla
        print("*****************************************")
        print(text)
        parlante.say(text)
        #parlante.save_to_file(text, 'C:/visual_studio/voz/test.mp3')
        parlante.say("OK")
        parlante.runAndWait()
        print('\n', "****La lectura terminó****")

except FileNotFoundError:
    print(f'Error: El archivo {archivo_ruta} no pudo ser encontrado.')

except Exception as e:
    print(f'Error inesperado: {e}')
