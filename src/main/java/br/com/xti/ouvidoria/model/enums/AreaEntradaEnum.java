/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.ouvidoria.model.enums;

/**
 *
 * @author marcos.ribeiro
 */
public enum AreaEntradaEnum {

    PAGINA_ELETRONICA(1,"Página eletrônica da Cultura"); //representa o registro no banco de dados referente ao valor padrao de AREA ENTRADA para o cadastro de uma manifestacao
    
    private Integer id;
    private String descricao;

    private AreaEntradaEnum(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    

}
