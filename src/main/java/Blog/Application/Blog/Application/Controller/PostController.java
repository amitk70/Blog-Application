package Blog.Application.Blog.Application.Controller;


import Blog.Application.Blog.Application.Entity.Post;
import Blog.Application.Blog.Application.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class PostController {

    
    private final PostService postService;
    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("/posts")
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }
}


