package com.examination;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {

    public void insert(Question q) throws Exception {
        String sql = "INSERT INTO questions VALUES (?, ?, ?)";
        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, q.getId());
            ps.setString(2, q.getName());
            ps.setInt(3, q.getPoints());

            ps.executeUpdate();
        }
    }

    public List<Question> findAll() throws Exception {
        List<Question> list = new ArrayList<>();
        String sql = "SELECT * FROM questions";
        try (Connection c = DB.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Question(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("points")
                ));
            }
        }
        return list;
    }

    public void updatePoints(int id, int points) throws Exception {
        String sql = "UPDATE questions SET points=? WHERE id=?";
        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, points);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    public void delete(int id) throws Exception {
        String sql = "DELETE FROM questions WHERE id=?";
        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
