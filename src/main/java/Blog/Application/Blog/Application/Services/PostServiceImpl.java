package Blog.Application.Blog.Application.Services;


import Blog.Application.Blog.Application.Entity.Post;
import Blog.Application.Blog.Application.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.AttributeNotFoundException;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getallPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) throws AttributeNotFoundException {
        return postRepository.findById(id).orElseThrow(()-> new AttributeNotFoundException("POST NOT FOUND BY "+id));
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Post post1 = postRepository.findById(id).get();
        post1.setImage(post.getImage());
        post1.setContent(post.getContent());
        post1.setName(post.getName());
        post1.setTags(post.getTags());
        post1.setDate(new Date());
        return postRepository.save(post1);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
