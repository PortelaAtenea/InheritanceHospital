

import Herencia_Integer.*;
import Herencia_Joined.*;
import Herencia_Table.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Planta p1 = new Planta();
        Direccion d1= new Direccion("Isaac Peral","36201");
        Celador c01= new Celador("39458864H",154525,"Alberto",d1,545443,45);
        Limpieza l1 = new Limpieza("39458864H",154525,"Sergio",d1,545443,21);
        Consulta c1 = new Consulta();
        p1.addLimp(l1);
        p1.addCons(c1);

        Planta2 p2 = new Planta2();
        Direccion2 d2= new Direccion2("dasd","dsa");
        Celador2 c02= new Celador2("39458864H",154525,"Alberto",d2,545443,32);
        Limpieza2 l2 = new Limpieza2("39458864H",154525,"Sergio",d2,545443,32);
        Consulta2 c2 = new Consulta2();
        p2.addLimp(l2);
        p2.addCons(c2);

        Planta3 p3 = new Planta3();
        Direccion3 d3= new Direccion3("dasd","dsa");
        Direccion3 d31= new Direccion3("calle centrar","123456");
        Celador3 c03= new Celador3("39458864H",154525,"Alberto",d3,545443,32);
        Limpieza3 l3 = new Limpieza3("39458864H",154525,"Sergio",d3,545443,32);
        Limpieza3 l4 = new Limpieza3("123456789456",123456,"Sergiito",d3,456789456,100000);

        Limpieza3 l31 = new Limpieza3("36925814L",456789,"Señor de la limpieza",d31,123456789,756);
        Consulta3 c3 = new Consulta3();
        p3.addLimp(l3);
        p3.addLimp(l31);
        p3.addCons(c3);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = start(emf);
        em.getTransaction().begin();
        em.persist(l1);
        em.persist(c1);
        em.persist(p1);
        em.persist(c01);
        em.persist(l2);
        em.persist(c2);
        em.persist(p2);
        em.persist(c02);
        em.persist(l3);
        em.persist(c3);
        em.persist(l31);
        em.persist(p3);
        em.persist(c03);


        commit(emf, em);
    }

    public static void commit(EntityManagerFactory emf, EntityManager em) {
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    public static EntityManager start(EntityManagerFactory emf) {

        return emf.createEntityManager();
    }
}
