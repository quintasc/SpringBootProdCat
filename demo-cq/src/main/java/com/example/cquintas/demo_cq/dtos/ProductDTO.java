package com.example.cquintas.demo_cq.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
        private Integer id;
        private String nombre;
        private float precio;
        private String nombtreCategoria;
}
