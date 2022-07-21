package ativequacao2grau;

public class EquacaoX {
    private double xn;
    private double xp;
}

public double getXn(){
    return xn
}
public void setXn(){
    this.xn = xn;
}
public double getXp(){
    return xp
}
public void setXp(){
    this.xp = xp;
}

//region Regra de negócios

public double calculaXn(double delta){
    xn=(-d.getB()-Math.sqrt(d.getDelta()))/(2*d.getA());
    return xn;
}
