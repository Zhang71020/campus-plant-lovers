import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private List<Comment> comments = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Comment>> getAllComments() {
        return ResponseEntity.ok(comments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getCommentById(@PathVariable int id) {
        if (id < 0 || id >= comments.size()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(comments.get(id));
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        comments.add(comment);
        return ResponseEntity.status(201).body(comment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable int id, @RequestBody Comment comment) {
        if (id < 0 || id >= comments.size()) {
            return ResponseEntity.notFound().build();
        }
        comments.set(id, comment);
        return ResponseEntity.ok(comment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable int id) {
        if (id < 0 || id >= comments.size()) {
            return ResponseEntity.notFound().build();
        }
        comments.remove(id);
        return ResponseEntity.noContent().build();
    }
}

class Comment {
    private String user;
    private String message;

    // Getters and Setters
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}