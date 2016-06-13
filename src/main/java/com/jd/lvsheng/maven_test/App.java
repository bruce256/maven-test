package com.jd.lvsheng.maven_test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;

/**
 * Hello world!
 * 
 */
public class App {

	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSessionFactory.getConfiguration().addMapper(ClientMapper.class);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			ClientFile client = (ClientFile) session.selectOne("client.file.selectOne", 1);
			System.out.println(JSON.toJSONString(client));

			ClientMapper mapper = session.getMapper(ClientMapper.class);
			ClientFile client1 = mapper.selectClient(2);
			System.out.println(JSON.toJSONString(client1));
		} finally {
			session.close();
		}
	}
}
