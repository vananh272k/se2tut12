package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Room;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table room in the database
 */
public class RoomDAO {

	public RoomDAO() {
	}

	public List<Room> selectAllRooms() {

		List<Room> rooms = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_ROOMS = "SELECT * FROM room";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ROOMS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id_number = rs.getInt("id_number");
				int grace_period_hours = rs.getInt("grace_period_hours");
				int fixed_booking_charge = rs.getInt("fixed_booking_charge");
				rooms.add(new Room(id_number, grace_period_hours, fixed_booking_charge));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rooms;
	}
}
