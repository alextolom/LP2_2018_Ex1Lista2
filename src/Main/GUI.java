package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {

    private Container cp;
    private JPanel painelNorte = new JPanel();
    private JPanel painelCentro = new JPanel();
    private JLabel lbAvisoNorte = new JLabel("Lanches Nerd S.A");
    
    private JLabel lbQuantidade = new JLabel("Quantidade");
    private JLabel lbLanche = new JLabel("Lanche");
    private JLabel lbPreco = new JLabel("Preço Unitário");
    private JLabel lbSubtotal = new JLabel("Subtotal");
    
    private JLabel lbXSalada = new JLabel("X-Salada");
    private JLabel lbXEgg = new JLabel("X-Egg");
    private JLabel lbXFrango = new JLabel("X-Frango");
    private JLabel lbXTudo = new JLabel("X-Tudo");
    private JLabel lbXNerd = new JLabel("X-Nerd");    
    
    private JLabel lbPxSalada = new JLabel("12,00");
    private JLabel lbPxEgg = new JLabel("9,00");
    private JLabel lbPxFrango = new JLabel("11,00");
    private JLabel lbPxTudo = new JLabel("17,00");
    private JLabel lbPxNerd = new JLabel("15,22");        
    
    private JTextField tfQntxSalada = new JTextField(1000);
    private JTextField tfQntxEgg = new JTextField(1000);
    private JTextField tfQntxFrango = new JTextField(1000);
    private JTextField tfQntxTudo = new JTextField(1000);
    private JTextField tfQntxNerd = new JTextField(1000);
    
    private JTextField tfxSalada = new JTextField(1000);
    private JTextField tfxEgg = new JTextField(1000);
    private JTextField tfxFrango = new JTextField(1000);
    private JTextField tfxTudo = new JTextField(1000);
    private JTextField tfxNerd = new JTextField(1000);
    
    private JLabel lbVazio1 = new JLabel("");
    private JLabel lbVazio2 = new JLabel("");
    private JLabel lbVazio3 = new JLabel("");
    private JLabel lbVazio4 = new JLabel("");
    
    private JPanel painelCentroLinha1 = new JPanel();
    private JPanel painelCentroLinha2 = new JPanel();
    private JPanel painelCentroLinha3 = new JPanel();
    private JPanel painelCentroLinha4 = new JPanel();
    private JPanel painelCentroLinha5 = new JPanel();
    private JPanel painelCentroLinha6 = new JPanel();
    private JPanel painelCentroLinha7 = new JPanel();
    private JPanel painelCentroLinha8 = new JPanel();
    
    private JLabel lbTotal = new JLabel("Total");
    private JLabel lbVazio5 = new JLabel("");
    private JTextField tfTotal = new JTextField(1000);
    
    private JButton btCalcular = new JButton("Calcular");

    public GUI() {
        setSize(1000, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("Exercício 1 Lista 2");
        
        cp.add(painelNorte, BorderLayout.NORTH);
        cp.add(painelCentro, BorderLayout.CENTER);
        
        painelCentro.setLayout(new GridLayout(8,1));
        painelNorte.add(lbAvisoNorte);
        
        painelCentro.add(painelCentroLinha1);
        painelCentro.add(painelCentroLinha2);
        painelCentro.add(painelCentroLinha3);
        painelCentro.add(painelCentroLinha4);
        painelCentro.add(painelCentroLinha5);
        painelCentro.add(painelCentroLinha6);
        painelCentro.add(painelCentroLinha7);
        painelCentro.add(painelCentroLinha8);
        
        painelCentroLinha1.add(lbQuantidade);
        painelCentroLinha1.add(lbLanche);
        painelCentroLinha1.add(lbPreco);
        painelCentroLinha1.add(lbSubtotal);
        
        painelCentroLinha2.add(tfQntxSalada);
        painelCentroLinha2.add(lbXSalada);
        painelCentroLinha2.add(lbPxSalada);
        painelCentroLinha2.add(tfxSalada);
        
        painelCentroLinha3.add(tfQntxEgg);
        painelCentroLinha3.add(lbXEgg);
        painelCentroLinha3.add(lbPxEgg);
        painelCentroLinha3.add(tfxEgg);
        
        painelCentroLinha4.add(tfQntxFrango);
        painelCentroLinha4.add(lbXFrango);
        painelCentroLinha4.add(lbPxFrango);
        painelCentroLinha4.add(tfxFrango);
        
        painelCentroLinha5.add(tfQntxTudo);
        painelCentroLinha5.add(lbXTudo);
        painelCentroLinha5.add(lbPxTudo);
        painelCentroLinha5.add(tfxTudo);
        
        painelCentroLinha6.add(tfQntxNerd);
        painelCentroLinha6.add(lbXNerd);
        painelCentroLinha6.add(lbPxNerd);
        painelCentroLinha6.add(tfxNerd);
        
        painelCentroLinha7.add(lbVazio1);
        painelCentroLinha7.add(lbVazio2);
        painelCentroLinha7.add(lbVazio3);
        painelCentroLinha7.add(lbVazio4);
        
        painelCentroLinha8.add(btCalcular);
        painelCentroLinha8.add(lbVazio5);
        painelCentroLinha8.add(lbTotal);
        painelCentroLinha8.add(tfTotal);


        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
