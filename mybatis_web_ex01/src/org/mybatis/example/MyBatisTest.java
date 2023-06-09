package org.mybatis.example;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.model.Blog;

public class MyBatisTest {

	public static void main(String[] args) throws IOException {
		String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  Blog blog = session.selectOne("BlogMapper.selectBlog", 101);
			  System.out.println(blog);
			}
	}

}
