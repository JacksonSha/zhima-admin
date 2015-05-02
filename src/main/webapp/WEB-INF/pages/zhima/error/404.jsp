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
	<h2 class="copy greyFont"><span class="redFont">The resource you are looking for has been removed, had its name changed, or is temporarily unavailable. Please go back and try again or start over from our home</span></h2>
	</div><!--//row-->
	</div><!--//masonry-->

    <jsp:include page="../common/footer.jsp"/>
</body>
</html>
