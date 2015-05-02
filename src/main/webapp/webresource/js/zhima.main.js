(function (){
	window.ZM = window.ZM || {};
	
	ZM.allowLog = false;
	ZM.allowStorage = false;
	ZM.rootUrl = window.rootUrl;
	
	ZM.log = function(info){
		if(ZM.allowLog && console && console.log){
			console.log(info);
		}
	};
	
	var storage = window.localStorage;
	
	ZM.navigate = ZM.navigate || {};
	
	ZM.navigate.init = function(){
		$(".navbar-toggle").click(function(){
			console.log("click nav");
			var navbar = $(".sidebar-nav");
			if($(navbar).css("left").indexOf("-")==0){
				$(navbar).stop().animate({'left':'0px'}, 300);
			} else {
				$(navbar).stop().animate({'left':'-160px'}, 300);
			}
		});
	};
	
})();
