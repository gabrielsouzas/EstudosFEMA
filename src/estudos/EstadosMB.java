package estudos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EstadosMB {
	
	private List<EstadoBean> estado = null;
	private EstadoBean estadoBean;
	
	public String cadastrarEstado(){
		try{
			EstadoDao dao = new EstadoDao();
			dao.cadastrarEstado(estadoBean);
			return "menuEstado";
		}catch(Exception e){
			return null;
		}
	}
	
	public String prepararConsultaEstado(){
		try {
			EstadoDao dao = new EstadoDao();
			estado = dao.recuperarEstados();
			return "consultarEstado";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public List<EstadoBean> getEstado() {
		return estado;
	}

	public void setEstado(List<EstadoBean> estado) {
		this.estado = estado;
	}

	public String prepararCadastroEstado(){
		this.estadoBean = new EstadoBean();
		return "cadastrarEstado";
	}

	public EstadoBean getEstadoBean() {
		return estadoBean;
	}

	public void setEstadoBean(EstadoBean estadoBean) {
		this.estadoBean = estadoBean;
	}

}
