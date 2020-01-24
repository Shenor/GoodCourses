<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<security:authorize access= "hasAuthority('USER')" var= "isUSer"/>


<c:if test= "${not isUSer}">
    <!--TODO попробовать реализовать исключения для отображения кнопки для адресов sign-in и sign-up средствами spring-security-->
    <c:if test = "${!fn:contains(requestScope['javax.servlet.forward.request_uri'], 'sign-in') &&
    !fn:contains(requestScope['javax.servlet.forward.request_uri'], 'sign-up')}">
        <li class="nav-item">
            <a href="/sign-in" class="nav-link">Авторизоваться</a>
        </li>
    </c:if>
</c:if>

<c:if test= "${isUSer}">
    <c:choose>
        <c:when test="${profile != null}">
            <%--Заглушка для страницы профиля--%>
        </c:when>
        <c:otherwise>
            <li class="nav-item">
                <a href="/my-profile" class="nav-link">Мой профиль</a>
            </li>
        </c:otherwise>
    </c:choose>
</c:if>
