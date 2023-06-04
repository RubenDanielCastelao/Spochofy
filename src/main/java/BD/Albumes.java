package BD;

public class Albumes {

    int aid, yid, atid;
    String atitulo;

    public Albumes(int aid, int yid, int atid, String atitulo) {
        this.aid = aid;
        this.yid = yid;
        this.atid = atid;
        this.atitulo = atitulo;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public String getAtitulo() {
        return atitulo;
    }

    public void setAtitulo(String atitulo) {
        this.atitulo = atitulo;
    }
}
