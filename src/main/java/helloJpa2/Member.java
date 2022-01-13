package helloJpa2;

import javax.persistence.*;
import java.util.Date;

/* jpa 사용 시 Entity 사용
*  @Entity(name = "") 가능
*  @Table(name = "MBR") MBR 테이블에 매핑됨
*  @Column(name = "")
* */
@Entity
public class Member {
    @Id
    private Long id;
    @Column(name = "name",  updatable = false)
    private String username;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob
    private String description;
    // @Transient 는 디비와 연관 안되게
    public Member() {
    }
}
