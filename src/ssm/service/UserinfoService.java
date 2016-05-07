package ssm.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.AllDao;
import ssm.orm.Userinfo;

@Service
public class UserinfoService {

	@Autowired
	private AllDao allDao;

	public void insertUserinfo(String username, String password, int age,
			Date insertDate) {
		Userinfo userinfo = new Userinfo(-1, username, password, age,
				insertDate);
		allDao.getUserinfoDao().insertUserinfo(userinfo);
	}

}
