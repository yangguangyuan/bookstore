<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>bookStore列表</title>
<%--导入css --%>
<link rel="stylesheet" href="css/main.css" type="text/css" />
</head>

<body class="main">

	<jsp:include page="head.jsp" />
	<jsp:include page="menu_search.jsp" />

	<div id="divpagecontent">
		<table width="100%" border="0" cellspacing="0">
			<tr>

				<td>
					<div style="text-align:right; margin:5px 10px 5px 0px">
						<a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;计算机&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;图书列表
					</div>

					<table cellspacing="0" class="listcontent">
						<tr>
							<td>
								<h1>商品目录</h1>
								<hr />
								<h1>计算机</h1>&nbsp;&nbsp;&nbsp;&nbsp;共100种商品
								<hr />
								<div style="margin-top:20px; margin-bottom:5px">
									<img src="images/productlist.gif" width="100%" height="38" />
								</div>
								
								<table cellspacing="0">
								<tr>
									<c:forEach var="book" items="${list}" varStatus="yang">
											<td>
	
												<div class="divbookpic">
													<p>
														<a href="${pageContext.request.contextPath}/ProductInfo"><img src="${pageContext.request.contextPath}/${book.imgurl}" width="115"
															height="129" border="0" /> </a>
													</p>
												</div>
	
												<div class="divlisttitle">
													<a href="${pageContext.request.contextPath}/ProductInfo">书名:${book.bname}<br />售价:${book.price} </a>
												</div>
											</td>
											<c:if test="${yang.count%5==0}">
												<tr></tr>
											</c:if>
									</c:forEach>
								</tr>
								</table>
								
								<div class="pagination">
									<ul>


										<li class="disablepage">上一页 &lt;&lt;</li>


										<li class="nextpage"><a href="product_info.jsp">下一页&gt;&gt;</a>
										</li>

									</ul>
								</div>
							</td>
						</tr>
					</table></td>
			</tr>
		</table>
	</div>

	<jsp:include page="foot.jsp" />


</body>
</html>
