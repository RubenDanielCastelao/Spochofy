package BD;

public class Anyos {

    int yid;
    String ynumero;

    /**
     *
     * @param yid
     * @param ynumero
     */
    public Anyos(int yid, String ynumero) {
        this.yid = yid;
        this.ynumero = ynumero;
    }

    /**
     *
     * @return yid
     */
    public int getYid() {
        return yid;
    }

    /**
     *
     * @param yid
     */
    public void setYid(int yid) {
        this.yid = yid;
    }

    /**
     *
     * @return ynumero
     */
    public String getYnumero() {
        return ynumero;
    }

    /**
     *
     * @param ynumero
     */
    public void setYnumero(String ynumero) {
        this.ynumero = ynumero;
    }
}
