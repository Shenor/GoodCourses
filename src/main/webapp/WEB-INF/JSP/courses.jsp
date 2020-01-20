<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="course" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="resume" tagdir="/WEB-INF/tags"%>

<div class="row courses">
    <div id="profileContainer" class="col-xs-12" data-profile-total="${page.totalPages }" data-profile-number="${page.number }">
        <jsp:include page="fragment/courses-items.jsp" />
    </div>
</div>
