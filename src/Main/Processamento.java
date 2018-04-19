package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Processamento {

    private double corretor1;
    private double corretor2;
    private double corretor3;
    
    private double comissao1;
    private double comissao2;
    private double comissao3;

    public double getCorretor1() {
        return corretor1;
    }

    public void setCorretor1(double corretor1) {
        this.corretor1 = corretor1;
    }

    public double getCorretor2() {
        return corretor2;
    }

    public void setCorretor2(double corretor2) {
        this.corretor2 = corretor2;
    }

    public double getCorretor3() {
        return corretor3;
    }

    public void setCorretor3(double corretor3) {
        this.corretor3 = corretor3;
    }

    public double getComissao1() {
        if (corretor1<=30000) {
            comissao1 = 0.075*corretor1;
        }else if(corretor1<=50000){
            comissao1 = 0.095*corretor1;
        }else{
            comissao1 = 0.125*corretor1;
        }
        return comissao1;
    }

    public void setComissao1(double comissao1) {
        this.comissao1 = comissao1;
    }

    public double getComissao2() {
        if (corretor2<=30000) {
            comissao2 = 0.075*corretor2;
        }else if(corretor1<=50000){
            comissao2 = 0.095*corretor2;
        }else{
            comissao2 = 0.125*corretor2;
        }
        return comissao2;
    }

    public void setComissao2(double comissao2) {
        this.comissao2 = comissao2;
    }

    public double getComissao3() {
        if (corretor3<=30000) {
            comissao3 = 0.075*corretor3;
        }else if(corretor1<=50000){
            comissao3 = 0.095*corretor3;
        }else{
            comissao3 = 0.125*corretor3;
        }
        return comissao3;
    }

    public void setComissao3(double comissao3) {
        this.comissao3 = comissao3;
    }

   
}
