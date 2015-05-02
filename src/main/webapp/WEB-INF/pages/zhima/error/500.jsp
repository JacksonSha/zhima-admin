<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="zh" xmlns:wb="http://open.weibo.com/wb">
<head>
<jsp:include page="../common/include.jsp"/>
</head>

<body>
    <jsp:include page="../common/header.jsp"/>

	<div class="container-fluid" style="margin-top: 80px;">
		<div class="row">
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading">
				<h3 class="panel-title">Error</h3>
				<div class="clearfix"></div>
				</div>
				<div class="panel-body">
					<span class="redFont">Internal server error</span>
					<br/>
					<span>Sorry. Something is wrong with server.</span>
					<br/>
					<span>We are working on that.</span>
				</div>
			</div>
		</div>
		</div>
	</div>
</body>
</html>
