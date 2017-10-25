package controllers;

import dao.ReplenishmentDAO;
import entities.ReplenishmentEntity;
import utils.HibernateUtil;

import java.sql.SQLData;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReplenishmentController {

    private ReplenishmentDAO replenishmentDAO = new ReplenishmentDAO(HibernateUtil.getSessionFactory(), ReplenishmentEntity.class);
    private ReplenishmentEntity replenishmentEntity = new ReplenishmentEntity();

    public String checkValid() {

        if (replenishmentEntity.getDateCreated().before(new Date()))
            return "Data de criação";
        if (replenishmentEntity.getDateAttended().after(new Date()))
            return "Data de atendimento";
        return null;

    }

    public String setReplenishmentValues(String id, String dateCreated, String dateAttended, int status) throws ParseException {

        if ("".equals(dateCreated))
            return "Data de criação";
        else if ("".equals(dateAttended))
            return "Data de atendimento";

        replenishmentEntity.setId(id);
        replenishmentEntity.setDateCreated(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(dateCreated).getTime()));
        replenishmentEntity.setDateAttended(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(dateAttended).getTime()));
        replenishmentEntity.setStatus(status);
        return null;
    }

    public String persist() {
        return replenishmentDAO.create(replenishmentEntity);
    }

    public List listAll() {
        return replenishmentDAO.listAll();
    }

    public String update() {
        return replenishmentDAO.update(replenishmentEntity);
    }

    public List listAllOrdered() {
        return replenishmentDAO.listAllOrdered();
    }

    public List listOrderItems() {
        return replenishmentDAO.listAllItems();
    }

    public int isProcessed(ReplenishmentEntity selected) {
        return selected.getStatus();
    }
}
