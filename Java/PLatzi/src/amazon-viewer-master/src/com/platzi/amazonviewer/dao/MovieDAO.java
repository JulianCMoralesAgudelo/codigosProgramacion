package com.platzi.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.platzi.amazonviewer.db.IDBConnection;
import com.platzi.amazonviewer.model.Movie;
import static com.platzi.amazonviewer.db.DataBase.*;

public interface MovieDAO extends IDBConnection {
	
	@SuppressWarnings("finally")
	default Movie setMovieViewed(Movie movie) {
		try (Connection connection = connectToDB()) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Statement statement = connection.createStatement();
			String query = "INSERT INTO " + TVIEWED + 
					" (" + TVIEWED_IDMATERIAL + ", " + TVIEWED_IDELEMENT + ", " + TVIEWED_IDUSUARIO + ", " + TVIEWED_DATE + ")" +
					" VALUES (" + TMATERIALS_ID[0] + ", " + movie.getId() + ", " + TUSER_IDUSUARIO + ", '" + dateFormat.format(new Date()) + "');";
			
			if (statement.executeUpdate(query) > 0) System.out.println("Se marcó en visto");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return movie;
		}
	}
	
	@SuppressWarnings("finally")
	default ArrayList<Movie> getMoviesViewedByDate(Date date) {
		ArrayList<Movie> movies = new ArrayList<>();
		String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		try (Connection connection = connectToDB()) {
			String query = "SELECT * FROM " + TMOVIE + " AS m INNER JOIN " + TVIEWED +
					" AS v ON m." + TMOVIE_ID + " = v." + TVIEWED_IDELEMENT +
					" WHERE v." + TVIEWED_IDMATERIAL + " = " + TMATERIALS_ID[0] +
					" AND v." + TVIEWED_IDUSUARIO + " = " + TUSER_IDUSUARIO +
					" AND DATE(v.`" + TVIEWED_DATE + "`) = '" + dateFormat + "';";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Movie movie = new Movie(
						resultSet.getString("m." + TMOVIE_TITLE),
						resultSet.getString("m." + TMOVIE_GENRE),
						resultSet.getString("m." + TMOVIE_CREATOR),
						resultSet.getInt("m." + TMOVIE_DURATION),
						resultSet.getShort("m." + TMOVIE_YEAR));
				
				movie.setId(resultSet.getInt("m." + TMOVIE_ID));
				movie.setViewed(true);
				movies.add(movie);
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return movies;			
		}
	}
	
	/**
	 * Retorna todas las Movies existentes.
	 * Si encuentra algún registro en la tabla {@code viewed} la marca como vista.
	 * @return movies Objeto {@code ArrayList}.
	 */
	@SuppressWarnings("finally")
	default ArrayList<Movie> read() {
		ArrayList<Movie> movies = new ArrayList<>();
		
		try (Connection connection = connectToDB()) {
			String query = "SELECT * FROM " + TMOVIE + ";";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Movie movie = new Movie(
						resultSet.getString(TMOVIE_TITLE),
						resultSet.getString(TMOVIE_GENRE),
						resultSet.getString(TMOVIE_CREATOR),
						resultSet.getInt(TMOVIE_DURATION),
						resultSet.getShort(TMOVIE_YEAR));
				
				movie.setId(resultSet.getInt(TMOVIE_ID));
				movie.setViewed(this.getMovieViewedById(preparedStatement, connection, movie.getId()));
				movies.add(movie);
			}
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return movies;
		}
	}
	
	/**
	 * Método que recibe el {@code idMovie}, lo consulta en la tabla {@code viewed} y si encuentra algún registro, retorna {@code true}.
	 * @param preparedStatement objeto {@code PreparedStatement} que ejecuta el query.
	 * @param connection objeto {@code Connection} que recibe la conexión a la BD.
	 * @param idMovie dato {@code int} que recibe el id del Movie.
	 * @return Dato {@code boolean}. Retorna {@code true} si encuentra algún registro y {@code false} si no encuentra registros. 
	 */
	@SuppressWarnings("finally")
	private boolean getMovieViewedById(PreparedStatement preparedStatement, Connection connection, int idMovie) {
		boolean viewed = false;
		String query = "SELECT * FROM " + TVIEWED +
				" WHERE " + TVIEWED_IDMATERIAL + " = ?" +
				" AND " + TVIEWED_IDELEMENT + " = ?" +
				" AND " + TVIEWED_IDUSUARIO + " = ?;";
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, TMATERIALS_ID[0]);
			preparedStatement.setInt(2, idMovie);
			preparedStatement.setInt(3, TUSER_IDUSUARIO);
			
			resultSet = preparedStatement.executeQuery();
			viewed = resultSet.next();
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return viewed;
		}
	}
}