package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
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
    
    private JPanel painelCentro = new JPanel();
    
    private JLabel lbCorretor1 = new JLabel("Corretor 1");
    private JLabel lbCorretor2 = new JLabel("Corretor 2");
    private JLabel lbCorretor3 = new JLabel("Corretor 3");
    private JLabel lbComissao1 = new JLabel("Comissão 1");
    private JLabel lbComissao2 = new JLabel("Comissão 2");
    private JLabel lbComissao3 = new JLabel("Comissão 3");
    
    private JPanel painelCentroLinha1 = new JPanel();
    private JPanel painelCentroLinha2 = new JPanel();
    private JPanel painelCentroLinha3 = new JPanel();
    private JPanel painelCentroLinha4 = new JPanel();
    private JPanel painelCentroLinha5 = new JPanel();
    private JPanel painelCentroLinha6 = new JPanel();
    private JPanel painelCentroLinha7 = new JPanel();
    
    private JTextField tfCorretor1 = new JTextField(10);
    private JTextField tfCorretor2 = new JTextField(10);
    private JTextField tfCorretor3 = new JTextField(10);
    private JTextField tfComissao1 = new JTextField(10);
    private JTextField tfComissao2 = new JTextField(10);
    private JTextField tfComissao3 = new JTextField(10);
    
    private JButton btCalcular = new JButton("Calcular");
    
    private JLabel lbVazio1 = new JLabel("                           ");
    private JLabel lbVazio2 = new JLabel("                           ");
    private JLabel lbVazio3 = new JLabel("                           ");
    private JLabel lbVazio4 = new JLabel("                           ");
    private JLabel lbVazio5 = new JLabel("                           ");
    private JLabel lbVazio6 = new JLabel("                           ");
    

    public GUI() {
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("Alexandre Tolomeotti - 1 Bimestre");
        
        cp.add(painelCentro, BorderLayout.CENTER);
        painelCentro.setLayout(new GridLayout(7,1));
        
        painelCentro.add(painelCentroLinha1);
        painelCentro.add(painelCentroLinha2);
        painelCentro.add(painelCentroLinha3);
        painelCentro.add(painelCentroLinha4);
        painelCentro.add(painelCentroLinha5);
        painelCentro.add(painelCentroLinha6);
        painelCentro.add(painelCentroLinha7);
        
        painelCentroLinha1.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelCentroLinha1.add(lbCorretor1);
        painelCentroLinha1.add(tfCorretor1);
        
        painelCentroLinha2.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelCentroLinha2.add(lbCorretor2);
        painelCentroLinha2.add(tfCorretor2);
        
        painelCentroLinha3.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelCentroLinha3.add(lbCorretor3);
        painelCentroLinha3.add(tfCorretor3);

        painelCentroLinha4.add(btCalcular);
        
        painelCentroLinha5.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelCentroLinha5.add(lbComissao1);
        painelCentroLinha5.add(tfComissao1);
        
        painelCentroLinha6.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelCentroLinha6.add(lbComissao2);
        painelCentroLinha6.add(tfComissao2);
        
        painelCentroLinha7.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelCentroLinha7.add(lbComissao3);
        painelCentroLinha7.add(tfComissao3);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Processamento processamento = new Processamento();
                processamento.setCorretor1(Double.valueOf(tfCorretor1.getText()));
                processamento.setCorretor2(Double.valueOf(tfCorretor2.getText()));
                processamento.setCorretor3(Double.valueOf(tfCorretor3.getText()));
                
                tfComissao1.setText(String.valueOf(processamento.getComissao1()));
                tfComissao2.setText(String.valueOf(processamento.getComissao2()));
                tfComissao3.setText(String.valueOf(processamento.getComissao3()));
            }
        });
        

        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
