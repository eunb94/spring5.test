package com.wego.web.test;

public enum Path {
	CRAWLING_TARGET;
	
	@Override
	public String toString() {
		String result = "";
		switch (this) {
		case CRAWLING_TARGET:
			result = "https://endic.naver.com/?sLn=kr";
			break;
		}
		return result;
	}
}
