package br.com.ibm;

import br.com.ibm.models.Carro;
import br.com.ibm.models.Moto;
import br.com.ibm.models.Veiculo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ExemploServlet", urlPatterns = {"/exemplo"})
public class ExemploServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        List<Veiculo> veiculos = Main.main();

        String veiculo = request.getParameter("veiculo");

        if (veiculo != null) {
            if ("carros".equals(veiculo.toLowerCase())) {
                List<String> carros = veiculos.stream()
                        .filter(veiculoArray -> veiculoArray instanceof Carro)
                        .map(veiculoArray -> veiculoArray.getMarca() + " " + veiculoArray.getModelo())
                        .collect(Collectors.toList());

                request.setAttribute("veiculos", carros);
            } else if ("motos".equals(veiculo.toLowerCase())) {
                List<String> motos = veiculos.stream()
                        .filter(veiculoArray -> veiculoArray instanceof Moto)
                        .map(veiculoArray -> veiculoArray.getMarca() + " " + veiculoArray.getModelo())
                        .collect(Collectors.toList());

                request.setAttribute("veiculos", motos);
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/exemplo.jsp");
        dispatcher.forward(request, response);
    }
}