package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.UserDao;
import entity.User;
@Repository
public class UserDaoimpl extends HibernateDaoSupport   implements UserDao   {

	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from user";
		Query query=getSessionFactory().openSession().createSQLQuery(sql).addEntity(User.class);
		List<User> list=query.list();
		return list ;
	}

	public int insert(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(User t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}




}
