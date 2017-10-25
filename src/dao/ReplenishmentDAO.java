package dao;

import com.sun.istack.internal.Nullable;
import entities.ReplenishmentEntity;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ReplenishmentDAO extends AbstractDAO<ReplenishmentEntity> {

    public ReplenishmentDAO(SessionFactory sessionFactory, Class<?> abstractDAO) {
        super(sessionFactory, abstractDAO);
    }

    public String create(ReplenishmentEntity order) {
        try {
            persist(order);
            return "O produto foi salvo com sucesso.";
        } catch (Exception e) {
            return "Ocorreu um erro durante a persitência do pedido de reposição no banco de dados.";
        }
    }

    public Optional<ReplenishmentEntity> findById(String orderId) {
        return Optional.ofNullable(this.get(orderId));
    }

    public List listAll() {
        return list(ReplenishmentEntity.class);
    }

    public List listAllOrdered() {
        return listAllOrdered("from ReplenishmentEntity order by dataPed");
    }

    public String update(String orderId, @Nullable Date datePed, @Nullable Date dateAttended) {

        Optional<ReplenishmentEntity> order = findById(orderId);

        if (order.isPresent()) {
            ReplenishmentEntity orderEntity = order.get();
            if (datePed != null) orderEntity.setDateCreated((java.sql.Date) datePed);
            if (dateAttended != null) orderEntity.setDateAttended((java.sql.Date) dateAttended);
            persist(orderEntity);
            return "Pedido atualizado com sucesso.";
        }

        return "Ocorreu um erro durante a atualização do pedido.";

    }

    public String update(ReplenishmentEntity order) {

        Optional<ReplenishmentEntity> orderOptional = findById(order.getId());

        if (orderOptional.isPresent()) {
            persist(order);
            return "Produto atualizado com sucesso.";
        }

        return "Ocorreu um erro durante a atualização do produto.";

    }

    public void delete(String id) {
        Optional<ReplenishmentEntity> order = findById(id);
        order.ifPresent(orderEntity -> remove());
    }

    public List listAllItems() {
        return listAllOrdered("from ReplenishmentEntity re, ReplenishmentItemEntity rei where re.id = rei.orderId");
    }
}
