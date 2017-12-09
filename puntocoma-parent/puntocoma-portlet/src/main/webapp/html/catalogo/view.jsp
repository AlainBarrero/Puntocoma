<%@ include file="/html/init.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row"> 

	<c:forEach var="catalogo" items="${catalogoList}" varStatus="loop">
		
		<portlet:renderURL var="catalogoURL">
			<portlet:param name="catalogoId" value="${catalogo.catalogoId}"/>
		</portlet:renderURL>
				
		<div class="col-sm-6">
		    <div class="thumbnail">
		      <img src="${catalogo.image}" alt="Imagen por defecto">
		      <div class="caption">
		        <h3>${catalogo.title}</h3>
		        <p>${catalogo.description}</p>
		        <p>
		        	<a href="${catalogoURL}" class="btn btn-primary" role="button">Entrar</a>
		        </p>
		      </div>
		    </div>
		 </div>
		 
	</c:forEach>
	
</div> 
