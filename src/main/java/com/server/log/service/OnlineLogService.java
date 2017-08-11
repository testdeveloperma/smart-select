package com.server.log.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.log.dao.OnlineLogMapper;
import com.server.log.parse.ReqParam;

@Service
public class OnlineLogService {

	@Autowired
	private OnlineLogMapper onlineLogMapper;
	
	
	public void addLog(){
		ReqParam req = new ReqParam("url", "9.31", "name=mmm", "success");
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		OnlineLogMapper onlineLogMapper = session.getMapper(OnlineLogMapper.class);
		
		onlineLogMapper.add(req);
	}
	
}
