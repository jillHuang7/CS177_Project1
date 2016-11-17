<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

    <form:form method="post" commandName="search">

        <button type="submit" class="btn btn-success">Submit</button>
    </form:form>

    <div class="spacer"></div>
    
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Result</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${items}" var="result">
                <tr>
                    <td>${category.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="common/footer.jspf"%>