package edu.tainan.collections.map;

import java.util.Objects;

public class Convidado {
  // Atributos
  private String nome;
  private int codigoConvite;

  // Construtor
  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  // Getter
  public String getNome() {
    return nome;
  }

  // Getter
  public int getCodigoConvite() {
    return codigoConvite;
  }

  // Comparator do set
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  // Comparator do set
  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  // To string
  @Override
  public String toString() {
    return "Convidado{" +
        "nome='" + nome + '\'' +
        ", codigoConvite=" + codigoConvite +
        '}';
  }
}
