<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<c:if test = "${!fn:contains(requestScope['javax.servlet.forward.request_uri'], 'courses') &&
    !fn:contains(requestScope['javax.servlet.forward.request_uri'], 'sign-in') &&
    !fn:contains(requestScope['javax.servlet.forward.request_uri'], 'sign-up')}">
    <li class="nav-item">
        <a href="/courses" class="nav-link active">Список курсов</a>
    </li>
</c:if>