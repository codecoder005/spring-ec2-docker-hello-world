package com.orgofarmsgroup.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        name = "users"
)
public class UserEntity {
    @Id
    private Long uid;
    private String name;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserEntity that = (UserEntity) o;
        return getUid() != null && Objects.equals(getUid(), that.getUid());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
