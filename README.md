![Logo de Spochofy](https://raw.githubusercontent.com/RubenDanielCastelao/Spochofy/development/src/main/java/Img/spochofyLogoGrande.png)

---

### ¿Qué es Spochofy?

##### Spochofy es un gestor y reproductor de música creado en Java, usando bases de datos SQLite. En es Spochofy podrás:

+ Buscar canciones según su titúlo.
+ Revisar que canciones han creado tus artistas favoritos.
+ Crear tus propias playlist personalizadas.
+ Buscar canciones y albumes por su año de creación.
+ Y otras varias utilidades para que puedas disfrutar de tus canciones favoritas.
---
### Como comenzar a usar Spochofy

- Lo primero al comenzar a usar Spochofy es crearte una cuenta usando el boton Sign In que veras en la primera interfaz, una vez introduzcas tus nuevas credenciales, te veras devuelto a Log In, donde podras usar tu nueva cuenta para Iniciar Sesión y empezar a gestionar tu musica.
- Cuando tengas tu sesion iniciada veras que puedes acceder a todas las canciones disponibles en Spochofy y reproducirlas, o acceder a Listas De Reproduccion, para crearlas, para ello deberas introducir el nombre que desees darle a tu nueva PlayList y presionar el boton de Crear PlayList.
- Finalmente puedes añadir canciones a la PlayList haciendo click en las canciones y tu nueva PlayList, y listo, ya puedes reproducir tu PlayList!
---

### Diagramas y explicaciones

#### Diagrama de clases:
```mermaid
classDiagram
    class Albumes {
        +int aid, yid, atid
        +String atitulo
    }
    class Anyos {
        +int yid
        +String ynumero
    }
    class Artistas {
        +int atid
        +String atnombre
    }
    class Canciones {
        +int cid, yid, aid, atid
        +String ctitulo
    }
    class CancionesLR{
        +int lid, cid
    }
    class ListasRep{
        +int lid, uid
        +String lnombre
    }
    class Usuarios{
        +int uid
        +String unombre, ucontrasena
    }
    class Controller{
        +View view
        +Model model
        +String estado
        +MusicPlayer musicPlayer

        +main()
    }
    class Model{
        +Enlace E
        +desconectar()
        +mostrarCanciones()
        +mostrarAlbumes()
        +mostrarAnyos()
        +mostrarArtistas()
        +anyadirCancionAPlaylist()
        +borrarCancionDePlaylist()
        +borrarPlaylist()
        +crearPlaylist()
        +checkUserID()
        +cambiarNombrePlaylist()
        +mostrarCancionesPlaylist()
        +registrarse()
        +login()
        +mostrarListasRepUsuario()
        +verAlbum()
        +verArtista()
        +verAnyo()
        +verCancion()
        +verUsuario()
        +playMusicPL()
        +playMusic()
    }
    class MusicPlayer{
        -Player player
        +Thread musicThread
        +playMusic()
        +run()
        +stop()

    }
    class ClaseObserver{
        +View miVista
        +update()
    }
    class crearPlayList{
        -ActionListeners()
    }
    class CustomMenuBar{
        -Image bgimg
        -Color color
        -paintComponent()
    }
    class ListasUI{
        -ActionListeners()
    }
    class Login{-ActionListeners()}
    class MainUI{-ActionListeners()}
    class Sign{-ActionListeners()}
    class View{
        +openLogin()
        +openSignin()
        +openCreatePlaylist()
        +openSongs()
        +openPlaylist()
        +openAuthors()
        +openAlbums()
        +openYears()
        +exit()
        +closeUIs()
        +actualizarUsuario()
    }

    Albumes -->  Model
    Anyos -->  Model
    Artistas -->  Model
    Canciones -->  Model
    CancionesLR -->  Model
    ListasRep -->  Model
    Usuarios -->  Model


    Model --> Controller
    View --> Controller

    Model -- Observable : implementa
    MusicPlayer --|> Runnable
    ClaseObserver-- Observer : implementa
    ClaseObserver --> Model
    crearPlayList --|> JInternalFrame
    CustomMenuBar --|> JMenuBar
    ListasUI --|> JInternalFrame
    Login --|> JInternalFrame
    MainUI --|> JFrame
    Sign --|> JInternalFrame
    View --|>  JFrame

    Sign --> View
    MainUI --> View
    Login --> View
    ListasUI --> View
    CustomMenuBar --> View
    crearPlayList --> View
```

---
### Información para colaboradores

#### Issues:

-Interfaz grafica: DONE

-Base de datos: DONE

-Reproducción de musica: DONE

#### TODO

-Primera versión del programa

---
### Ramas del proyecto

##### Las ramas usadas son:

+ Main: Solo para releases (Versiones funcionales del proyecto).
+ Development: Rama del desarrollo, usada para hacer merge al trabajo de los desarolladores antes de pasarlo a main, esta rama se usa tambien para actualizar readme y parecidos
+ Ramas de cada desarrollador: Ramas unicas de los desarroladores

---
### Diagrama de base de datos

```mermaid
erDiagram
USUARIOS ||--o{ LISTASREP : organizan

    USUARIOS {

        INTEGER uid
        CHAR unombre
        CHAR ucontrasena
    }

    LISTASREP {

        INTEGER lid
        CHAR lnombre
    }

    LISTASREP }o--o{ CANCIONES : componen

    CANCIONES {

        INTEGER cid
        CHAR ctitulo
    }

    CANCIONES }o--|| ANYOS : salen

    ANYOS {

        INTEGER yid
        CHAR ynumero
    }

    CANCIONES }|--|| ALBUMES : tienen

    ALBUMES {

        INTEGER aid
        CHAR atitulo
    }

    CANCIONES }|--|| ARTISTAS : crean

    ARTISTAS {

        INTEGER atid
        CHAR atnombre
    }

    ALBUMES }o--|| ANYOS : pertenecen

    ARTISTAS ||--o{ ALBUMES : hacen 
```
---

### Diagramas de flujo por funciones

#### Inicio de sesión:
```mermaid
flowchart TD
A[INICIO] --> B[/ Usuario, Contraseña /]
B --> C{usuario & contraseña coinciden}
C -->|True| D[\Inicio de sesion correcto\]
C -->|False| E[\Credenciales incorrectas\]
D -->F[FIN]
E -->B
```
```mermaid
sequenceDiagram
participant Model
participant Controller
participant View
Controller->>View: Abre una interfaz principal
activate View
View-->>Controller: Creada!
deactivate View
Controller->>+View: Crea una interfaz de login dentro de esta
activate View
View->>-View: Se muestra UI de login
View-->>Controller: Listo!
deactivate View
Controller->>Model: Comprueba si las credenciales de inicio son validas
activate Model
Model-->>Controller: Comprobadas
deactivate Model
Controller->>+View: Muestra el resultado del inicio de sesion
activate View
View->>-View: Muestra si el inicio es correcto o no
View-->>Controller: Listo!
deactivate View
```

#### Crear la UI usada para mostrar canciones

```mermaid
sequenceDiagram
participant Model
participant Controller
participant View
Controller->>View: Cierra la anterior UI creada
activate View
View-->>Controller: Cerrada!
deactivate View
Controller->>+View: Crea la interfaz de canciones
activate View
View->>-View: Se ejecuta la interfaz de listas en su variación de canciones
View-->>Controller: Listo!
deactivate View
Controller->>Model: Obten los datos de canciones de la base de datos
activate Model
Model-->>Controller: Obtenidos!
deactivate Model
Controller->>+View: Muestra los datos en la interfaz de canciones
activate View
View->>-View: Se muestran todos los datos de todas las canciones
View-->>Controller: Listo!
deactivate View
```