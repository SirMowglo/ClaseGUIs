package RelacionInterfaces.Ejercicio3;

public class Ejercicio3_calculo {

    //CONSTRUCTOR
    public Ejercicio3_calculo() {
    }

    //METHODS
    public double calculoIMC(double peso, double estatura){
        double res=0;
        res = peso/(estatura*estatura);
        return res;
    }
}
