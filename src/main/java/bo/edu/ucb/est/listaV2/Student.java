package bo.edu.ucb.est.listaV2;

public class Student {

    private String name;
    // En el ejemplo con alumno, aquí tenía que ponber el apuntador a siguiente 
    
    public  Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ["+ name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if ( obj != null && obj instanceof Student ) {
            Student other = (Student) obj; 
            if (other.name.equals(this.name)) {
                result = true;
            }
        } 

        return result;
    }

    @Override
    public int hashCode() {
        if (this.name != null) {
            return this.name.hashCode();
        } else {
            return 0;
        }   
        
    }
}
