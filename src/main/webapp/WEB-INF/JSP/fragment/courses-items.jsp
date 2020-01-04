<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="course" items="${courses }">
    <div class="panel panel-default profile-item">
        <div class="media panel-body">
            <div class="media-body search-result-item">
                <h4 class="media-heading">
                    <a href="/course/${course.id }">${course.id}) ${course.name }</a>
                </h4>
                <p>Name: ${course.name}</p>
                <p>School: ${course.school}</p>
            </div>
        </div>
    </div>
</c:forEach>
