<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="course" items="${courses }">
    <div class="card">
        <div class="card-header">
            <a href="/course/${course.id }">${course.id}) ${course.name }</a>
        </div>
        <div class="card-body">
            <p>Name: ${course.name}</p>
            <p>School: ${course.school}</p>
        </div>
    </div>
</c:forEach>
