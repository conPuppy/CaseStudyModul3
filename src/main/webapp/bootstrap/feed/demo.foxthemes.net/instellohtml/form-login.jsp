<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.foxthemes.net/instellohtml/form-login.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 29 Dec 2022 04:43:04 GMT -->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Favicon -->
    <link href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/images/favicon.png" rel="icon" type="image/png">

    <!-- Basic Page Needs
    ================================================== -->
    <title>Instello Sharing Photos</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Instello - Sharing Photos platform HTML Template">

    <!-- icons
    ================================================== -->
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/icons.css">

    <!-- CSS 
    ================================================== -->
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/uikit.css">
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/style.css">
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/tailwind.css">

</head>


<body class="bg-gray-100">


<div id="wrapper" class="flex flex-col justify-between h-screen">

    <div class="bg-white py-4 shadow dark:bg-gray-800">
        <div class="max-w-6xl mx-auto">
            <div class="flex items-center lg:justify-between justify-around">
                <a href="/login">
                    <img src=" http://demo.foxthemes.net/instellohtml/assets/images/logo.png" alt="" class="w-32">
                </a>

                <div class="capitalize flex font-semibold hidden lg:block my-2 space-x-3 text-center text-sm">
                    <a href="/login" class="py-3 px-4">Login</a>
                    <a href="/register" class="bg-pink-500 pink-500 px-6 py-3 rounded-md shadow text-white">Register</a>
                </div>

            </div>
        </div>
    </div>

    <!-- Content-->
    <div style="margin-bottom: 50%; margin-left: 50%">
        <div class="lg:p-12 max-w-md max-w-xl lg:my-0 my-12 mx-auto p-6 space-y-">
            <h1 class="lg:text-3xl text-xl font-semibold  mb-6"> Log in</h1>
            <h4>${mess}</h4>
            <p class="mb-2 text-black text-lg"> Email or Username</p>
            <form action="/login" method="post">
                <input type="text" placeholder="Username"
                       class="bg-gray-200 mb-2 shadow-none dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;"
                       name="username">
                <input type="password" placeholder="Password" class="bg-gray-200 mb-2 shadow-none dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;"
                       name="password">
                <div class="flex justify-between my-4">
                    <div class="checkbox">
                        <input type="checkbox" id="chekcbox1" checked>
                        <label for="chekcbox1"><span class="checkbox-icon"></span>Remember Me</label>
                    </div>
                    <a href="/resetpass"> Forgot Your Password? </a>
                </div>
                <button type="submit"
                        class="bg-gradient-to-br from-pink-500 py-3 rounded-md text-white text-xl to-red-400 w-full">
                    Login
                </button>

            </form>
            <div class="text-center mt-5 space-x-2">
                <p class="text-base"> Not registered? <a href="/register" class=""> Create a account </a></p>
            </div>
        </div>
    </div>


</div>
</body>
</html>