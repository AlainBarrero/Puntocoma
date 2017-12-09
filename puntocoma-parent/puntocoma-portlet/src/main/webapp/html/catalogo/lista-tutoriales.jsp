<%@ include file="/html/init.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="panel panel-primary"> 
	<div class="panel-heading"> 
		<h3 class="panel-title">${catalogo.title}</h3> 
	</div> 
	<div class="panel-body"> 
		<c:forEach var="tutorial" items="${tutorialList}" varStatus="loop">
		
			<portlet:renderURL var="tutorialURL">
				<portlet:param name="catalogoId" value="${catalogo.catalogoId}"/>
				<portlet:param name="articleId" value="${tutorial.articleId}"/>
			</portlet:renderURL>
		
			<div class="row">
				<div class="col-sm-4">
					<img src="${tutorial.image}" alt="Imagen por defecto">
				</div>
				<div class="col-sm-8">
					<h5><a href="${tutorialURL}">${tutorial.title}</a></h5>
		        	<p>${tutorial.description}</p>
				</div>
			</div>
			<hr>
			
		</c:forEach>
	</div> 
</div>