package BD;

public class Usuarios {

    int uid;
    String unombre, ucontrasena;

    /**
     *
     * @param uid
     * @param unombre
     * @param ucontrasena
     */
    public Usuarios(int uid, String unombre, String ucontrasena) {
        this.uid = uid;
        this.unombre = unombre;
        this.ucontrasena = ucontrasena;
    }

    /**
     *
     * @return uid
     */
    public int getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     *
     * @return unombre
     */
    public String getUnombre() {
        return unombre;
    }

    /**
     *
     * @param unombre
     */
    public void setUnombre(String unombre) {
        this.unombre = unombre;
    }

    /**
     *
     * @return ucontrasena
     */
    public String getUcontrasena() {
        return ucontrasena;
    }

    /**
     *
     * @param ucontrasena
     */
    public void setUcontrasena(String ucontrasena) {
        this.ucontrasena = ucontrasena;
    }
}
