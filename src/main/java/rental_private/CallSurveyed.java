package rental_private;

public class CallSurveyed extends AbstractEvent {

    private Long id;
    private String requestYn;

    public CallSurveyed(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRequestYn() {
        return requestYn;
    }

    public void setRequestYn(String requestYn) {
        this.requestYn = requestYn;
    }
}
