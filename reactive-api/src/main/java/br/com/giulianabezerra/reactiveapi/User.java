package br.com.giulianabezerra.reactiveapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public record User(
    @Id Long id, String username, String password, String email) {
}
