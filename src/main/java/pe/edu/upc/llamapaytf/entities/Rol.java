package pe.edu.upc.llamapaytf.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"})})
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Rol_id;
    @Column(nullable = false)
    private String TipoRol;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int rol_id) {
        Rol_id = rol_id;
    }

    public String getTipoRol() {
        return TipoRol;
    }

    public void setTipoRol(String tipoRol) {
        TipoRol = tipoRol;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
