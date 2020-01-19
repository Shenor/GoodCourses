<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<c:if test="${auth != true}">
    <div id="signIn" class="col-xs-12 text-right">
        <a href="/sign-in" class="btn btn-primary">Авторизоваться</a>
    </div>
</c:if>