package BD;

public class CancionesLR {

    int lid, cid;

    /**
     *
     * @param lid
     * @param cid
     */
    public CancionesLR(int lid, int cid) {
        this.lid = lid;
        this.cid = cid;
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
}
