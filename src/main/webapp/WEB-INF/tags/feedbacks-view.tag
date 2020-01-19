<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default feedbacks">
    <div class="media panel-body">
        <p>Отзывы</p>
        <br/>
        <c:forEach var="feedback" items="${feedbacks}">
            <table class="table table-bordered">
                <tbody>
                <tr>
                    <td>${feedback.description}</td>
                </tr>
                </tbody>
            </table>
        </c:forEach>
    </div>
</div>