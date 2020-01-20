<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-book"></i> Courses <a class="edit-block" href="/edit/courses">Edit</a>
		</h3>
	</div>
	<c:if test="${fn:length(profile.courses) > 0}">
		<div class="panel-body">
			<c:forEach var="course" items="${profile.courses}">
			<div class="timeline-heading">
				<h4 class="timeline-title">${course.name}</h4>
				<p>
					<small class="dates"><i class="fa fa-calendar"></i> <strong>Finish Date:</strong> <strong class="label label-danger">${course.finishDate}</strong> </small>
				</p>
			</div>
			</c:forEach>
		</div>
	</c:if>
</div>