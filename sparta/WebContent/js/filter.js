$(function(){
	
	$("#filter li").click(function(){
		var category = $(this).html();
		
		$("#filter li").removeClass("active");
		$(this).addClass("active");
		
	
	var i=0;
		$("#portofolio li").each(function(){
			if($(this).hasClass(category)){
				$(this).show(500);
			}
			else{
				$(this).hide(500);
			}
		});
	});
	
});