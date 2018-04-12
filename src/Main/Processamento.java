package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Processamento {
    private double qntXSalada;
    private double qntXEgg;
    private double qntXFrango;
    private double qntXTudo;
    private double qntXNerd;
    private double qntTotal;

    private double pXSalada;
    private double pXEgg;
    private double pXFrango;
    private double pXTudo;
    private double pXNerd;

    public double getQntXSalada() {
        return qntXSalada;
    }

    public void setQntXSalada(double qntXSalada) {
        this.qntXSalada = qntXSalada;
    }

    public double getQntXEgg() {
        return qntXEgg;
    }

    public void setQntXEgg(double qntXEgg) {
        this.qntXEgg = qntXEgg;
    }

    public double getQntXFrango() {
        return qntXFrango;
    }

    public void setQntXFrango(double qntXFrango) {
        this.qntXFrango = qntXFrango;
    }

    public double getQntXTudo() {
        return qntXTudo;
    }

    public void setQntXTudo(double qntXTudo) {
        this.qntXTudo = qntXTudo;
    }

    public double getQntXNerd() {
        return qntXNerd;
    }

    public void setQntXNerd(double qntXNerd) {
        this.qntXNerd = qntXNerd;
    }

    public double getpXSalada() {
        pXSalada = qntXSalada*12.00;
        return pXSalada;
    }

    public void setpXSalada(double pXSalada) {
        this.pXSalada = pXSalada;
    }

    public double getpXEgg() {
        pXEgg = qntXEgg*9.00;
        return pXEgg;
    }

    public void setpXEgg(double pXEgg) {
        this.pXEgg = pXEgg;
    }

    public double getpXFrango() {
        pXFrango = qntXFrango*11.00;
        return pXFrango;
    }

    public void setpXFrango(double pXFrango) {
        this.pXFrango = pXFrango;
    }

    public double getpXTudo() {
        pXTudo = qntXTudo*17.00;
        return pXTudo;
    }

    public void setpXTudo(double pXTudo) {
        this.pXTudo = pXTudo;
    }

    public double getpXNerd() {
        pXNerd = qntXNerd*15.22;
        return pXNerd;
    }

    public void setpXNerd(double pXNerd) {
        this.pXNerd = pXNerd;
    }
        public double getQntTotal() {
        qntTotal = pXSalada + pXEgg + pXFrango + pXTudo + pXNerd;
        return qntTotal;
    }

    public void setQntTotal(double qntTotal) {
        this.qntTotal = qntTotal;
    }
   
}
