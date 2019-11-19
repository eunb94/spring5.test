"use strict"
var app = app || {}
app = (()=>{
	let _, js
	let init=()=>{
		_ = $.ctx()
		js = $.js()
	}
	let run=x=>{
		$.getScript(x+'/resources/js/cmm/router.js', ()=>{
			$.extend(new Session(x))
			alert('떠라')
			onCreate()
		})
	}

	let onCreate=()=>{
		setContentView()
	}
	let setContentView=()=>{
		$('<table id="tab"><tr></tr></table>')
		.css({  width: '80%',
            height: '800px',
            border: '1px solid black',
            margin: '0 auto'})
        .appendTo('#wrapper')
        $('<td/>', {id : "left"})
        .css({  width: '20%',
            height: '100%',
            border: '1px solid black',
            'vertical-align': 'top'})
        .appendTo('tr')
        $('<td/>', {id : "right"})
        .css({width: '80%',
            height: '100%',
            border: '1px solid black'})
		.appendTo('tr')
		$.each(['NAVER', 'CGV', 'BUGS'], (i,j)=>{
			 $('<div/>')
			    .text(j)
		        .css({
						width: '100%',
			            height: '50px',
			            border: '1px solid black',
			            'text-align' : 'center' 
					}).appendTo('#left')	
				.click(function(){
					alert($(this).text())
					_ = $.ctx()
				switch($(this).text()){
				case 'NAVER' : 
					$.getScript(_+'/crawls/naver', d=>{})
					break;
				case 'CGV' : 
					$.getScript(_+'/crawls/cgv', d=>{})
					break;
				case 'BUGS' : 
					$.getScript(_+'/crawls/bugs', d=>{})
					break;
				}
					
				})
		})
       
	}
	return{run}
})()