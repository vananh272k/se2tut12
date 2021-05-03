package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Booking;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table booking in the database
 */
public class BookingDAO {

	public BookingDAO() {
	}

	public List<Booking> selectAllBookings() {

		List<Booking> bookings = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_BOOKINGS = "SELECT * FROM booking";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOKINGS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String start_date_time = rs.getString("start_date_time");
				String stop_date_time = rs.getString("stop_date_time");
				String payed = rs.getString("payed");
				bookings.add(new Booking(id, start_date_time, stop_date_time, payed));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookings;
	}
}
