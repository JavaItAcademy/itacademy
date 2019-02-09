<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<title>Добавить заявку</title>
</head>
<body>
<form action="add_apply" method="post">
	<p>ФИО
		<input type="text" name="fio">
	</p>
	<p>Наименование курса:
		<select name="courses">
			<option value="Java">Java</option>
			<option value="C#">C#</option>
			<option value="Python">Python</option>
		</select>
	</p>
	<p>Почта:
		<input type="text" name="email">
	</p>
	<p>Онлайн?
		<input type="checkbox" name="isOnline">
	</p>
	<input type="submit" name="submit">
</form>
</body>
</html>