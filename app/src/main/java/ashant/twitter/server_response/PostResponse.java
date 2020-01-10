package ashant.twitter.server_response;

public class PostResponse {
    private String status;

    public PostResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
