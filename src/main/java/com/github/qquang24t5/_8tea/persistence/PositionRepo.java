package com.github.qquang24t5._8tea.persistence;

import com.github.qquang24t5._8tea.transference.Position;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.util.List;

public class PositionRepo extends Repo {

    /**
     * Truy vấn tất cả {@code Position}
     * @return danh sách tất cả các {@code Position}, danh sách rỗng nếu như bảng không có dữ liệu
     */
    public List<Position> getAll() {
        Session s = database.openSession();
        Transaction t = s.beginTransaction();
        TypedQuery<Position> q = s.createQuery("FROM Position", Position.class);
        List<Position> p = q.getResultList();
        t.commit();
        s.close();
        return p;
    }

    /**
     * Truy vấn {@code Position} bằng {@code id}
     * @param id id truy vấn
     * @return {@code Position} với id đã cho, null nếu id đã cho không tồn tại
     */
    public Position getById(Integer id) {
        Session s = database.openSession();
        Transaction t = s.beginTransaction();
        TypedQuery<Position> q = s.createQuery("FROM Position WHERE id = :id", Position.class);
        q.setParameter("id", id);
        List<Position> p = q.getResultList();
        t.commit();
        s.close();

        if (p.isEmpty()) {
            return null;
        } else {
            return p.get(0);
        }

    }

}
