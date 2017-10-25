import entities.FunctionaryEntity;
import entities.ProductEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utils.HibernateUtil;
import vision.JFrameManager;

public class VendaMoveis {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            ourSessionFactory = configuration.configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        FunctionaryEntity functionaryEntity = s.get(FunctionaryEntity.class, "0");
        s.getTransaction().commit();

//        JFrameViewProduct jFrameViewProduct = new JFrameViewProduct(product);
        JFrameManager jFrameManager = new JFrameManager(functionaryEntity);

        final Session session = getSession();
        try {
//            System.out.println("querying all the managed entities...");
//            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
        } finally {
            session.close();
        }
    }
}