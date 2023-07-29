
package models;

public class RegisteredSportModel {
    private String studentId;
    private String id;
    private String sportID;
    private String sportName;
    private String coachID;
    private String coachName;
    private String sportsCenter;
    private String startTime;
    private String endTime;
    private int hours;

    public RegisteredSportModel() {
    }

    public RegisteredSportModel(String studentId, String id, String sportID, String sportName, String coachID, String coachName, String sportsCenter, String startTime, String endTime, int hours) {
        this.studentId = studentId;
        this.id = id;
        this.sportID = sportID;
        this.sportName = sportName;
        this.coachID = coachID;
        this.coachName = coachName;
        this.sportsCenter = sportsCenter;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hours = hours;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCoachID() {
        return coachID;
    }

    public void setCoachID(String coachID) {
        this.coachID = coachID;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getSportsCenter() {
        return sportsCenter;
    }

    public void setSportsCenter(String sportsCenter) {
        this.sportsCenter = sportsCenter;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    
}
