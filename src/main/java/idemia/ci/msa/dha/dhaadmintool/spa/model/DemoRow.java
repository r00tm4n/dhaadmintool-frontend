package idemia.ci.msa.dha.dhaadmintool.spa.model;

public class DemoRow {
    private int type;
    private String idnOrPcn;
    private String tcn;
    private String registrationId;
    private String batchNumber;
    private String formNumber;
    private String inactive;
    private String blocked;
    private String dead;
    private String dateCreated;
    private String personCreateDate;
    private String dateLastModified;

    // Getters and setters
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }

    public String getIdnOrPcn() {
        return idnOrPcn;
    }
    public void setIdnOrPcn(String idnOrPcn) {
        this.idnOrPcn = idnOrPcn;
    }

    public String getTcn() {
        return tcn;
    }
    public void setTcn(String tcn) {
        this.tcn = tcn;
    }

    public String getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getFormNumber() {
        return formNumber;
    }
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    public String getInactive() {
        return inactive;
    }
    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getBlocked() {
        return blocked;
    }
    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getDead() {
        return dead;
    }
    public void setDead(String dead) {
        this.dead = dead;
    }

    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPersonCreateDate() {
        return personCreateDate;
    }
    public void setPersonCreateDate(String personCreateDate) {
        this.personCreateDate = personCreateDate;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }
}
