$(function () {
	var current_li;	
	
	$("#search").keyup(function(){
		
		
		var current_query=$("#search").val();
		
		if(current_query!=""){
			
	
		$("#portofolio li").hide(500);
		$("#portofolio li").each(function(){
			
			var current_keyword=$(this).attr("data-keywrods");

			if(current_keyword.indexOf(current_query)>=0){
		
				$(this).show();
			}
			
		});
	}else{
		$("#portofolio li").show();
	}
	});
	
	$("#portofolio").sortable(
	{
		stop:function(){
			var list_contents=$("#portofolio").html();
			$.post("/sparta/Script",{list:list_contents});
			console.log("x");
			console.log($.get("/sparta/Script"));
			
		}
	
	});
	
	function setImg(src,id){
		$("#frame #main").attr("src",src);
		var path="text/"+id+".txt";
		$.get(path,function(data){
			console.log(data);
			$("#description p").html(data);
		});
	}
	$("#portofolio img").click(function(){
		var src=$(this).attr("src");
		current_li=$(this).parent();
		var id=$(this).attr("id");
		setImg(src,id);

		$("#frame").fadeIn(500);
		$("#overlay").fadeIn(500);
	});
	$("#overlay").click(function () {
		$(this).fadeOut(500);
		$("#frame").fadeOut(500);
	
	});
	$("#right").click(function () {
		if(current_li.is(":last-child")){
			var next_li=$("#portofolio li").first();
		}
		else{
		var next_li = current_li.next();
		}		
		
		var next_src = next_li.children("img").attr("src");

		var id=next_li.children("img").attr("id");
		setImg( next_src,id);
		$("#main").attr("src",next_src);
		current_li = next_li;
	});
	$("#left").click(function () {
		if(current_li.is(":first-child")){
			var 	prev_li=$("#portofolio li").last();
				
		}
		else{
			var prev_li=current_li.prev();	
		}

		var prev_src=prev_li.children("img").attr("src");
		var id=prev_li.children("img").attr("id");
		setImg(prev_src,id);
		current_li=prev_li;
	});
	$("#right img ,#left img").mouseover(function(){
		$(this).css("opacity","0.75");
	});
		$("#right img ,#left img").mouseleave(function(){
		$(this).css("opacity","0.5");
	});
	
});