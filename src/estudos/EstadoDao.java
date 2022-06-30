package estudos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class EstadoDao {
	
	public void cadastrarEstado(EstadoBean eb)throws Exception{
		Session s = HibernateUtil.getSession();
		s.beginTransaction();
		s.save(eb);
		s.getTransaction().commit();
	}
	
	public List<EstadoBean> recuperarEstados()throws Exception{
		Session s = HibernateUtil.getSession();
		s.beginTransaction();
		Criteria c = s.createCriteria(EstadoBean.class);
		c.addOrder(Order.asc("nome"));
		List<EstadoBean> resultado = c.list();
		s.getTransaction().commit();
		return resultado;
	}

}
