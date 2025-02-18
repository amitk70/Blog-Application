package Blog.Application.Blog.Application.Services;

import Blog.Application.Blog.Application.Entity.Post;
import org.springframework.stereotype.Service;

import javax.management.AttributeNotFoundException;
import java.util.List;

@Service
public interface PostService {

    public Post savePost(Post post);

    public List<Post> getallPost();

    public Post getPostById(Long id) throws AttributeNotFoundException;

    public Post updatePost(Long id, Post post);

    public void deletePost(Long id);
}
