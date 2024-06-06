<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'PHPMailer/Exception.php';
require 'PHPMailer/PHPMailer.php';
require 'PHPMailer/SMTP.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recopilar los datos del formulario
    $presupuesto = $_POST["presupuesto"];

    // Configurar PHPMailer
    $mail = new PHPMailer(true);
    try {
        // Configuraciones del servidor SMTP
        $mail->isSMTP();
        $mail->Host       = 'smtp.example.com';
        $mail->SMTPAuth   = true;
        $mail->Username   = 'karencarrillo.bcc@gmail.com';
        $mail->Password   = '123454321';
        $mail->SMTPSecure = PHPMailer::ENCRYPTION_STARTTLS;
        $mail->Port       = 587;

        // Configuraciones del mensaje
        $mail->setFrom('karencarrillo.bcc@gmail.com', 'Daniela carrillo');
        $mail->addAddress('karencarrillo.bcc@gmail.com');
        $mail->Subject = 'Nueva adquisición registrada';
        $mail->Body    = "Nueva adquisición registrada:\nPresupuesto: $presupuesto";

        // Recopilar los documentos adjuntos
        $documentos = $_FILES["documentacion"];
        foreach ($documentos['tmp_name'] as $key => $tmp_name) {
            $mail->addAttachment($tmp_name, $documentos['name'][$key]);
        }

        // Enviar correo electrónico
        $mail->send();
        echo "Correo enviado correctamente";
    } catch (Exception $e) {
        echo "Error al enviar el correo: {$mail->ErrorInfo}";
    }
}

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

// Incluir la biblioteca de PHPMailer
require 'ruta/a/PHPMailer.php';
require 'ruta/a/SMTP.php';
require 'ruta/a/Exception.php';

// Instanciar PHPMailer
$mail = new PHPMailer(true);

// Habilitar el modo depurador
$mail->SMTPDebug = SMTP::DEBUG_SERVER;



API

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recopilar los datos del formulario
    $presupuesto = $_POST["presupuesto"];
    $unidad = $_POST["unidad"];
    $tipo = $_POST["tipo"];
    $cantidad = $_POST["cantidad"];
    $valorUnitario = $_POST["valorUnitario"];
    $valorTotal = $_POST["valorTotal"];
    $fecha = $_POST["fecha"];
    $proveedor = $_POST["proveedor"];

    // Aquí puedes realizar cualquier validación adicional de los datos recibidos

    // Simplemente devuelve los datos como respuesta por ahora
    $response = array(
        "success" => true,
        "message" => "Adquisición registrada exitosamente",
        "data" => array(
            "presupuesto" => $presupuesto,
            "unidad" => $unidad,
            "tipo" => $tipo,
            "cantidad" => $cantidad,
            "valorUnitario" => $valorUnitario,
            "valorTotal" => $valorTotal,
            "fecha" => $fecha,
            "proveedor" => $proveedor
        )
    );

    // Devuelve la respuesta como JSON
    header('Content-Type: application/json');
    echo json_encode($response);
} else {
    // Si la solicitud no es POST, devuelve un error
    http_response_code(405);
    echo json_encode(array("error" => "Método no permitido"));
}
?>







?>











