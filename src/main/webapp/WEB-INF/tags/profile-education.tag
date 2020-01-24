<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="card">
	<div class="card-header">
		<i class="fa fa-graduation-cap"></i> Education <a class="edit-block" href="/edit/education">Edit</a>
	</div>
	<c:if test="${fn:length(profile.educations) > 0}">
		<div class="card-body">
			<c:forEach var="education" items="${profile.educations}">
				<div class="timeline-heading">
					<h4 class="timeline-title">${education.summary}</h4>
					<p>
						<small class="dates"><i class="fa fa-calendar"></i> ${education.beginYear} - ${education.finishYear}</small>
					</p>
				</div>
				<div class="timeline-body">
					<p>${education.faculty}, ${education.university}</p>
				</div>
			</c:forEach>
		</div>
	</c:if>
</div>