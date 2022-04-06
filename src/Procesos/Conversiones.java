/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Informacion.Datos;
import com.google.gson.Gson;

/**
 *
 * @author hazae
 */
public class Conversiones {
    
    public String cjson(Datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
    }
    
    public Datos cDTA(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena, Datos.class);
    }
}
