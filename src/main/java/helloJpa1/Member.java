package helloJpa1;

import javax.persistence.Entity;
import javax.persistence.Id;
/* jpa 사용 시 Entity 사용
*  @Entity(name = "") 가능
*  @Table(name = "MBR") MBR 테이블에 매핑됨
*  @Column(name = "")
* */
@Entity
public class Member {
    @Id
    private Long id;
    private String name;

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Member() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
