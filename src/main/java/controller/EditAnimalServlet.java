package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ZooAnimals;

/**
 * Servlet implementation class EditAnimalServlet
 */
@WebServlet("/EditAnimalServlet")
public class EditAnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAnimalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ZooAnimalHelper dao = new ZooAnimalHelper();
		
		String species = request.getParameter("species");
		String name = request.getParameter("name");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		ZooAnimals animalToUpdate = dao.searchForAnimalById(tempId);
		animalToUpdate.setSpecies(species);
		animalToUpdate.setName(name);
		
		dao.updateAnimal(animalToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllAnimalsServlet").forward(request, response);
	}

}