public class Problema2_EstudianteBase1 {
    private String nombre;
    private int edad;
    private double notaF;
    private Problema2_MateriaBase2 materia;

    
    Problema2_EstudianteBase1(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setMateria(Problema2_MateriaBase2 materia){
        this.materia = materia;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getNotaFinal(){
        return this.notaF;
    }

    public boolean validarMateria(){
        this.notaF = (materia.getNotaAA() * 0.35) + (materia.getNotaACD()* 0.3) + (materia.getNotaAPE()* 0.35);
        return notaF>=7;
    }
}
