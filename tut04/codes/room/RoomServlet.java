package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RoomDAO;
import model.Room;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the room.
 */

@WebServlet("/")
public class RoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoomDAO roomDAO;

	public void init() {
		roomDAO = new RoomDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listRoom(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listRoom(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Room> listRoom = roomDAO.selectAllRooms();
		request.setAttribute("listRoom", listRoom);
		RequestDispatcher dispatcher = request.getRequestDispatcher("room-list.jsp");
		dispatcher.forward(request, response);
	}
}
