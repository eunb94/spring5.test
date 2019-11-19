"use strict"

var app = app || {}
app = (()=>{
	const WHEN_ERR = '호출하는 JS 파일을 찾을 수 없습니다.';
	let _, js, css, img, eunjs;
	
	let run = x => {
		alert('3')
		$.getScript(x+'/resources/js/cmm/router.js',()=>{
			$.extend(new Session(x))
			alert('app.js '+$.ctx())
			onCreate()
		})
	}
	
	let init=()=>{
		_ = $.ctx()
		js = $.js()
		css = $.css()
		img = $.img()
		eunjs = js+ '/test/eun.js'
	}
	let onCreate=()=>{
		init()
		$.when(
				$.getScript(eunjs)
				)
		.done(()=>{
			alert('1')
			eng.onCreate()
		})
		.fail(()=>{
			alert(WHEN_ERR)
		})
	}
	return {run}
})()