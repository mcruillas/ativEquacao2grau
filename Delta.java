package ativequacao2grau;

public class Delta extends Equacao {
    double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta){
        this.delta = delta;
    }

    public double AcheODelta(double a, double b, double c){
        delta = Math.sqrt(b) - (4*a*c);
        return delta;
    }
}
