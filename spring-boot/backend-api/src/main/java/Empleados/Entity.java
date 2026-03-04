package Empleados;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "empleados")
@Data               // Lombok: genera getters, setters, toString, equals, hashCode
@NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String password;  // ¡Guarda siempre el hash! (usa BCrypt más adelante)

    @Column(length = 50)
    private String rol;       // Ej: "ADMIN", "EMPLEADO"

    // Relación: un empleado puede tener muchos registros/préstamos
    @OneToMany(mappedBy = "empleado")
    private List<Registro> registros;

    // Constructor con campos principales (opcional)
    public Empleado(String nombre, String email, String password, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
}
