<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">
	<div class="card-header">
		<i class="fa fa-code"></i> Technical Skills <a class="edit-block" href="/edit/skills">Edit</a>
	</div>
	<div class="card-body">
		<table class="table table-striped table-bordered">
			<tbody>
			<tr>
				<th style="width: 140px;">Category</th>
				<th>Frameworks and technologies</th>
			</tr>
			<c:forEach var="skill" items="${profile.skills}">
			<tr>
				<td>${skill.category}</td>
				<td>${skill.value}</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>