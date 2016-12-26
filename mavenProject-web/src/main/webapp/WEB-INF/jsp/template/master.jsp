<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!doctype html>
<html lang="pt-BR" id="ng-app">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Master Title</title>
	</head>

	<body>
		<tiles:insertAttribute ignore="true" name="infoUser" />
		<tiles:insertAttribute ignore="true" name="header" />
		<tiles:insertAttribute ignore="true" name="body" flush="true" />
	</body>

</html>