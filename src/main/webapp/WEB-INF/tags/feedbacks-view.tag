<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">
    <div class="card-header">Отзывы</div>
    <div class="card-body">
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