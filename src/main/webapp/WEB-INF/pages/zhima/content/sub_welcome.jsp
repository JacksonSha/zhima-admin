<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="row">
	<ul class="breadcrumb">
		<li>
			<i class="icon-home"></i>
			<a href="index.html">首页</a>
			<i class="icon-angle-right"></i>
		</li>
		<li><a href="#">Welcome</a></li>
	</ul>
</div>

<div class="row">
欢迎回来
<pre>
<code>var myData;

redisCache.get(key, function (err, data) {
    // callback读取缓存数据
    myData = data;
});

redisCache.put(key, myData, function (err, reply) {
    // 写入缓存，callback确认写入结果
});
</code>
</pre>
</div>
