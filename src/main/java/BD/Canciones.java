package BD;


import java.sql.*;

public class Canciones {

    int cid, yid, aid, atid;
    String ctitulo;

    /**
     *
     * @param cid
     * @param yid
     * @param aid
     * @param atid
     * @param ctitulo
     */
    public Canciones(int cid, int yid, int aid, int atid, String ctitulo) {
        this.cid = cid;
        this.yid = yid;
        this.aid = aid;
        this.atid = atid;
        this.ctitulo = ctitulo;
    }

    /**
     *
     * @return cid
     */
    public int getCid() {
        return cid;
    }

    /**
     *
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
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
     * @return ctitulo
     */
    public String getCtitulo() {
        return ctitulo;
    }

    /**
     *
     * @param ctitulo
     */
    public void setCtitulo(String ctitulo) {
        this.ctitulo = ctitulo;
    }
}
