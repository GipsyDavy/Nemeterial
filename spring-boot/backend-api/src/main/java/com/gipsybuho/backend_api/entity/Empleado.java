package entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String Nombre;

    @Column(nullable = false, length = 100)
    private String Apellidos;

    @Column(nullable = false, length = 100)
    private String DNI;

    @Column(nullable = false, length = 100)
    private String Rol;

    @Column(name = "passwordHash", nullable = false, length = 255)
    private String passwordHash;

    @OneToMany(mappedBy = "empleado")
    private List<Registro> registros;

}
