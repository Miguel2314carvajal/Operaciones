import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos extends  JFrame{
    private JLabel Nombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton SumarButton;
    private JButton enviarButton1;
    private JButton borrarButton;
    private JPanel Jpanel1;
    private JLabel Apellido;
    private JPanel Jpanel2;
    private JButton Limpiar;

    private JTextField textCompleto;
    private JButton Concatenar;
    private JTextField sumatoria;
    private JLabel NombreCompleto;
    private JLabel Sumatoria;

    public Datos(){
        super("Operaciones");
        setContentPane(Jpanel2);
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtApellido.setText("");

            }
        });

        Concatenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Hola"+txtNombre+ " "+txtApellido);
                //textCompleto.setText("txtNombre + txtApellido");
                String nom1 = txtNombre.getText();
                String nom2 = txtApellido.getText();
                String recibe_resultado = nom1 + nom2;
                textCompleto.setText(recibe_resultado);

            }
        });
        SumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double val1 = Double.parseDouble(txtNombre.getText());
                    Double val2 = Double.parseDouble(txtApellido.getText());
                    double recibe_resultado2 = val1 + val2;
                    sumatoria.setText(Double.toString(recibe_resultado2));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"No se puede sumar");
                }
            }
        });
    }
}
