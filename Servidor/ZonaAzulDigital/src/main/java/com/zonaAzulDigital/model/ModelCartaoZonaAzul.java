/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zonaAzulDigital.model;

import com.zonaAzulDigital.Excecao.DaoException;
import com.zonaAzulDigital.entidades.CartaoZonaAzul;
import com.zonaAzulDigital.entidades.Placa;
import com.zonaAzulDigital.model.DAO.DaoCartoZonaAzulBD;
import com.zonaAzulDigital.model.DAO.DaoPlacaBD;
import com.zonaAzulDigital.model.DAO.interfaces.DAOCartaoZonaAzul;
import com.zonaAzulDigital.model.DAO.interfaces.DAOPlaca;

/**
 *
 * @author JonasJr
 */
public class ModelCartaoZonaAzul implements Model<CartaoZonaAzul>{

    @Override
    public CartaoZonaAzul cadastrar(CartaoZonaAzul objeto) throws DaoException {
        DAOCartaoZonaAzul daoCartaoZonaAzul = new DaoCartoZonaAzulBD();
        objeto =(CartaoZonaAzul) daoCartaoZonaAzul.cadastrar(objeto);
        return objeto;
    }

    @Override
    public CartaoZonaAzul atualizar(CartaoZonaAzul objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CartaoZonaAzul recuperar(CartaoZonaAzul objeto) throws DaoException {
        DAOCartaoZonaAzul daoCartaoZonaAzul = new DaoCartoZonaAzulBD();
        objeto = (CartaoZonaAzul) daoCartaoZonaAzul.recuperarPorId(objeto.getNumero());
        return objeto;
    }
    public CartaoZonaAzul recuperarUltimo(Placa placa) throws DaoException {
        DAOPlaca daoPlaca = new DaoPlacaBD();
       
        placa = daoPlaca.recuperar(placa.getLetras(), placa.getNumeros());
        
        CartaoZonaAzul cartaoZonaAzul = new CartaoZonaAzul();
        DAOCartaoZonaAzul daoCartaoZonaAzul = new DaoCartoZonaAzulBD();
        cartaoZonaAzul = (CartaoZonaAzul) daoCartaoZonaAzul.recuperarUltimo(placa);
        return cartaoZonaAzul;
    }
    

    @Override
    public CartaoZonaAzul deletar(CartaoZonaAzul objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}