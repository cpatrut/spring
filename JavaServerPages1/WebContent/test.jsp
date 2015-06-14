<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is a title</title>
</head>
<body>
<%!
public int add(int a ,int b){
	return a+b;
}	
%>
<%for(int i=0;i<10;i++) {
	out.println("<br/>i="+i);
}
	
%>
<%

int k=add(4,5);%>
The value of k:<%=k %>
</body>
</html>