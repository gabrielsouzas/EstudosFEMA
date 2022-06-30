package estudos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class InicialMB {
	
	public String prepararAcessoMenuEstado(){
		return "menuEstado";
	}

}
