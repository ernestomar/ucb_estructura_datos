package bo.edu.ucb.est.listaV2;

public class Teacher {

    private String fullName;
    private String profession;

    public Teacher(String fullName, String profession) {
        this.fullName = fullName;
        this.profession = profession;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfession() {
        return profession;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher[" + this.fullName + " -  " + this.profession + " ] ";
    }

}
