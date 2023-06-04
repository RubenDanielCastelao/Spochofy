package BD;

public class Artistas {

    int atid;
    String atnombre;

    /**
     *
     * @param atid
     * @param atnombre
     */
    public Artistas(int atid, String atnombre) {
        this.atid = atid;
        this.atnombre = atnombre;
    }

    /**
     *
     * @return atid
     */
    public int getAtid() {
        return atid;
    }

    /**
     *
     * @param atid
     */
    public void setAtid(int atid) {
        this.atid = atid;
    }

    /**
     *
     * @return atnombre
     */
    public String getAtnombre() {
        return atnombre;
    }

    /**
     *
     * @param atnombre
     */
    public void setAtnombre(String atnombre) {
        this.atnombre = atnombre;
    }
}
