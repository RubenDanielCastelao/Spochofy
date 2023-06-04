package BD;

public class ListasRep {

    int lid, uid;
    String lnombre;

    public ListasRep(int lid, int uid, String lnombre) {
        this.lid = lid;
        this.uid = uid;
        this.lnombre = lnombre;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getLnombre() {
        return lnombre;
    }

    public void setLnombre(String lnombre) {
        this.lnombre = lnombre;
    }
}
