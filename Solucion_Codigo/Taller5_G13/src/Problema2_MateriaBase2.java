public class Problema2_MateriaBase2 {
    private String nombre;
    private double notaACD;
    private double notaAPE;
    private double notaAA;

    public Problema2_MateriaBase2(String nombre, double notaACD, double notaAPE, double notaAA) {
        this.nombre = nombre;
        this.notaACD = notaACD;
        this.notaAPE = notaAPE;
        this.notaAA = notaAA;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getNotaACD() {
        return this.notaACD;
    }
    
    public double getNotaAPE() {
        return this.notaAPE;
    }
    
    public double getNotaAA() {
        return this.notaAA;
    }
}
