<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <center>
        <form action="/storecenter" class="nocrt" method="post" onsubmit="check()">
            <h1>Create Centers...</h1>
            <label for="cregion">Enter Center District</label><br><br>
            <input type="text" name="cregion" id="cregion"><br> <br>
            <label for="cname">Enter Center Name</label><br><br>
            <input type="text" name="cname" id="cname"><br> <br>
            <label for="capplicant"> Enter No. Of Tender Applicants</label><br><br>
            <input type="text" name="capplicant" id="capplicant"><br><br>
            <button type="submit">Next</button>
        </form>
        <br><br>
        <button><a href="/viewall">View All Center Entries</a></button>
        <div class="crtcen">

        </div>
    </center>
    <script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>
</html>