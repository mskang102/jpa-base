package jpaRelation;

import javax.persistence.*;

/* jpa 사용 시 Entity 사용
*  @Entity(name = "") 가능
*  @Table(name = "MBR") MBR 테이블에 매핑됨
*  @Column(name = "")
* */
@Entity
public class Member1 {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
