<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<nav class="navbar navbar-default">

 
	 <script>
		function changeURL(obj, url) {
			var a = $(obj).parent();
			a.attr("class", "active")
			alert(a);
		}
	 </script>
 
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"><b>八家羽毛球活动组</b></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <%
			String page3 = request.getParameter("page");
		%>
        <li class="<%if ("editUserStatus".equals(page3) ) out.print("active"); %>"><a href="userStatusInput.action">签到</a></li>
        <li><a href="showUserPlan.action">参加人员</a></li>
		<li><a href="#">活动管理</a></li>
        
      </ul>
      <ul class="nav navbar-nav navbar-right">
        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">魏书斌<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#"><a>注销</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
   <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.2.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</nav>