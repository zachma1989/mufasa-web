<%@ page import="com.mufasaweb.RecListBean,java.util.List" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Recommendation List</title>
</head>
<body>
List of recommendation :
<br>
<%
RecListBean b = (RecListBean)request.getAttribute("bean");
List<String> recList = b.getRecList();


for(int i=0; i<recList.size();i++){
	out.print(recList.get(i));
	out.print("<br>");
}

//out.print("Hello2");
%>
</body>
</html>