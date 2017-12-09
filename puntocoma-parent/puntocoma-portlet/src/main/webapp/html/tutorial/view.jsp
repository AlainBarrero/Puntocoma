<%@ include file="/html/init.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:actionURL name="createTutorial" var="createTutorialURL" />
<portlet:actionURL name="removeTutorial" var="removeTutorialURL"/>

<h3>Crear Tutorial</h3>
<hr>

<form action="<%= createTutorialURL %>" enctype="multipart/form-data" method="post"> 
	<div class="form-group"> 
		<label for="title">Título</label> 
		<input type="text" class="form-control" id="<portlet:namespace />title" name="<portlet:namespace />title" placeholder="Título"> 
	</div> 
	<div class="form-group"> 
		<label for="title">Id Atículo</label> 
		<input type="text" class="form-control" id="<portlet:namespace />idArticle" name="<portlet:namespace />idArticle" placeholder="Id Atículo"> 
	</div> 
	<div class="form-group"> 
		<select class="form-control" name="<portlet:namespace />categoriaId" id="<portlet:namespace />categoriaId">
			<c:forEach var="categoria" items="${catalogoList}" varStatus="loop">
				<option value="${categoria.catalogoId}">${categoria.title}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group"> 
		<label for="title">Imagen</label> 
		<input type="text" class="form-control" id="<portlet:namespace />image" name="<portlet:namespace />image" placeholder="Imagen"> 
	</div> 
	<div class="form-group"> 
		<label for="title">Descripción</label> 
		<textarea class="form-control" rows="3" id="<portlet:namespace />description" name="<portlet:namespace />description" placeholder="Descripción..."></textarea> 
	</div>  
		
	<button type="submit" class="btn btn-primary">Crear</button> 
	<hr>
</form> 

<h3>Elimniar Tutorial</h3>
<hr>

<form action="<%= removeTutorialURL %>" enctype="multipart/form-data" method="post">
	<div class="form-group"> 
		<select class="form-control" name="<portlet:namespace />articleId" id="<portlet:namespace />articleId">
			<c:forEach var="tutorial" items="${tutorialList}" varStatus="loop">
				<option value="${tutorial.articleId}">${tutorial.title}</option>
			</c:forEach>
		</select>
	</div>
	
	<button type="submit" class="btn btn-primary">Eliminar</button> 
	<hr>
</form>