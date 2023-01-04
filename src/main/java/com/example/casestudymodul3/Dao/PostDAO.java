package com.example.casestudymodul3.Dao;

import com.example.casestudymodul3.model.Post;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostDAO {
    private static Connection connection = ConnectionMySql.getconnection();



    public static List<Post> showpostbyusername(int idaccounts) {
        List<Post> postsbyusname = new ArrayList<>();
        String selectAllPost = "SELECT* from posts  WHERE idaccounts = "+idaccounts;

        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(selectAllPost);
            while (rs.next()) {
                int idPost = rs.getInt("idposts");

                String content = rs.getString("content");
                String img = rs.getString("img");
                Date time = rs.getDate("time");
                int likecount = rs.getInt("likecount");

                postsbyusname.add(new Post(idPost, content, img, time, likecount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postsbyusname;
    }



    public static void deletePost(int idPost)  {
        String sql1 = "SET FOREIGN_KEY_CHECKS=OFF;";
        String deletePost = "delete from posts where idposts = " + idPost;
        String sql2 = "SET FOREIGN_KEY_CHECKS=ON;";

        try {
            Statement statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(deletePost);
            statement.execute(sql2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
