package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Color;
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
    JPanel pnCentro = new JPanel();
    JPanel pnSul = new JPanel();
    JPanel pnNorte = new JPanel();
    
    private JPanel painelCentroLinha1 = new JPanel();
    private JPanel painelCentroLinha2 = new JPanel();
    private JPanel painelCentroLinha3 = new JPanel();
    private JPanel painelCentroLinha4 = new JPanel();
    private JPanel painelCentroLinha5 = new JPanel();
    private JPanel painelCentroLinha6 = new JPanel();
    
    private JLabel lbPontox1 = new JLabel("Ponto x1");
    private JLabel lbPontoy1 = new JLabel("Ponto y1");
    private JLabel lbPontox2 = new JLabel("Ponto x2");
    private JLabel lbPontoy2 = new JLabel("Ponto y2");
    private JLabel lbDistancia = new JLabel("Distância entre os produtos");
    private JLabel lbVazio1 = new JLabel("          ");
    private JLabel lbVazio2 = new JLabel("          ");
    
    
    private JTextField tfPontox1 = new JTextField(5);
    private JTextField tfPontox2 = new JTextField(5);
    private JTextField tfPontoy1 = new JTextField(5);
    private JTextField tfPontoy2 = new JTextField(5);
    
    private JTextField tfResultado = new JTextField(10);
    
    
    private JButton btCalcular = new JButton("Calcular");
    
    private JLabel lbAvisoNorte = new JLabel("Bem-vindo ao programa");
    
    private JLabel lbAviso = new JLabel("--");

    public GUI() {
        setSize(500, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("Exercício 03 - Lista 02");
        
        cp.add(pnNorte, BorderLayout.NORTH);
        cp.add(pnCentro, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);
        
        pnSul.setBackground(Color.CYAN);
        
        pnNorte.add(lbAvisoNorte);
        pnNorte.setBackground(Color.WHITE);
        
        
        pnCentro.setLayout(new GridLayout(6,1));
        pnCentro.add(painelCentroLinha1);
        pnCentro.add(painelCentroLinha2);
        pnCentro.add(painelCentroLinha3);
        pnCentro.add(painelCentroLinha4);
        pnCentro.add(painelCentroLinha5);
        pnCentro.add(painelCentroLinha6);
        painelCentroLinha1.setBackground(Color.CYAN);
        painelCentroLinha2.setBackground(Color.CYAN);
        painelCentroLinha3.setBackground(Color.CYAN);
        painelCentroLinha4.setBackground(Color.cyan);
        painelCentroLinha5.setBackground(Color.cyan);
        painelCentroLinha6.setBackground(Color.CYAN);
        
        painelCentroLinha1.add(lbPontox1);
        painelCentroLinha1.add(tfPontox1);
        painelCentroLinha1.add(lbVazio1);
        painelCentroLinha1.add(lbPontox2);
        painelCentroLinha1.add(tfPontox2);
        
        painelCentroLinha2.add(lbPontoy1);
        painelCentroLinha2.add(tfPontoy1);
        painelCentroLinha2.add(lbVazio2);
        painelCentroLinha2.add(lbPontoy2);
        painelCentroLinha2.add(tfPontoy2);
        
        painelCentroLinha4.add(btCalcular);
        
        painelCentroLinha5.add(lbDistancia);
        
        painelCentroLinha6.add(tfResultado);
        
        pnSul.add(lbAviso);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Processamento processamento = new Processamento();
                lbAviso.setText("----");
                lbAviso.setOpaque(true);
                lbAviso.setBackground(Color.green);
                
                try{
                    
                    
                    processamento.setX1(Double.valueOf(tfPontox1.getText()));
                    processamento.setX2(Double.valueOf(tfPontox2.getText()));
                    processamento.setY1(Double.valueOf(tfPontoy1.getText()));
                    processamento.setY2(Double.valueOf(tfPontoy2.getText()));
                    
                    tfResultado.setText(String.valueOf(processamento.getResult()));
                }catch(Exception error){
                    lbAviso.setText("Erro -->, digite um número" + error.getMessage());
                    lbAviso.setBackground(Color.red);
                }
            }
        });
        

        

        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
