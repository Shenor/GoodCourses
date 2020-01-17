<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="resume" tagdir="/WEB-INF/tags"%>

<div class="row certificates">
    <c:if test="${auth != true}">
        <div id="signIn" class="col-xs-12 text-right">
            <a href="/sign-in" class="btn btn-primary">Авторизоваться</a>
        </div>
    </c:if>
    <div id="profileContainer" class="col-xs-12" data-profile-total="${page.totalPages }" data-profile-number="${page.number }">
        <jsp:include page="fragment/courses-items.jsp" />
    </div>
</div>
