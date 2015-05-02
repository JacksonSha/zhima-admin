<%@page pageEncoding="UTF-8"%>

<header class="navbar navbar-fixed-top">
<div class="container-fluid">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed">
		<!-- data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" -->
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="${pageContext.request.contextPath}/" style="font-size: 28px;">
		芝麻加糖
		</a>
	</div>
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="#">Logout</a></li>
					<li><a href="#">Profile</a></li>
				</ul>
			</li>
		</ul>
	</div>
</div>
</header>
