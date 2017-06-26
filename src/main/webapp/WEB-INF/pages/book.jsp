<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head></head>
<body>
<h2>This is Books and Impressions</h2>
<h3>${serverTime}</h3>
<p>ko co c:out <value="${serverTime}"/></p>
------------</br>
<c:out value="${serverTime}"/>
</body>
</html>