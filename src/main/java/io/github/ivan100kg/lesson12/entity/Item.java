package io.github.ivan100kg.lesson12.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OptimisticLock;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;
    @Column(name = "val")
    int val;
    @Column(name = "junkField")
    @OptimisticLock(excluded = true)
    int junkField;
    @Version
    long version;

    public void setVal(int val) {
        this.val = val;
    }

    public long getVersion() {
        return version;
    }
}
