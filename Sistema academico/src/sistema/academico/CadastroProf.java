package sistema.academico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
@SuppressWarnings("unused")
public class CadastroProf extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCadastro;
	private final Action action = new SwingAction();
    private ListaProfessor professores;
    private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProf frame = new CadastroProf();
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
	public CadastroProf() {
		setType(Type.POPUP);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setAction(action);
		btnCadastrar.setVerticalAlignment(SwingConstants.TOP);
		btnCadastrar.setBounds(27, 85, 132, 23);
		contentPane.add(btnCadastrar);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\ArlindoFM\\Desktop\\Trabson Dayse\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-367, -212, 1087, 812);
		contentPane.add(label);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setAction(action_1);
		btnSair.setBounds(169, 85, 56, 23);
		contentPane.add(btnSair);
		
		txtCadastro = new JTextField();
		txtCadastro.setText("Cadastro");
		txtCadastro.setBounds(27, 34, 151, 20);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Cadastrar");
			putValue(SHORT_DESCRIPTION, "Efetua cadastro do professor");
		}
		public void actionPerformed(ActionEvent e) {
			String txt = txtCadastro.getText();
			Professor prof = new Professor(txt);
		    JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso!!!");
		    professores.inserir(prof);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			putValue(NAME, "Sair");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}