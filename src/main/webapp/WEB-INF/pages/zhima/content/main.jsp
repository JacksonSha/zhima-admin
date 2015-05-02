<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="zh" xmlns:wb="http://open.weibo.com/wb">
<head>
<jsp:include page="../common/include.jsp"/>
</head>

<body>
    <jsp:include page="../common/header.jsp"/>

	<div class="container-fluid" style="margin-top: 51px;">
		<div class="row">
		<div class="container-fluid sidebar-nav">
			<div class="row">
				<ul class="nav nav-tabs">
					<li><a href="${pageContext.request.contextPath}/articles"><i class="icon-list-alt"></i><span class=""> 所有文章</span></a></li>
					<li><a href="${pageContext.request.contextPath}/edit"><i class="icon-edit"></i><span class=""> 写文章</span></a></li>
					<li><a href="${pageContext.request.contextPath}/tags"><i class="icon-tags"></i><span class=""> 标签分类</span></a></li>
					<li><a href="${pageContext.request.contextPath}/comments"><i class="icon-comments"></i><span class=""> 评论</span></a></li>
					<li><a href="${pageContext.request.contextPath}/profile"><i class="icon-user"></i><span class=""> 用户信息</span></a></li>
					<li><a href="${pageContext.request.contextPath}/icons"><i class="icon-star"></i><span class=""> 系统图标</span></a></li>
				</ul>
			</div>
		</div>
		<div class="container-fluid sidebar-container">
			<div class="container-fluid">
			<jsp:include page="./sub_${subPage}.jsp"></jsp:include>
			</div>
		</div>
		</div>
	</div>
</body>
</html>
