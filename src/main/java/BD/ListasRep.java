package BD;

public class ListasRep {

    int lid, uid;
    String lnombre;

    /**
     *
     * @param lid
     * @param uid
     * @param lnombre
     */
    public ListasRep(int lid, int uid, String lnombre) {
        this.lid = lid;
        this.uid = uid;
        this.lnombre = lnombre;
    }

    /**
     *
     * @return lid
     */
    public int getLid() {
        return lid;
    }

    /**
     *
     * @param lid
     */
    public void setLid(int lid) {
        this.lid = lid;
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
     * @return lnombre
     */
    public String getLnombre() {
        return lnombre;
    }

    /**
     *
     * @param lnombre
     */
    public void setLnombre(String lnombre) {
        this.lnombre = lnombre;
    }
}
