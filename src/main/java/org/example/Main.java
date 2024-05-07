package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persist");
//        EntityManager entityManager = factory.createEntityManager();
//        Admin admin = new Admin();
//        admin.setId(1L);
//        admin.setUserName("admin");
//        admin.setPassword("d033e22ae348aeb5660fc2140aec35850c4da997");
//        entityManager.getTransaction().begin();
//        entityManager.persist(admin);
//        entityManager.getTransaction().commit();
//        entityManager.close();


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new LoginForm().setVisible(true);
        /* Create and display the form */

    }
}
