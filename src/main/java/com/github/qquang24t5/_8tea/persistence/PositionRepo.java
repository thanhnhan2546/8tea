package com.github.qquang24t5._8tea.persistence;

import com.github.qquang24t5._8tea.transference.Position;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;

public class PositionRepo extends Repo {

    public List<Position> getAll() {

        Session s = database.openSession();
        Transaction t = s.beginTransaction();
        TypedQuery<Position> q = s.createQuery("FROM Position", Position.class);
        List<Position> p = q.getResultList();
        t.commit();
        s.close();
        return p;
    }

    public Position getById(Integer id) {
        Session s = database.openSession();
        Transaction t = s.beginTransaction();
        TypedQuery<Position> q = s.createQuery("FROM Position WHERE id = :id", Position.class);
        q.setParameter("id", id);
        Position p = (Position) q.getResultList().get(0);
        t.commit();
        s.close();
        return p;
    }

}
