<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title> Title </title>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <style>
    #myModal {
      width: 500px;
      top: 25%;
      left: 50%;
      margin-top: -25px;
      margin-left: -200px;
      padding: 20px;
    }
  </style>
</head>

<body>
<div class="container">
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-body">
          <h4>Please Login!</h4>
          </br>
        </div>
        <a href="/login" class="btn btn-success">Close</a>
      </div>

    </div>
  </div>
</div>
</body>

<script>
  $(window).load(function () {
    $('#myModal').modal('show');
  });
</script>

</html>