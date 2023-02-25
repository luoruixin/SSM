package com.luoxiaohei;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luoxiaohei.dao.UserDao;
import com.luoxiaohei.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

	@Autowired
	private UserDao userDao;

	//新增
	@Test
	void testSave(){
		User user=new User();
		user.setName("luoxiaohei");
		user.setPassword("123456");
		user.setAge(12);
		user.setTel("10086");
		userDao.insert(user);
	}

	//删除
	@Test
	void testDelete(){
		userDao.deleteById(1613426380024971265L);
	}

	//修改
	@Test
	void testUpdate(){
		User user=new User();
		user.setId(1L);
		user.setName("Tom666");
		user.setPassword("tom999");
		userDao.updateById(user);
	}

	@Test
	void testGetAll() {
		List<User> userList = userDao.selectList(null);
		System.out.println(userList);
	}

	//分页查询
	@Test
	void testGetByPage(){
		//注意这里要开启一个分页拦截器---》在MpConfig里

		//2代表查询第几页，3代表一页有多少条
		IPage page=new Page(2,3);
		userDao.selectPage(page,null);
		System.out.println("当前页码值:"+page.getCurrent());
		System.out.println("每页显示数:"+page.getSize());
		System.out.println("一共多少页:"+page.getPages());
		System.out.println("一共多少条:"+page.getTotal());
		System.out.println("数据:"+page.getRecords());
	}
}
