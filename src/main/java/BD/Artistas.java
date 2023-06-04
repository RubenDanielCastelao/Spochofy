package BD;

public class Artistas {

    int atid;
    String atnombre;

    public Artistas(int atid, String atnombre) {
        this.atid = atid;
        this.atnombre = atnombre;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public String getAtnombre() {
        return atnombre;
    }

    public void setAtnombre(String atnombre) {
        this.atnombre = atnombre;
    }
}
