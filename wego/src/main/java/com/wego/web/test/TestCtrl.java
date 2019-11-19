package com.wego.web.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TestCtrl {
	@RestController
	@Transactional
	@Lazy
	@RequestMapping("/tests")
	public class EngCtrl {
		@Autowired EngService engService;
		@Autowired EngTrunk<String> trunk;
		@Autowired EngProxy crawler;
		@Autowired EngBox<String> box;

		@GetMapping("/eunbs")
		public ArrayList<String> test(){
			System.out.println("컨트롤러");
			box.clear();
			String url = "https://endic.naver.com/?sLn=kr";
			crawler.crawling(url);
			System.out.println("넘어온 url" + url);
	/*		System.out.println("box크롤링" + box.toString());*/
			
			return box.get();
		}
	}
}

	
