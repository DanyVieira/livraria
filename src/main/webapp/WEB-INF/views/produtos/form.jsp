<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/produtos" method="POST" > <!-- qual controler vou enviar os dados que inseri no formulario -->
		<div>
			<label>Titulo</label>
			<input type="text" name="titulo">
			
		</div>
		
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
			
		</div>
		
		<div>
			<label>Páginas</label>
			<input type="text" name="paginas">
		</div>
		
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>