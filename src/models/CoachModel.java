
package models;

public class CoachModel {
    private String coachID;
    private String coachName;
    private String joinDate;
    private String sportsCenter;
    private int hourlyRate;
    private String phone;
    private String address;
    private String sportId;
    private String sportName;

    public CoachModel() {
    }

    public CoachModel(String coachID, String coachName, String joinDate, String sportsCenter, int hourlyRate, String phone, String address, String sportId, String sportName) {
        this.coachID = coachID;
        this.coachName = coachName;
        this.joinDate = joinDate;
        this.sportsCenter = sportsCenter;
        this.hourlyRate = hourlyRate;
        this.phone = phone;
        this.address = address;
        this.sportId = sportId;
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

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getSportsCenter() {
        return sportsCenter;
    }

    public void setSportsCenter(String sportsCenter) {
        this.sportsCenter = sportsCenter;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    
    
}
