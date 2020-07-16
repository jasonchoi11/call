package rental_private;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Call_table")
public class Call {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist(){
        CallSurveyed callSurveyed = new CallSurveyed();
        BeanUtils.copyProperties(this, callSurveyed);
        callSurveyed.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}