package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result error(String message  ) {
        return ok(views.html.error.render(message));
    }

    public Result about() {
        return ok(views.html.about.render());
    }

    // ✅ Recibe Http.Request y lo usa correctamente
    public Result procesarFormulario(Http.Request request) {
        try {
            String nombre = request.body().asFormUrlEncoded().get("nombre")[0];
            String edad = request.body().asFormUrlEncoded().get("edad")[0];
            String precio = request.body().asFormUrlEncoded().get("precio")[0];

            return ok("Formulario recibido: Nombre=" + nombre + ", Edad=" + edad + ", Precio=" + precio);
        } catch (Exception e) {
            return redirect(routes.HomeController.error("Error al procesar el formulario."));
        }
    }

    public Result mi_page(Http.Request request) {
        try {
            String nombre = request.getQueryString("nombre");

            if (nombre == null || nombre.isEmpty()) {
                return redirect(routes.HomeController.error("No se ha proporcionado un nombre."));
            }
            return ok(views.html.mi_page.render(nombre));
        } catch (Exception e) {
            return redirect(routes.HomeController.error("Error al procesar el formulario."));
        }
    }
}
