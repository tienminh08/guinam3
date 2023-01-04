package com.example.casestudymodul3.Service;

import com.example.casestudymodul3.Dao.PostDAO;
import com.example.casestudymodul3.model.Post;

import java.util.List;

public class PostsService {
    public static List<Post> showpostbyusername(int idaccounts) {
        return   PostDAO.showpostbyusername(idaccounts);
    }
    public static void deletePost(int id)  {
        PostDAO.deletePost(id);
    }
}
