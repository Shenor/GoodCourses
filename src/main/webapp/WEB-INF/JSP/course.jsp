<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="course" tagdir="/WEB-INF/tags" %>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-sm-6">
            <div class="hidden-xs">
                <course:course-school />
            </div>
        </div>
    </div>
    <div class="panel-body">
        <p>Ваш отзыв</p>
        <hr />
        <form action="/add/feedback" method="post">
            <p><input type="hidden" name="id_course" value="${course.id}"/></p>
            <p><textarea name="feedback" title="Отзыв"></textarea></p>
            <p><input type="submit" class="btn btn-primary" value="Сохранить" /></p>
        </form>
    </div>
</div>