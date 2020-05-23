package progavanzada.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import progavanzada.model.Estudiante;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String HomePage() {
		return "home";
	}

	@RequestMapping(value = "/detalle")
	public String Datos(Model modelo) {
		String nombre = "Juan";
		int edad = 19;
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("edad", edad);
		return "detalle";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Principal(Model model) {
		List<Estudiante> estudiantes = listaEstudiantes();
		model.addAttribute("estudiantes", estudiantes);
		return "home";
	}

	public List<Estudiante> listaEstudiantes() {
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("Juan", "Guzman", "Bogota", 1);
		Estudiante e2 = new Estudiante("Camila", "Wynnie", "Debajo de un puente", 2);
		estudiantes.add(e1);
		estudiantes.add(e2);
		return estudiantes;
	}
}
