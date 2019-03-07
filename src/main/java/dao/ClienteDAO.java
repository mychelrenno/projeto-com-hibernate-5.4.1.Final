package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Cliente;
import hibernate.HibernateUtil;
import hibernate.HibernateUtil2;

public class ClienteDAO {

	
	public List<Cliente> getClienteList () {
//		Criteria crit = session.createCriteria(Product.class);
//		crit.add(Restrictions.ne("description","Mouse"));
//		List<Product> results = crit.list();
		
		Criteria crit = HibernateUtil.getSession().createCriteria(Cliente.class);
		List<Cliente> clienteList = crit.list();
		
		return clienteList;
	}
	
	public void save() {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		Cliente c = new Cliente();
//		c.setId(1);
		c.setNome("mychelrennotestedois");
		c.setEndereco("aaaaaaaaaaaaaa");
		c.setTelefone("9999999999999");
		
		session.saveOrUpdate(c);
		
		transaction.commit();
		session.close();
//		HibernateUtil2.shutdown();
	}
	
	public void save2() {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
//		Transaction transaction = HibernateUtil.getSession().beginTransaction();
		
		
		
		Cliente c = new Cliente();
//		c.setId(1);
		c.setNome("mychelrennotestedois");
		c.setEndereco("aaaaaaaaaaaaaa");
		c.setTelefone("9999999999999");
		
		session.saveOrUpdate(c);
		
		transaction.commit();
//		session.close();
//		HibernateUtil2.shutdown();
	}
}
