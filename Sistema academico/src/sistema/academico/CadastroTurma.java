package sistema.academico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;
@SuppressWarnings("unused")
public class CadastroTurma extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblCdigo;
	private JLabel lblNome;
	private JLabel lblLocal;
	private JLabel lblHorrio;
	private final Action action = new SwingAction();
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTurma frame = new CadastroTurma();
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
	public CadastroTurma() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(92, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 65, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 96, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(92, 127, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setBounds(10, 36, 72, 17);
		contentPane.add(lblCdigo);
		
		lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(20, 68, 46, 14);
		contentPane.add(lblNome);
		
		lblLocal = new JLabel("Local");
		lblLocal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocal.setBounds(20, 99, 46, 14);
		contentPane.add(lblLocal);
		
		lblHorrio = new JLabel("Hor\u00E1rio");
		lblHorrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorrio.setBounds(20, 130, 46, 14);
		contentPane.add(lblHorrio);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setAction(action);
		btnCadastrar.setBounds(60, 169, 89, 23);
		contentPane.add(btnCadastrar);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ArlindoFM\\Desktop\\Trabson Dayse\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Cadastrar");
			putValue(SHORT_DESCRIPTION, "Efetua cadastro da turma.");
		}
		public void actionPerformed(ActionEvent e) {
			Turma turma = new Turma();
			String txt  = textField.getText();
			String txt1 = textField_1.getText();
			String txt2 = textField_2.getText();
			String txt3 = textField_3.getText();
			turma.setCodigo(txt);
			turma.setDisciplina(txt1);
			turma.setHorario(txt2);
			turma.setLocal(txt3);
			JOptionPane.showMessageDialog(null,"Turma cadastrada com sucesso!!!");
		}
	}
}
