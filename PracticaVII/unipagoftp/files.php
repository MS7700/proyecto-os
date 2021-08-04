<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ARCHIVOS EN EL SERVIDOR FTP</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<?php  $files = scandir("./drawer"); ?>

<div class="container mt-5">
    <h3>ARCHIVOS EN EL SERVIDOR FTP</h3>
    <ul class="list-group">
        <?php
            for ($i=2; $i < count($files); $i++) {
                echo '<li class="list-group-item">'.$files[$i].'</li>';
            } 
        ?>
    </ul>
    <div class="mt-3">
        <a class="btn btn-primary" href="/">SUBIR OTRO ARCHIVO</a>
    </div>
</div>


</body>
</html>