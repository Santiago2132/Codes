/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 * Author: Santiago Maldonado Rojas
 */
public class Main {
    public static String toCamelCase(String s) {
        // Reemplazar guiones con guiones bajos y luego dividir la cadena en palabras
        String[] words = s.replaceAll("-", "_").split("_");

        // StringBuilder para construir la cadena en formato camel case
        StringBuilder camelCaseBuilder = new StringBuilder();

        // Convertir la primera palabra a minúsculas y agregarla al StringBuilder
        camelCaseBuilder.append(words[0].toLowerCase());

        // Iterar sobre las palabras restantes (comenzando desde la segunda palabra)
        for (int i = 1; i < words.length; i++) {
            // Convertir la primera letra de la palabra a mayúscula y agregarla al StringBuilder
            camelCaseBuilder.append(words[i].substring(0, 1).toUpperCase());
            // Agregar el resto de la palabra en minúsculas al StringBuilder
            camelCaseBuilder.append(words[i].substring(1).toLowerCase());
        }
        // Convertir el contenido del StringBuilder en una cadena y retornarla
        return camelCaseBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));  // Output: "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior"));  // Output: "TheStealthWarrior"
        System.out.println(toCamelCase("The_Stealth-Warrior"));  // Output: "TheStealthWarrior"
    }
}