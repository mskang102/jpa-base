package helloJpa1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaEx1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            Member member = new Member();
            member.setId(101L);
            member.setName("hello");
            // 영속성 컨텍스트 등록 1차캐시
            em.persist(member);
            // 영속성 컨텍스트로 인해 select 쿼리는 나오지않고 1차캐시에서 찾음
            Member result =  em.find(Member.class,101L);
            // jpa는 값을 변경하면 자동으로 인지해서 update를 함
            result.setName("changeHello");

            //em.flush(); 커밋 순간 호출 됨. sql을 디비에 보냄, jpql 자동호출
            // 커밋하는 순간 SQL 보냄
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
