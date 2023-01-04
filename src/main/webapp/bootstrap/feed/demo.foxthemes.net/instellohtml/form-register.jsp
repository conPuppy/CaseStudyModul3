<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.foxthemes.net/instellohtml/form-register.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 29 Dec 2022 04:43:07 GMT -->
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

    <!-- header-->
    <div class="bg-white py-4 shadow dark:bg-gray-800">
        <div class="max-w-6xl mx-auto">


            <div class="flex items-center lg:justify-between justify-around">

                <a href="trending.html">
                    <img src="http://demo.foxthemes.net/instellohtml/assets/images/logo.png" alt="" class="w-32">
                </a>

                <div class="capitalize flex font-semibold hidden lg:block my-2 space-x-3 text-center text-sm">
                    <a href="/login" class="py-3 px-4">Login</a>
                    <a href="/register" class="bg-pink-500 pink-500 px-6 py-3 rounded-md shadow text-white">Register</a>
                </div>

            </div>
        </div>
    </div>

    <!-- Content-->

    <div>
        <div class="lg:p-12 max-w-md max-w-xl lg:my-0 my-12 mx-auto p-6 space-y-">
            <h1 class="lg:text-3xl text-xl font-semibold mb-6"> Sign in</h1>
            <p class="mb-2 text-black text-lg"> Register to manage your account </p>

            <h6>${mess}</h6>

            <form method="post" action="/register">
                <div class="flex lg:flex-row flex-col lg:space-x-2">

                    <input type="text" name="fullname" placeholder="FullName"
                           class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                           style="border: 1px solid #d3d5d8 !important;">
                </div>
                <input type="text" name="username" placeholder="Username (more than 6 characters)"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">
                <input type="password" name="password" placeholder="Password (6 - 20 characters)"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">
                <input type="password" name="repassword" placeholder="Confirm Password (6 - 20 characters)"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">
                <input type="text" name="email" placeholder="Email"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">
                <input type="text" name="phonenumber" placeholder="Phone Number"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">


                <input type="text" name="address" placeholder="Address"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">

                <input type="text" name="avatarurl" placeholder="Avatar"
                       class="bg-gray-200 mb-2 shadow-none  dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;">



                <div class="flex justify-start my-4 space-x-1">
                    <div class="checkbox">
                        <input type="checkbox" id="chekcbox1" checked>
                        <label for="chekcbox1"><span class="checkbox-icon"></span> I Agree</label>
                    </div>
                    <a href="#"> Terms and Conditions</a>
                </div>
                <button type="submit"
                        class="bg-gradient-to-br from-pink-500 py-3 rounded-md text-white text-xl to-red-400 w-full">
                    Register
                </button>

            </form>
            <div class="text-center mt-5 space-x-2">
                <p class="text-base"> Do you have an account? <a href="/login"> Login </a></p>
            </div>
        </div>
    </div>


</div>

</body>

</html>