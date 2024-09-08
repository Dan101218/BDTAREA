package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private Long id;
	
	
	@Column(name = "fecha_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_registro;
	
	
	@Column(name = "fecha_devolucion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_devolucion;
	
	
	@Column(name = "fecha_entrega")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_entrega;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Clientes clientes;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuarios usuarios;
	
	@ManyToOne
	@JoinColumn(name = "peliculas_id", nullable = false)
	private Peliculas peliculas;

}
