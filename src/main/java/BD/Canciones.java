package BD;


import java.sql.*;

public class Canciones {

    int cid, yid, aid, atid;
    String ctitulo;

    public Canciones(int cid, int yid, int aid, int atid, String ctitulo) {
        this.cid = cid;
        this.yid = yid;
        this.aid = aid;
        this.atid = atid;
        this.ctitulo = ctitulo;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public String getCtitulo() {
        return ctitulo;
    }

    public void setCtitulo(String ctitulo) {
        this.ctitulo = ctitulo;
    }
}
