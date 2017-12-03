<%@ include file="/html/init.jsp" %>

<h3>Crear Tutorial</h3>
<hr>

<form> 
	<div class="form-group"> 
		<label for="title">T�tulo</label> 
		<input type="text" class="form-control" id="title" name="title" placeholder="T�tulo"> 
	</div> 
	<div class="form-group"> 
		<label for="title">Id At�culo</label> 
		<input type="text" class="form-control" id="idArticle" name="idArticle" placeholder="Id At�culo"> 
	</div> 
	<div class="form-group"> 
		<label for="title">Imagen</label> 
		<input type="text" class="form-control" id="image" name="image" placeholder="Imagen"> 
	</div> 
	<div class="form-group"> 
		<label for="title">Descripci�n</label> 
		<textarea class="form-control" rows="3" id="description" name="description" placeholder="Descripci�n..."></textarea> 
	</div>  
		
	<button type="submit" class="btn btn-primary">Crear</button> 
	<hr>
</form> 

<h3>Elimniar Tutorial</h3>
<hr>

<form>
	<div class="form-group"> 
		<select class="form-control">
			<option>Tutorial</option>
		</select>
	</div>
	
	<button type="submit" class="btn btn-primary">Eliminar</button> 
	<hr>
</form>