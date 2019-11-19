package com.test.web.crw;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.pxy.Box;
import com.test.web.pxy.CrawlingProxy;
import com.test.web.pxy.Inventory;
@Lazy
@RestController
@RequestMapping("/crawls")
public class CrawlCtrl {
	@Autowired CrawlingProxy crawler;

	
	@GetMapping("/naver")
	public ArrayList<HashMap<String, String>> naver() {
		System.out.println("네이버 클릭");

		return crawler.engCrawling("https://endic.naver.com/?sLn=kr"); 
	}
	@GetMapping("/cgv")
	public ArrayList<HashMap<String, String>> cgv() throws Exception{
		System.out.println("씨지비 클릭");
		return crawler.cgvCrawl();
	}
	@GetMapping("/bugs")
	public String bug() {
		System.out.println("벅스 클릭");
		return null;
	}

}
