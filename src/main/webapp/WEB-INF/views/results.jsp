<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h1>Found results:</h1>
	<h4>requested name: ${pib}</h4>
	<table style="width: 100%">
		<tr>
			<td valign="top">
				<h4>Платники ПДВ: ${platnikiPdv.size()}</h4>
				<table border="1">
					<tr>
						<th>Ім'я/назва:</th>
						<th>Код ПДВ:</th>
					</tr>
					<c:forEach var="platnykPdv" items="${platnikiPdv}">
						<tr>
							<td>${platnykPdv.pib}</td>
							<td style="color: blue; text-decoration: underline;">${platnykPdv.kodPdv}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td valign="top">
				<h4>Податкові боржники: ${podatkBorzhniky.size()}</h4>
				<table border="1">
					<tr>
						<th>Ім'я/назва:</th>
						<th>Загальний борг:</th>
						<th>Назва підрозділу ДФС:</th>
					</tr>
					<c:forEach var="podatkBorzhnyk" items="${podatkBorzhniky}">
						<tr>
							<td>${podatkBorzhnyk.pib}</td>
							<td style="color: red;"><i>${podatkBorzhnyk.borg}</i></td>
							<td>${podatkBorzhnyk.dpi}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td valign="top">
				<h4>Анульовані платники ПДВ: ${anulPlatnikiPdv.size()}</h4>
				<table border="1">
					<tr>
						<th>Ім'я:</th>
						<th>Код ПДВ:</th>
						<th>Причина анулювання:</th>
					</tr>
					<c:forEach var="anulPlatnykPdv" items="${anulPlatnikiPdv}">
						<tr>
							<td>${anulPlatnykPdv.pib}</td>
							<td>${anulPlatnykPdv.kodPdv}</td>
							<td style="color: orange">${anulPlatnykPdv.nameAnul}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td valign="top">
				<h4>Банкрути: ${bankruty.size()}</h4>
				<table border="1">
					<tr>
						<th>Ім'я:</th>
						<th>Статус:</th>
						<th>Дата банкрутства:</th>
					</tr>
					<c:forEach var="bankrut" items="${bankruty}">
						<tr>
							<td>${bankrut.pib}</td>
							<td>${bankrut.procBorgName}</td>
							<td>${bankrut.dateStart}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	<div align="right" style="color: pink;"><strong>DropTable Team. SQL-Challenge 2019</strong></div>
</body>
</html>