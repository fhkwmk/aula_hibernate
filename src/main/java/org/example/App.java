package org.example;

import org.example.entity.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class    App
{
    public static void main( String[] args )

    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aula_jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Usuario usuario = new Usuario();
        usuario.setCodigo(1L);
        usuario.setNome("Fabiano");
        usuario.setSenha("123");

        entityManager.persist(usuario);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();



        System.out.println( "Hello World!" );
    }


}


