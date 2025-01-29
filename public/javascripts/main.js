document.addEventListener("DOMContentLoaded", function () {
    console.log("JavaScript cargado correctamente.");

    document.getElementById("miFormulario").addEventListener("submit", function (event) {


        let nombre = document.getElementById("nombre").value.trim();
        let edad = document.getElementById("edad").value;
        let mensajeError = document.getElementById("mensajeError");


        // Limpiar mensajes anteriores
        mensajeError.textContent = "";

        if (nombre === "") {
            mensajeError.textContent = "El nombre no puede estar vacío.";
            event.preventDefault();
            return;
        }

        if (isNaN(edad) || edad < 1 || edad > 100) {
            mensajeError.textContent = "La edad debe estar entre 1 y 100.";
            event.preventDefault();
            return;
        }

        alert("Formulario enviado correctamente.");
    });
});
