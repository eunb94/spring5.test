package com.wego.web.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("crawler")
public class EngProxy extends Proxy{
	@Autowired EngBox<String> box;
	
	
	
	public EngBox<String> choose(Map<?,?> paramMap) {
		switch (string(paramMap.get("srch"))) {
		case "영어사전":
			box = crawling(Path.CRAWLING_TARGET.toString()+"1");
			break;

		default:
			break;
		}
		return box;
		
	}



	public EngBox<String> crawling(String url) {
	/*	System.out.println("넘어온 url" + url);*/
	/*	HashMap<String, Object> map = new HashMap<>();*/
		box.clear();
		try {
			// "https://music.bugs.co.kr/recomreview?&order=listorder&page=2"
			Document rawData = Jsoup.connect(url).timeout(10*1000).get();
			  Elements eng = rawData.select("div[class=txt_origin]"); 
			  Elements kor = rawData.select("div[class=txt_trans]");

			  
			  for(Element e : eng) {
				 box.add(e.text()+"\n ***************** \n");
				 
			  }
			 
			  
			 for(Element e : kor) {
				 box.add(e.text()+"\n --------------------\n");
			 }
/*			 System.out.println(box);
			 System.out.println("+++++++++");
			 System.out.println(box);*/
			 
			 
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return box;
	}
}
