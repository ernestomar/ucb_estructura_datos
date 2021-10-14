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

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if ( obj != null && obj instanceof Teacher ) {
            Teacher other = (Teacher) obj; 
            if (other.fullName.equals(this.fullName)) {
                result = true;
            }
        } 

        return result;
    }

    @Override
    public int hashCode() {
        if (this.fullName != null) {
            return this.fullName.hashCode();
        } else {
            return 0;
        }   
        
    }

}
