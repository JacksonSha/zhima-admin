<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="../common/include.jsp"/>

<script type="text/javascript">
$(function(){
	var rootUrl = window.rootUrl;
	$(window).bind('scroll', function() {
	    if ($(window).scrollTop() > 30) {
	        $('header').addClass('navbar-fixed-top');
	    }
	    else {
	        $('header').removeClass('navbar-fixed-top');
	    }
	});
	var pathname = window.location.pathname;
	pathname = pathname.replace(rootUrl, "").split("/", -1);
	console.log(pathname, pathname.length);
	var page = pathname[1];
	(page=="") && (page="home");
	//console.log(pathname,page);
	if(page!="home" && page!="blog" && page!="about" && page!="guest"){
		window.location.pathname = rootUrl+"/";
	}
	$.post(rootUrl+"/show/sub_"+page,null,function(resp){
		$(".container .row").empty().html(resp);
	});
});
</script>
</head>

<body>
    <jsp:include page="../common/header.jsp"/>

	<div class="banner"></div>

	<div class="container sections-wrapper">
	<div class="row">
	</div><!--//row-->
	</div><!--//masonry-->

    <jsp:include page="../common/footer.jsp"/>
</body>
</html> 

