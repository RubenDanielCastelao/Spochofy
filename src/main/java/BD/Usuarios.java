package BD;

public class Usuarios {

    int uid;
    String unombre, ucontrasena;

    public Usuarios(int uid, String unombre, String ucontrasena) {
        this.uid = uid;
        this.unombre = unombre;
        this.ucontrasena = ucontrasena;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUnombre() {
        return unombre;
    }

    public void setUnombre(String unombre) {
        this.unombre = unombre;
    }

    public String getUcontrasena() {
        return ucontrasena;
    }

    public void setUcontrasena(String ucontrasena) {
        this.ucontrasena = ucontrasena;
    }
}
