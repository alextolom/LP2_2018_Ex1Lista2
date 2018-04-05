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
        
        painelCentro.setLayout(new GridLayout(8,4));
        painelNorte.add(lbAvisoNorte);
        
        painelCentro.add(lbQuantidade);
        painelCentro.add(lbLanche);
        painelCentro.add(lbPreco);
        painelCentro.add(lbSubtotal);
        painelCentro.add(tfQntxSalada);
        painelCentro.add(lbXSalada);
        painelCentro.add(lbPxSalada);
        painelCentro.add(tfxSalada);
        painelCentro.add(tfQntxEgg);
        painelCentro.add(lbXEgg);
        painelCentro.add(lbPxEgg);
        painelCentro.add(tfxEgg);
        painelCentro.add(tfQntxFrango);
        painelCentro.add(lbXFrango);
        painelCentro.add(lbPxFrango);
        painelCentro.add(tfxFrango);
        painelCentro.add(tfQntxTudo);
        painelCentro.add(lbXTudo);
        painelCentro.add(lbPxTudo);
        painelCentro.add(tfxTudo);
        painelCentro.add(tfQntxNerd);
        painelCentro.add(lbXNerd);
        painelCentro.add(lbPxNerd);
        painelCentro.add(tfxNerd);
        painelCentro.add(lbVazio1);
        painelCentro.add(lbVazio2);
        painelCentro.add(lbVazio3);
        painelCentro.add(lbVazio4);
        painelCentro.add(btCalcular);
        painelCentro.add(lbVazio5);
        painelCentro.add(lbTotal);
        painelCentro.add(tfTotal);



        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
