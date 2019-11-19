package com.test.web.crw;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.pxy.Box;
import com.test.web.pxy.CrawlingProxy;
import com.test.web.pxy.Inventory;

@RestController
@Transactional
@Lazy
@RequestMapping("/crawls")
public class CrawlCtrl {
	@Autowired CrawlingProxy crawler;
	@Autowired Box<String> box;
	@Autowired Inventory<String> inventory;
	@GetMapping("/naver")
	public ArrayList<String> naver() {
		System.out.println("네이버 클릭");
		inventory.clear();
		/*String url = "https://endic.naver.com/?sLn=kr";*/
/*		crawler.engCrawling(url).get(); */
		System.out.println(inventory.get());
		
		return inventory.get();
	}
		@GetMapping("/cgv")
		public String cgv() {
			System.out.println("cgv 컨트롤러");
			
			return null;
			
		}
		@GetMapping("/bugs")
		public String bugs() {
			System.out.println("bugs 컨트롤러");
			
			return null;
			
		}
	}
