package BD;

public class Albumes {

    int aid, yid, atid;
    String atitulo;

    /**
     *
     * @param aid
     * @param yid
     * @param atid
     * @param atitulo
     */
    public Albumes(int aid, int yid, int atid, String atitulo) {
        this.aid = aid;
        this.yid = yid;
        this.atid = atid;
        this.atitulo = atitulo;
    }

    /**
     *
     * @return aid
     */
    public int getAid() {
        return aid;
    }

    /**
     *
     * @param aid
     */
    public void setAid(int aid) {
        this.aid = aid;
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
     * @return atitulo
     */
    public String getAtitulo() {
        return atitulo;
    }

    /**
     *
     * @param atitulo
     */
    public void setAtitulo(String atitulo) {
        this.atitulo = atitulo;
    }
}
