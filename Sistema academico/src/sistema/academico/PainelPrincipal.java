package sistema.academico;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
@SuppressWarnings("unused")

public class PainelPrincipal extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nome;
	private JPanel contentPane;
	private final Action actAluno = new CadasAluno();
	private final Action actProf = new CadasProf();
	private JMenu mnNewMenu;
	private final Action actDisci = new CadasDisci();
	private final Action actTurma = new CadasTurma();
	private JTextField txtDigiteOUsuario;
	CadastroAluno frame2 = new CadastroAluno();
	CadastroProf  frame3 = new CadastroProf();
	CadastroDisci frame4 = new CadastroDisci();
	CadastroAdmin frame5 = new CadastroAdmin();
	CadastroTurma frame6 = new CadastroTurma();
	private JPasswordField passwordField;
	private final Action action = new CadasAdmin();
	private final Action action_1 = new Acessar();
	private final Action action_2 = new SwingAction();
	private final Action action_3 = new SwingAction_1();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelPrincipal frame = new PainelPrincipal();
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
	public PainelPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 611);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		mnNewMenu.setEnabled(false);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastro Aluno");
		mntmNewMenuItem.setAction(actAluno);
		mntmNewMenuItem.addActionListener(actAluno);
		
		JMenuItem mntmCadastrarNotas = new JMenuItem("Cadastrar Notas");
		mnNewMenu.add(mntmCadastrarNotas);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastrarAdmin = new JMenuItem("Cadastrar Admin");
		mntmCadastrarAdmin.setAction(action);
		mnNewMenu.add(mntmCadastrarAdmin);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Cadastro Professor");
		mntmNewMenuItem_3.setAction(actProf);
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cadastro Disciplina");
		mntmNewMenuItem_2.setAction(actDisci);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastro Turma");
		mntmNewMenuItem_1.setAction(actTurma);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Listar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmListarNotas = new JMenuItem("Listar Notas");
		mntmListarNotas.setAction(action_3);
		mnNewMenu_1.add(mntmListarNotas);
		
		JMenuItem mntmListarAlunos = new JMenuItem("Listar Alunos");
		mnNewMenu_1.add(mntmListarAlunos);
		
		JMenuItem mntmListarProfessores = new JMenuItem("Listar Professores");
		mnNewMenu_1.add(mntmListarProfessores);
		
		JMenuItem mntmListarTurmas = new JMenuItem("Listar Turmas");
		mnNewMenu_1.add(mntmListarTurmas);
		
		JMenuItem mntmListarDisciplinas = new JMenuItem("Listar Disciplinas");
		mnNewMenu_1.add(mntmListarDisciplinas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setToolTipText("Acessar");
		btnAcessar.setAction(action_1);
		btnAcessar.setBounds(286, 292, 124, 26);
		contentPane.add(btnAcessar);
		
		txtDigiteOUsuario = new JTextField();
		txtDigiteOUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDigiteOUsuario.setText("Digite o Usuario");
		txtDigiteOUsuario.setBounds(276, 210, 141, 30);
		contentPane.add(txtDigiteOUsuario);
		txtDigiteOUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 13));
		passwordField.setToolTipText("Senha");
		passwordField.setBounds(276, 251, 141, 30);
		contentPane.add(passwordField);
		
		JButton btnAtivarMenu = new JButton("Ativar Menu");
		btnAtivarMenu.setAction(action_2);
		btnAtivarMenu.setBounds(37, 403, 103, 23);
		contentPane.add(btnAtivarMenu);
		
		JLabel label = new JLabel("New label");
		label.setIcon(fundo.jpg);;
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-367, -212, 1087, 812);
		contentPane.add(label);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class CadasAluno extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadasAluno() {
			putValue(NAME, "Cadastrar Aluno");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CadastroAluno.main(null);
			frame2.setVisible(true);
		}				
		
	}
	private class CadasProf extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadasProf() {
			putValue(NAME, "Cadastrar Professor");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CadastroProf.main(null);
			frame3.setVisible(true);
		}
	}
	private class CadasDisci extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadasDisci() {
			putValue(NAME, "Cadastrar Disciplina");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CadastroDisci.main(null);
			frame4.setVisible(true);
		}
	}
	private class CadasTurma extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadasTurma() {
			putValue(NAME, "Cadastrar Turma");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CadastroTurma.main(null);
			frame6.setVisible(true);
		}
	}
	private class CadasAdmin extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public CadasAdmin() {
			putValue(NAME, "Cadastrar Admin");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CadastroAdmin.main(null);
			frame5.setVisible(true);
		}
	}
	private class Acessar extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Acessar() {
			putValue(NAME, "Acessar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Admin admin = new Admin(null);
			mnNewMenu.setEnabled(true);
			String senha = passwordField.getName();
			String login = txtDigiteOUsuario.getText();
			boolean login1,senha1;
			login1 = admin.comparaLogin(login);
			senha1 = admin.comparaSenha(senha);
			if(admin.login(login1, senha1)==true) {
				JOptionPane.showMessageDialog(null,"Login feito com sucesso!");
				mnNewMenu.setEnabled(true);
			}else if(admin.comparaLogin(login)==false) {
				JOptionPane.showMessageDialog(null,"Usuário Incorreto!");
			}else if(admin.comparaSenha(senha)==false) {
				JOptionPane.showMessageDialog(null,"Senha Incorreta!");
			}else if(admin.comparaLogin(login)&&admin.comparaSenha(senha)==false) {
				JOptionPane.showMessageDialog(null,"Usuário e Senha Incorretos!");
			}
		}
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Ativar Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			mnNewMenu.setEnabled(true);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			putValue(NAME, "Listar Notas");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}