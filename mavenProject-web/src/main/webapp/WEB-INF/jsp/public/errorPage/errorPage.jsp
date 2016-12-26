<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="master.page">
    <tiles:putAttribute name="infoUser" />
    <tiles:putAttribute name="header"/>

    <tiles:putAttribute name="body">
        <div>
        	ERROR PAGE 
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>