package sistema.academico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class CadastroNotas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final Action Cadastrar = new CadastrarNota();

	/**
	 * Launch the application.
	 */
	public static float strTofloat (String valor, float padrao) {
		try {
			return Float.valueOf(valor);
		}
		catch (NumberFormatException e) {
			return padrao;
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroNotas frame = new CadastroNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroNotas() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setAction(Cadastrar);
		btnCadastrar.setBounds(207, 76, 89, 23);
		contentPane.add(btnCadastrar);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\ArlindoFM\\Desktop\\Trabson Dayse\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-367, -212, 1087, 812);
		contentPane.add(label);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(27, 26, 74, 23);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(27, 51, 74, 23);
		contentPane.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setBounds(27, 76, 89, 23);
		contentPane.add(lblNota_2);
		
		textField = new JTextField();
		textField.setBounds(111, 27, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 52, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 77, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

	private class CadastrarNota extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadastrarNota() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Notas nota = new Notas();
			String notas = textField.getText();
			String notas1 = textField_1.getText();
			String notas2 = textField_2.getText();
			float nota1,nota2,nota3;
			nota1 = Float.valueOf(notas);
			nota2 = Float.valueOf(notas1);
			nota3 = Float.valueOf(notas2);
			nota.setNota1(nota1);
			nota.setNota2(nota2);
			nota.setNota3(nota3);
			JOptionPane.showMessageDialog(null,"Notas Cadastradas com Sucesso!!!");
		}
		
	}
}
