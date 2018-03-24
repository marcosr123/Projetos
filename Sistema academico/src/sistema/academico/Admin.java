package sistema.academico;

public class Admin extends Pessoa
{
	private String senha;
	public Admin(String nome) {
		super(nome);
	}
	public void setSenha(String senha) {
		this.senha=senha;
	}
	public boolean comparaLogin(String nome) {
		if(this.nome==nome) {
			return true;
		}else {
			return false;
		}
	}
	public boolean comparaSenha(String senha) {
		if(this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}
	public boolean login(boolean login, boolean senha) {
		if(login&&senha == true) {
			return true;
		}else {
			return false;
		}
	}

}
