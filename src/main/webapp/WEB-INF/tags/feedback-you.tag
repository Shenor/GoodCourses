<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<security:authorize access= "hasAuthority('USER')" var= "isUSer"/>

<c:if test= "${isUSer}">
    <c:if test = "${editFeedback == false}">
        <div class="panel panel-default feedback">
            <div class="media panel-body">
                <p>Ваш отзыв</p>
                <hr />
                <form action="/add/feedback" method="post">
                    <p><input type="hidden" name="id_course" value="${course.id}"/></p>
                    <p><textarea name="feedback" title="Отзыв"></textarea></p>
                    <p><input type="submit" class="btn btn-primary" value="Сохранить" /></p>
                </form>
            </div>
        </div>
    </c:if>
</c:if>
