<?php
    //INTEGRANTES:
    //NOEL DEL ROSARIO
    //MANUEL LOPEZ
    //HENDRY MARTINEZ
    //CHRISTOPHER REYES

    $FtpServer = "127.0.0.1";
    $FtpUser = "FtpUser";
    $FtpPassword = "12345678";
    $ConnectionId = ftp_connect($FtpServer);
    $LoginResult = ftp_login($ConnectionId, $FtpUser, $FtpPassword);

    if((!$ConnectionId)||(!$LoginResult)) {
        echo "¡ALGO PASO, NO SE PUDO CONECTAR AL SERVIDOR FTP!";
        exit;
    } else {
        echo "¡ESTAS CONECTADO AL SERVIDOR FTP!";

        $Temp = explode(".", $_FILES['file']['name']);
        $SourceFile = $_FILES['file']['tmp_name'];
        $Directory = "drawer";
        $FileName = $_FILES["file"]['name'];

        $Uploaded = ftp_put($ConnectionId, $Directory.'/'.$FileName, $SourceFile, FTP_BINARY);
        
        if($Uploaded){
            echo "¡ARCHIVO SUBIDO CON EXITO!";
            header("Location: files.php");
        } else {
            echo "¡HUBO UN ERROR!";
        }
    }
?>