package com.wego.web.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EngService {
		@Autowired EngProxy crawler;
		@Autowired EngBox<String> box;
		
		
		public EngBox<String> crawling(Map<?,?> paramMap){
			return crawler.choose(paramMap);

		}
}
