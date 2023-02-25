package com.luoxiaohei;

import com.luoxiaohei.dao.UserDao;
import com.luoxiaohei.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

	@Autowired
	private UserDao userDao;

	//增
	@Test
	void testSave() {
		User user = new User( );
//		user.setId(667L);
		user . setName("黑马程序员");
		user . setPassword( " itheima");
		user. setAge(12);
		user. setTel("4006184000");
		userDao. insert(user);
	}

	//删(重点是逻辑删除)
	@Test
	void testDelete(){
//		List<Long> ids =new ArrayList<>();
//		ids.add(1614176998595420162L);
//		ids.add(1614179535776018433L);
//		userDao.deleteBatchIds(ids);

		userDao.deleteById(2L);
//		System.out.println(userDao.selectList(null));
	}

	//改
	@Test
	void testUpdate(){
		//模拟两个用户
		User user1 = userDao.selectById(3L);
		User user2=userDao.selectById(3L);

		user2.setName("jock2");
		userDao.updateById(user2);

		user1.setName("jock1");
		userDao.updateById(user1);
	}
}
