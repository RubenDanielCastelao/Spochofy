package Model;

import Clases.Enlace;

public class Model {

    static Enlace E = Enlace.getInstance();

    public void conectar () {
        E.getInstance();
    }

    public void desconectar () {
        E.desconexion();
    }
}
