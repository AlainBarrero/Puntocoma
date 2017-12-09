<%@ include file="/html/init.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:actionURL name="createCatalogo" var="createCatalogoURL" />
<portlet:actionURL name="removeCatalogo" var="removeCatalogoURL"/>

<h3>Crear Categoría</h3>
<hr>

<form action="<%= createCatalogoURL %>" enctype="multipart/form-data" method="post"> 
	<div class="form-group"> 
		<label for="title">Título</label> 
		<input type="text" class="form-control" id="<portlet:namespace />title" name="<portlet:namespace />title" placeholder="Título"> 
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

<h3>Elimniar Categoría</h3>
<hr>

<form action="<%= removeCatalogoURL %>" enctype="multipart/form-data" method="post">
	<div class="form-group"> 
		<select class="form-control" name="<portlet:namespace />categoriaId" id="<portlet:namespace />categoriaId">
			<c:forEach var="categoria" items="${catalogoList}" varStatus="loop">
				<option value="${categoria.catalogoId}">${categoria.title}</option>
			</c:forEach>
		</select>
	</div>
	
	<button type="submit" class="btn btn-primary">Eliminar</button> 
	<hr>
</form>