package com.saulodev.domain.enuns;

public enum Status {
	
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");
	
	private Integer codigo;
	private String descricao;
	
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Perfil x: Perfil.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}	
		}
		throw new IllegalArgumentException("Status invalido!");
	}
}
