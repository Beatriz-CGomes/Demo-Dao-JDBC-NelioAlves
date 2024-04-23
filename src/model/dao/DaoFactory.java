package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	// vai ter operações statica para instanciar os dao

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
