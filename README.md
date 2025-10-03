
# Ejercicio 1 – Gestión de Procesos en Java

## Enunciado

Se compone de 3 partes:

1. **Aplicación `OrdenarNumeros`**  
   - Implementa una aplicación que ordena un conjunto indeterminado de números que recibe a través de su entrada estándar y muestra el resultado ordenado en la salida estándar.

2. **Aplicación `Aleatorios`**  
   - Genera al menos 40 números aleatorios entre 0 y 100 y los escribe en su salida estándar.

3. **Manual de uso y pruebas**  
   - Documentar cómo ejecutar las aplicaciones de manera independiente y encadenadas utilizando el operador `|` (tubería).  
   - Incluir capturas de pantalla de las ejecuciones.

---

## Estructura del proyecto



actividad_tema3_Gestion_de_procesos_1/
├─ src/
│  ├─ main/
│     └─ java/
│        └─ org/example/
│           ├─ Aleatorios.java
│           └─ OrdenarNumeros.java
├─ out/
│  └─ artifacts/
│     ├─ Aleatorios_jar/
│     │  └─ actividad_tema3_Gestion_de_procesos_1.jar
│     └─ OrdenarNumeros_jar/
│        └─ actividad_tema3_Gestion_de_procesos_1.jar





## Contenido de las clases

### **Aleatorios.java**

package org.example;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int cantidad = 40;

        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(101);
            System.out.print(numero + " ");
        }
        System.out.println(); // salto de línea al final
        System.out.flush();   // asegura que se envíe todo a la consola
    }
}


### **OrdenarNumeros.java**


package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while (sc.hasNextInt()) {
            numeros.add(sc.nextInt());
        }

        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        for (int n : ordenados) {
            System.out.print(n + " ");
        }
        System.out.println(); // salto de línea al final
    }
}


---

## Cómo ejecutar

### 1️⃣ Ejecutar Aleatorios por sí solo

```powershell
java -jar "C:\Users\Usuario1\IdeaProjects\actividad_tema3_Gestion_de_procesos_1\out\artifacts\Aleatorios_jar\actividad_tema3_Gestion_de_procesos_1.jar"
```

### 2️⃣ Ejecutar OrdenarNumeros con entrada manual

```powershell
echo 34 7 89 12 50 | java -jar "C:\Users\Usuario1\IdeaProjects\actividad_tema3_Gestion_de_procesos_1\out\artifacts\OrdenarNumeros_jar\actividad_tema3_Gestion_de_procesos_1.jar"
```

### 3️⃣ Encadenar Aleatorios y OrdenarNumeros (pipeline)

```powershell
java -jar "C:\Users\Usuario1\IdeaProjects\actividad_tema3_Gestion_de_procesos_1\out\artifacts\Aleatorios_jar\actividad_tema3_Gestion_de_procesos_1.jar" | java -jar "C:\Users\Usuario1\IdeaProjects\actividad_tema3_Gestion_de_procesos_1\out\artifacts\OrdenarNumeros_jar\actividad_tema3_Gestion_de_procesos_1.jar"
```

✅ Salida esperada: 40 números aleatorios ordenados de menor a mayor en una sola línea.

---

## Capturas de pantalla

### 1️⃣ Ejecución de Aleatorios

![Captura Aleatorios](ruta/a/tu/captura_aleatorios.png)
<img width="1258" height="39" alt="{4B11B390-3C66-4B69-800F-04F803294E63}" src="https://github.com/user-attachments/assets/a904f4c6-368a-4b01-b927-f2e52aa276b3" />


### 2️⃣ Ejecución de OrdenarNumeros con entrada manual
### 3️⃣ Pipeline Aleatorios | OrdenarNumeros

<img width="1265" height="73" alt="{F023C938-3D53-40FE-88D4-B64B3099C98A}" src="https://github.com/user-attachments/assets/e0344d72-93b3-4eba-bd62-ee1a18b2fab9" />


---

## Notas

* Asegúrate de reconstruir los artefactos (`Build → Build Artifacts → Rebuild`) cada vez que modifiques las clases.
* Si renombraste los `.jar` a `Aleatorios.jar` y `OrdenarNumeros.jar`, ajusta las rutas en los comandos de ejecución.
* La tubería funciona gracias a que `Aleatorios` hace `System.out.flush()` al final.

---
[Adrián Bautista Ramos]



