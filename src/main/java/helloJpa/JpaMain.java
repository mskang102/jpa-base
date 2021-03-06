package helloJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("hello");
//            em.persist(member);
//            Member findMember = em.find(Member.class,1L);
//            System.out.println(findMember.getName());
//            findMember.setName("HelloJpa"); //update jpa가 값이 변경된걸 인식해서 업데이트 함
            // jpql
            List<Member> result = em.createQuery("select m from Member1 as m",Member.class).getResultList();

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
