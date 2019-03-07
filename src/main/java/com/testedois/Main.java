package com.testedois;

import java.util.List;

import org.hibernate.Session;

import dao.ClienteDAO;
import entidades.Cliente;
import hibernate.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		try {
//			Session s = HibernateUtil.getSession();

			ClienteDAO cDAO = new ClienteDAO();
			List<Cliente> cList = cDAO.getClienteList();
			for (Cliente cliente : cList) {
				System.out.println("###inicio - lista de clinete###");
				System.out.println(cliente.getNome());
			}
			System.out.println("###fim - lista de clinete###");

			cDAO.save();
			System.out.println("sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
