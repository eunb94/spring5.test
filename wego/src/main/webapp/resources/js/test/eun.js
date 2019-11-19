"use strict"

var eun = eun || {} 
eun = (()=>{
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.'
		let _, js, css, img
		let init =()=>{
			_ = $.ctx()
			js = $.js()
			css = $.css()
			img = $.img()

		}
		let onCreate=()=>{
			init()
			alert('eunjs'+_)
			$('<a>EunBee</a>').appendTo('body')
			.click(e=>{
				e.preventDefault()
				alert('eunjs2'+_)
				$.ajax({
					url : _+'/tests/eunbs' ,
					type : 'GET',
					success : d=>{ 
						
						alert('eunb' + d)
						
				
					},
					error : e=>{
						alert('실패')
					}
				})

			})
		}
		
			return {onCreate}
		
})()