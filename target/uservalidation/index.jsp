<!DOCTYPE html>
<html lang="en">

<!-- This is the login form that loads when visiting the app -->

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <form action="Validate" method="post">
        <table>
            <tr>
                <td>Username :</td>
                <td><input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input type="password" name="pass"></td>
            </tr>
        </table>
        <button type="submit">Submit</button>
    </form>
</body>

</html>