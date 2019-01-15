# Preparación del entorno

Antes de arrancar vamos a asumir que saben git, no porque este tutorial lo necesite sino porque deberían haberlo usado el año pasado en Paradigmas de Programación. Si no sabes que es esto llamado GIT mirate [este tutorial ultra báscio](https://github.com/fedescarpa/example/wiki).

## Ahora sí, a instalar Java

Hay muchas versiones de java, java 4, 5, 6, 7, 8, 9, 10, 11 y contando... ¿Cómo se cual instalar? Fácil, desde la cátedra usamos java 11. Lo podés [descargar desde acá](https://jdk.java.net/11/) o sino seguí estos simples pasos según tu sistema operativo preferido:

### En Linux (Opción 1 - Para sistemas operativos basados en Debian o Ubuntu):

1. Ejecutar el siguiente comando en una consola

    ``` bash
    sudo add-apt-repository ppa:openjdk-r/ppa &&
    sudo apt-get update -q &&
    sudo apt install -y openjdk-11-jdk openjdk-11-source
    ```

1. Agregá al final de tu archivo `~/.bashrc`:

    ```bash
    export JAVA_HOME='/usr/lib/jvm/java-11-openjdk-amd64'
    export PATH=$JAVA_HOME/bin:$PATH
    ```

### En Linux (Opción 2):

1. Descargalo desde [este link](https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_linux-x64_bin.tar.gz)

1. Descomprimirlo donde más te guste (yo que vos lo hago en una carpeta `.bin` dentro de tu `$HOME`).

1. Agregá al final de tu archivo `~/.bashrc`:

    ```bash
    export JAVA_HOME='/path/donde/descomprimiste/la/carpeta/jdk-11.0.1'
    export PATH=$JAVA_HOME/bin:$PATH
    ```

### En Mac OSX:

1. Descargalo desde [este link](https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_osx-x64_bin.tar.gz)

1. Descomprimirlo donde más te guste (yo que vos lo hago en una carpeta `.bin` dentro de tu `$HOME`).

1. Agregá al final de tu archivo `~/.bash_profile`:

    ```bash
    export JAVA_HOME='/path/donde/descomprimiste/la/carpeta/jdk-11.0.1'
    export PATH=$JAVA_HOME/bin:$PATH
    ```

### En Windows 10 u 8

**Nota**: No está soportado oficialmente por la cátedra y este listado de pasos puede ser tendencioso. Recomendamos usar la [VM de Lububtu que ofrece la cátedra de Sistemas Operativos](https://www.utnso.com/recursos/maquinas-virtuales/) en lugar de trabajar en Windows y seguir los mismos pasos de instalación de la sección de Linux.


1. Descargalo desde [este link](https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_windows-x64_bin.zip)

1. Descomprimirlo donde más te guste (yo que vos lo hago en una carpeta `Java` dentro de `Archivos de Programa`)

1. Cambiar la variable `PATH` del entorno de windos

    1. En Buscar, buscá y seleccioná: Sistema (Panel de control)
    1. Click en `Configuración avanzada del sistema`.
    1. Click en `Variables de entorno`. En la sección `Variables del sistema`, buscá la variable de entorno `PATH`, seleccionala y hacé click en `Editar`. Si no existe la variable de entorno `PATH`, hacé click en `Nuevo`.
    1. En la ventana `Editar la variable del sistema` (o `Nueva variable del sistema`), tenés que agregar una nueva entrada a la carpeta con la ruta a la carpeta `bin` que está adentro de la carpeta `jdk-11.0.1` (podes copiar la ruta abriendo la carpeta en el explorador de windows).
    1. Creá la variable de entorno `JAVA_HOME` que apunte a la carpeta `jdk-11.0.1`
    1. Cerrá todas las ventanas haciendo click en `Aceptar`.
    1. Abrí la consola de `Git Bash` o la ventana del indicador de comandos (`cmd`) y ejecutá el comando `java -version`.


## Ahora a instalar un IDE

* Personalmente recomiendo el IntelliJ que pueden [bajarse desde acá](https://www.jetbrains.com/idea/download/) la versión **community**.

* También pueden bajarse eclipse. Era el IDE por excelencia para Java, pero ultimamente perdió fuerza y se volvió más berreta. Pueden descargarlo [desde acá](https://www.eclipse.org/downloads/).


## Solo falta instalar Maven

Usaremos la version `3.6.0` y pueden bajarla [desde acá](https://maven.apache.org/download.cgi)

### En Linux

1. Descargan el archivo `apache-maven-3.6.0-bin.tar.gz`
1. Descomprimen el archivo en donde quieran, si siguieron mi consejo van a descomprimir este archivo tambien en la carpeta `.bin` de tu `$HOME`
1. Agregá al final de tu archivo `~/.bashrc`:

    ```bash
    export MAVEN_HOME='/path/donde/descomprimiste/la/carpeta/apache-maven-3.6.0'
    export PATH=$MAVEN_HOME/bin:$PATH
    ```

### En Mac OSX

1. Descargan el archivo `apache-maven-3.6.0-bin.tar.gz`
1. Descomprimen el archivo en donde quieran, si siguieron mi consejo van a descomprimir este archivo tambien en la carpeta `.bin` de tu `$HOME`
1. Agregá al final de tu archivo `~/.bash_profile`:

    ```bash
    export JAVA_HOME='/path/donde/descomprimiste/la/carpeta/apache-maven-3.6.0'
    export PATH=$JAVA_HOME/bin:$PATH
    ```

### En Windows

1. Descargan el archivo `apache-maven-3.6.0-bin.zip`
1. Descomprimen el archivo en donde quieran (yo lo haría en una carpeta `Maven` dentro de `Archivos de Programa`)
1. Siguiendo los pasos hechos para agregar a la variable de entorno `PATH` la ruta a la carpeta de java, vamos a hacer lo mismo para agregar la ruta a la carpeta `bin` que está dentro de la carpeta `apache-maven-3.6.0`


## ¿Y ahora qué?

Listo, tenemos todo instalado, o deberíamos... ¿Querés ver que todo ande? clonate [este repositorio](https://github.com/dds-utn/seed-maven-java-11).

Entrá dentro de la carpeta del repositorio que acabas de clonar y ejecutá el siguiente comando

* Si bajaste **IntelliJ**

    ```
    mvn idea:clean idea:idea clean install  -DdownloadSources-true
    ```

* Si bajaste **Eclipse**

    ```
    mvn eclipse:clean eclipse:eclipse clean install -DdownloadSources-true
    ```
