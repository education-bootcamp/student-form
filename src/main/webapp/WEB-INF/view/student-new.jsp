<%--
  Created by IntelliJ IDEA.
  User: Hasika
  Date: 9/18/2023
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
      <title>Title</title>
  </head>
  <body>
  <jsp:include page="header.jsp"/>
  <form action="create-student" method="post">
  <div class="container">
    <div class="row">
        <div class="col-3">
            <div class="form-group">
                <label for="id">Id</label>
                <input type="text" name="id" id="id" class="form-control">
            </div>
        </div>
        <div class="col-3">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" name="name" id="name" class="form-control">
            </div>
        </div>
        <div class="col-3">
            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" name="address" id="address" class="form-control">
            </div>
        </div>
        <div class="col-3">
            <div class="form-group">
                <label for="salary">Salary</label>
                <input type="number" name="salary" id="salary" class="form-control">
            </div>
        </div>
        <div class="col-12">
            <br>
            <button type="submit" class="btn btn-primary col-12">Save Student</button>
        </div>
    </div>
  </div>
  </form>
  </body>
</html>
