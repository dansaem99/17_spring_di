package com.spring.di.tobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당클래스를 Service클래스로 spring bean에 등록한다.
public class TobeServiceImpl implements TobeService {

	@Autowired //@Inject
	private TobeDAO tobeDAO;
	
}
