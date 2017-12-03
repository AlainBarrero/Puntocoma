<%@ include file="/html/init.jsp" %>

<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm">
	
	<input type="hidden" name="<portlet:namespace /><%=Constants.CMD%>" value="<%=Constants.UPDATE%>" />
	
	<%-- Es página principal --%>
	<div class="control-group">
		<label>Pagina principal: </label>
		<select id="<portlet:namespace />paginaPrincpalCatalogo" name="<portlet:namespace />paginaPrincpalCatalogo">
			<option <%= paginaPrincpalCatalogo.equals("si") ? "selected" : "" %> value="si"> Si </option>
			<option <%= paginaPrincpalCatalogo.equals("no") ? "selected" : "" %> value="no"> No </option>
		</select>
	</div>
	
	<button class="btn btn-primary" type="submit">Guardar</button>
</form>