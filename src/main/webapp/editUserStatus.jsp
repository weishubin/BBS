<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>签到</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
 <script src="js/jquery-1.11.2.js"></script>
  <script src="js/bootstrap.min.js"></script>
 <!-- Include all compiled plugins (below), or include individual files as needed -->
 <script src="js/bootstrap.min.js"></script>
 
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/pin_css.css" type="text/css">

<script>
	function editUserStatus(status) {
		var data = {
			activityId : $('#activityId').val(),
			planType : status
		};
		var request = $.ajax( {
				type: "POST",
				url : 'saveUserStatus.action',
				data : data

			});
		request.done(function(result) {
			if (result.result == 1) {
				alert('签到成功!');
			} else {
				alert('签到失败!');
			}
			
		});
		request.fail(function(jqXHR, textStatus ) {
			alert( "签到失败: " + textStatus );
		});
	}
</script>

</head>


<body>


<jsp:include page="nav.jsp?page=editUserStatus">
	<jsp:param name="page" value="editUserStatus" />
</jsp:include>


<s:hidden name="activityId" value="%{activity.id}" />


<div id="container" style="position: relative; height: 10442px;">

<div class='api_article' id='114863' style="position: absolute; top: 0px; left: 0px;">
<div class='api_article_title'>去</div>
<a href="#" onclick='javascript:editUserStatus(1)'><img class='api_article_image' src="img/p.jpg" width="150" height="150"/></a>
</div>

<div class='api_article' id='114863' style="position: absolute; top: 0px; left: 300px;">
<div class='api_article_title'>不去</div>
<a href="#" onclick='javascript:editUserStatus(2)'><img class='api_article_image' src="img/p.jpg" width="150" height="150"/></a>
</div>


<div class='api_article' id='114863' style="position: absolute; top: 0px; left: 600px;">
<div class='api_article_title'>待定</div>
<a href="#" onclick='javascript:editUserStatus(3)'><img class='api_article_image' src="img/p.jpg" width="150" height="150"/></a>
</div>

</div> 

</body>
</html>