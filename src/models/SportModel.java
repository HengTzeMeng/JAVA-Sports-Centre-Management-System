
package models;

public class SportModel {
    private String sportID;
    private String sportName;

    public SportModel() {
    }

    public SportModel(String sportID, String sportName) {
        this.sportID = sportID;
        this.sportName = sportName;
    }

    public String getSportID() {
        return sportID;
    }

    public void setSportID(String sportID) {
        this.sportID = sportID;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    
    
}
