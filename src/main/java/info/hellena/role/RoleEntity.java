package info.hellena.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "roles")
public class RoleEntity implements Role {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "role", nullable = false)
    private String role;


    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return userId.equals(that.userId) && role.equals(that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, role);
    }
}
