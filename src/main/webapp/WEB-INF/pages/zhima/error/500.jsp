<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="../common/include.jsp"></jsp:include>

<script type="text/javascript">
var rootUrl = "${pageContext.request.contextPath}";
</script>
</head>

<body>
    <jsp:include page="../common/header.jsp"/>

	<div class="banner"></div>

	<div class="container sections-wrapper">
	<div class="row">
	<h2 class="copy greyFont">
		<span class="redFont">Internal server error</span>
		<br/>
		<span>Sorry. Something is wrong with server.</span>
		<br/>
		<span>We are working on that.</span>
	</h2>
	</div><!--//row-->
	</div><!--//masonry-->

    <jsp:include page="../common/footer.jsp"/>
</body>
</html>
