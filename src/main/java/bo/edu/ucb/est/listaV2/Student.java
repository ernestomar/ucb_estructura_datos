package bo.edu.ucb.est.listaV2;

public class Student extends Object {

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
        return "Student["+ name + "]";
    }
}
