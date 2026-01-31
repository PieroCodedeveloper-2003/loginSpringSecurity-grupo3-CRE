package com.grupo3.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera automáticamente getters, setters, toString, equals y hashCode
@AllArgsConstructor // Crea un constructor con todos los atributos
@NoArgsConstructor // Crea un constructor vacío
@Entity // Indica que esta clase será una tabla en la base de datos
@Table(name = "tbl_usuario") // Nombre de la tabla en la base de datos
public class Usuario {

    @Id // Define la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementa el ID en la BD

    @Column(name = "id_usuario") // Nombre de la columna en la tabla
    private Long idUsuario;

    @Column(unique = true, nullable = false) // usuario único y obligatorio
    private String username;

    @Column(nullable = false) // contraseña obligatoria y será encriptada con BCrypt
    private String password;

    // Rol del usuario USER o ADMIN para controlar su acceso, este campo será obligatorio.
    @Column(nullable = false)
    private String role;

}
