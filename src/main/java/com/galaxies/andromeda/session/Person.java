
package com.galaxies.andromeda.session;

import com.galaxies.andromeda.DB.Filler;

/**
 *
 * @author Azael Reyes
 */
public abstract class Person implements Filler
{
    private String N1;
    private String Ns;
    private String AP;
    private String AM;
    private int ID;
    private String DB;

    /**
     * @return the N1
     */
    public String getN1() {
        return N1;
    }

    /**
     * @param N1 the N1 to set
     */
    public void setN1(String N1) {
        this.N1 = N1;
    }

    /**
     * @return the Ns
     */
    public String getNs() {
        return Ns;
    }

    /**
     * @param Ns the Ns to set
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * @return the AP
     */
    public String getAP() {
        return AP;
    }

    /**
     * @param AP the AP to set
     */
    public void setAP(String AP) {
        this.AP = AP;
    }

    /**
     * @return the AM
     */
    public String getAM() {
        return AM;
    }

    /**
     * @param AM the AM to set
     */
    public void setAM(String AM) {
        this.AM = AM;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the BD
     */
    public String getDB() {
        return DB;
    }

    /**
     * @param DB the BD to set
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

}
