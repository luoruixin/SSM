package com.luoxiaohei;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luoxiaohei.dao.UserDao;
import com.luoxiaohei.domain.User;
import com.luoxiaohei.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void testGetAll() {
		//lt是小于，gt是大于,ge是大于等于

		//1：按条件查询
		QueryWrapper qw1=new QueryWrapper();
		qw1.lt("age",18);
		List<User> userList1 = userDao.selectList(qw1);
		System.out.println(userList1);


		//2：lambda格式按条件查询(防止age字符串写错)
		QueryWrapper<User> qw2=new QueryWrapper();
		qw2.lambda().lt(User::getAge,10);
		List<User> userList2 = userDao.selectList(qw2);
		System.out.println(userList2);


		//3：lambda格式按条件查询
		LambdaQueryWrapper<User> lqw3=new LambdaQueryWrapper<>();
		//10到30岁之间
//		lqw.lt(User::getAge,30).gt(User::getAge,10);
		//小于10岁或者大于30岁
		lqw3.lt(User::getAge,10).or().gt(User::getAge,30);
		List<User> userList3 = userDao.selectList(lqw3);
		System.out.println(userList3);


		//4:条件查询中的null值判定
		UserQuery uq=new UserQuery();
//		uq.setAge(10);//下限是10
		uq.setAge2(30);//上限是30
		LambdaQueryWrapper<User> lqw4=new LambdaQueryWrapper<>();
		//先判定第一个参数是否为true,如果为true连按当前条件
		lqw4.lt(null!=uq.getAge2(),User::getAge,uq.getAge2());
		lqw4.gt(null!=uq.getAge(),User::getAge,uq.getAge());//此时uq.getAge()值为null,不连接此条件
		List<User> userList4 = userDao.selectList(lqw4);
		System.out.println(userList4);


		//5.查询投影:只查询部分字段
//		LambdaQueryWrapper<User> lqw5=new LambdaQueryWrapper<>();
//		lqw5.select(User::getId,User::getName,User::getAge);
		QueryWrapper<User> lqw5=new QueryWrapper<>();
		lqw5.select("id","name");
		List<User> userList5 = userDao.selectList(lqw5);
		System.out.println(userList5);


		//6.聚合查询
		QueryWrapper<User> lqw6=new QueryWrapper<>();
		lqw6.select("count(*) as count");
		//<Map<String, Object>>表示以键值对的格式进行查询
		List<Map<String, Object>> userList6 = userDao.selectMaps(lqw6);
		System.out.println(userList6);


		//7.分组查询
		QueryWrapper<User> lqw7=new QueryWrapper<>();
		lqw7.select("count(*) as count,tel");
		lqw7.groupBy("tel");
		List<Map<String, Object>> userList7 = userDao.selectMaps(lqw7);
		System.out.println(userList7);


		//8.等值查询:查询一个
		LambdaQueryWrapper<User> lqw8=new LambdaQueryWrapper<>();
		lqw8.eq(User::getName, "Jerry").eq(User::getPassword, "jerry");
		User user8=userDao.selectOne(lqw8);
		System.out.println(user8);


		//9.模糊匹配
		LambdaQueryWrapper<User> lqw9=new LambdaQueryWrapper<>();
//		lqw9.like(User::getName,"J");
//		lqw9.likeLeft(User::getName,"J");  //实际为 %J,所以没有
		lqw9.likeRight(User::getName,"J");  //实际为 J%,所以有两个
		List<User> user9=userDao.selectList(lqw9);
		System.out.println(user9);
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
