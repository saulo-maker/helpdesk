package com.saulodev.domain.enuns;

public enum Prioridade {
	
	BAIXA(0, "ROLE_ADMIN"), MEDIA(1, "ROLE_CLIENTE"), ALTA(2, "ROLE_TECNICO");
	
	private Integer codigo;
	private String descricao;
	
	private Prioridade(Integer codigo, String descricao) {
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
		throw new IllegalArgumentException("Prioridade invalida!");
	}
}
