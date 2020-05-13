package br.com.senai.fatesg.primefaces.util;

import br.com.senai.fatesg.primefaces.controle.CadastradosControl;
import br.com.senai.fatesg.primefaces.entidade.Cadastrados;
import br.com.senai.fatesg.primefaces.entidade.TipoCadastrado;
import br.com.senai.fatesg.primefaces.persistencia.TipoCadastradosDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.ArrayList;
import java.util.List;

@FacesConverter("cadastradosConverter")
public class CadastradosConverter implements Converter {

    TipoCadastradosDao dao;

    public String getAsString(FacesContext context, UIComponent component,
                              Object value) {
        if (value == null || value=="") {
            return null;
        }

        TipoCadastrado tipo = (TipoCadastrado) value;

        return tipo.getId()+";"+tipo.getTipo()+";";
    }

    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {
        if (value == null) {
            return null;
        }
            String[] tudo = value.split(";");
            int id = Integer.parseInt(tudo[0]);
            String tipo = tudo[1];

            return new TipoCadastrado(id,tipo);

    }
}